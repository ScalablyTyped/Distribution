package typings.chartist

import typings.chartist.distChartsBaseChartMod.BaseChart
import typings.chartist.distChartsPieChartPieChartDottypesMod.AnchorPosition
import typings.chartist.distChartsPieChartPieChartDottypesMod.Dot
import typings.chartist.distChartsPieChartPieChartDottypesMod.LabelDirection
import typings.chartist.distChartsPieChartPieChartDottypesMod.PieChartData
import typings.chartist.distChartsPieChartPieChartDottypesMod.PieChartEventsTypes
import typings.chartist.distChartsPieChartPieChartDottypesMod.PieChartOptions
import typings.chartist.distChartsPieChartPieChartDottypesMod.PieChartOptionsWithDefaults
import typings.chartist.distCoreTypesMod.ResponsiveOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsPieChartPieChartMod {
  
  @JSImport("chartist/dist/charts/PieChart/PieChart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chartist/dist/charts/PieChart/PieChart", "PieChart")
  @js.native
  open class PieChart protected () extends BaseChart[PieChartEventsTypes] {
    /**
      * This method creates a new pie chart and returns an object that can be used to redraw the chart.
      * @param query A selector query string or directly a DOM element
      * @param data The data object in the pie chart needs to have a series property with a one dimensional data array. The values will be normalized against each other and don't necessarily need to be in percentage. The series property can also be an array of value objects that contain a value property and a className property to override the CSS class name for the series group.
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      *
      * @example
      * ```ts
      * // Simple pie chart example with four series
      * new PieChart('.ct-chart', {
      *   series: [10, 2, 4, 3]
      * });
      * ```
      *
      * @example
      * ```ts
      * // Drawing a donut chart
      * new PieChart('.ct-chart', {
      *   series: [10, 2, 4, 3]
      * }, {
      *   donut: true
      * });
      * ```
      *
      * @example
      * ```ts
      * // Using donut, startAngle and total to draw a gauge chart
      * new PieChart('.ct-chart', {
      *   series: [20, 10, 30, 40]
      * }, {
      *   donut: true,
      *   donutWidth: 20,
      *   startAngle: 270,
      *   total: 200
      * });
      * ```
      *
      * @example
      * ```ts
      * // Drawing a pie chart with padding and labels that are outside the pie
      * new PieChart('.ct-chart', {
      *   series: [20, 10, 30, 40]
      * }, {
      *   chartPadding: 30,
      *   labelOffset: 50,
      *   labelDirection: 'explode'
      * });
      * ```
      *
      * @example
      * ```ts
      * // Overriding the class names for individual series as well as a name and meta data.
      * // The name will be written as ct:series-name attribute and the meta data will be serialized and written
      * // to a ct:meta attribute.
      * new PieChart('.ct-chart', {
      *   series: [{
      *     value: 20,
      *     name: 'Series 1',
      *     className: 'my-custom-class-one',
      *     meta: 'Meta One'
      *   }, {
      *     value: 10,
      *     name: 'Series 2',
      *     className: 'my-custom-class-two',
      *     meta: 'Meta Two'
      *   }, {
      *     value: 70,
      *     name: 'Series 3',
      *     className: 'my-custom-class-three',
      *     meta: 'Meta Three'
      *   }]
      * });
      * ```
      */
    def this(query: String, data: PieChartData) = this()
    def this(query: Null, data: PieChartData) = this()
    def this(query: Element, data: PieChartData) = this()
    def this(query: String, data: PieChartData, options: PieChartOptions) = this()
    def this(query: Null, data: PieChartData, options: PieChartOptions) = this()
    def this(query: Element, data: PieChartData, options: PieChartOptions) = this()
    def this(
      query: String,
      data: PieChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: String,
      data: PieChartData,
      options: PieChartOptions,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Null,
      data: PieChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Null,
      data: PieChartData,
      options: PieChartOptions,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Element,
      data: PieChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Element,
      data: PieChartData,
      options: PieChartOptions,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    
    /**
      * Creates the pie chart
      *
      * @param options
      */
    def createChart(options: PieChartOptionsWithDefaults): Unit = js.native
    
    /* protected */ @JSName("data")
    var data_PieChart: PieChartData = js.native
  }
  
  inline def determineAnchorPosition(center: Dot, label: Dot, direction: LabelDirection): AnchorPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("determineAnchorPosition")(center.asInstanceOf[js.Any], label.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[AnchorPosition]
}
