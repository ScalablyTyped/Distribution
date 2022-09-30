package typings.chartist

import typings.chartist.anon.Bottom
import typings.chartist.anon.Dir
import typings.chartist.anon.EaseInBack
import typings.chartist.anon.FillHoles
import typings.chartist.anon.Height
import typings.chartist.anon.High
import typings.chartist.anon.Len
import typings.chartist.anon.PartialChartPadding
import typings.chartist.anon.Value
import typings.chartist.anon.X
import typings.chartist.axisMod.AxisUnits_
import typings.chartist.barChartTypesMod.BarChartData
import typings.chartist.barChartTypesMod.BarChartOptions
import typings.chartist.cardinalMod.CardinalInterpolationOptions
import typings.chartist.chartistBooleans.`false`
import typings.chartist.chartistBooleans.`true`
import typings.chartist.chartistStrings.areaBase
import typings.chartist.chartistStrings.axisX
import typings.chartist.chartistStrings.axisY
import typings.chartist.chartistStrings.chartPadding
import typings.chartist.chartistStrings.classNames
import typings.chartist.chartistStrings.fullWidth
import typings.chartist.chartistStrings.height
import typings.chartist.chartistStrings.high
import typings.chartist.chartistStrings.lineSmooth
import typings.chartist.chartistStrings.low
import typings.chartist.chartistStrings.plugins
import typings.chartist.chartistStrings.referenceValue
import typings.chartist.chartistStrings.reverseData
import typings.chartist.chartistStrings.showArea
import typings.chartist.chartistStrings.showGridBackground
import typings.chartist.chartistStrings.showLine
import typings.chartist.chartistStrings.showPoint
import typings.chartist.chartistStrings.width
import typings.chartist.coreTypesMod.AllSeriesTypes
import typings.chartist.coreTypesMod.AxisName
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.Bounds
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.Data
import typings.chartist.coreTypesMod.FlatSeries
import typings.chartist.coreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.coreTypesMod.FlatSeriesValue
import typings.chartist.coreTypesMod.Label
import typings.chartist.coreTypesMod.Multi
import typings.chartist.coreTypesMod.NormalizedData
import typings.chartist.coreTypesMod.NormalizedFlatSeries
import typings.chartist.coreTypesMod.NormalizedSeries
import typings.chartist.coreTypesMod.Options
import typings.chartist.coreTypesMod.ResponsiveOptions
import typings.chartist.coreTypesMod.Segment
import typings.chartist.coreTypesMod.SegmentData
import typings.chartist.coreTypesMod.Series
import typings.chartist.coreTypesMod.SeriesObject
import typings.chartist.coreTypesMod.SeriesPrimitiveValue
import typings.chartist.lineChartTypesMod.LineChartData
import typings.chartist.lineChartTypesMod.LineChartOptions
import typings.chartist.lineChartTypesMod.LineChartOptionsWithDefaults
import typings.chartist.monotoneCubicMod.MonotoneCubicInterpolationOptions
import typings.chartist.noneMod.NoneInterpolationOptions
import typings.chartist.optionsProviderMod.OptionsProvider_
import typings.chartist.pieChartTypesMod.AnchorPosition
import typings.chartist.pieChartTypesMod.Dot
import typings.chartist.pieChartTypesMod.LabelDirection
import typings.chartist.pieChartTypesMod.PieChartData
import typings.chartist.pieChartTypesMod.PieChartOptions
import typings.chartist.simpleMod.SimpleInteractionOptions
import typings.chartist.stepMod.StepInterpolationOptions
import typings.chartist.svgTypesMod.Attributes
import typings.chartist.svgTypesMod.SvgPathOptions
import typings.std.ArrayLike
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chartist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chartist", "AutoScaleAxis")
  @js.native
  open class AutoScaleAxis protected ()
    extends typings.chartist.axesMod.AutoScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  @JSImport("chartist", "Axis")
  @js.native
  abstract class Axis protected ()
    extends typings.chartist.axesMod.Axis {
    def this(units: AxisUnits_, chartRect: ChartRect, ticks: js.Array[Label]) = this()
  }
  
  @JSImport("chartist", "BarChart")
  @js.native
  open class BarChart protected ()
    extends typings.chartist.chartsMod.BarChart {
    /**
      * This method creates a new bar chart and returns API object that you can use for later changes.
      * @param query A selector query string or directly a DOM element
      * @param data The data object that needs to consist of a labels and a series array
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      * @return An object which exposes the API for the created chart
      *
      * @example
      * // Create a simple bar chart
      * const data = {
      *   labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri'],
      *   series: [
      *     [5, 2, 4, 2, 0]
      *   ]
      * };
      *
      * // In the global name space Chartist we call the Bar function to initialize a bar chart. As a first parameter we pass in a selector where we would like to get our chart created and as a second parameter we pass our data object.
      * new BarChart('.ct-chart', data);
      *
      * @example
      * // This example creates a bipolar grouped bar chart where the boundaries are limitted to -10 and 10
      * new BarChart('.ct-chart', {
      *   labels: [1, 2, 3, 4, 5, 6, 7],
      *   series: [
      *     [1, 3, 2, -5, -3, 1, -6],
      *     [-5, -2, -4, -1, 2, -3, 1]
      *   ]
      * }, {
      *   seriesBarDistance: 12,
      *   low: -10,
      *   high: 10
      * });
      *
      */
    def this(query: String, data: BarChartData) = this()
    def this(query: Null, data: BarChartData) = this()
    def this(query: Element, data: BarChartData) = this()
    def this(query: String, data: BarChartData, options: BarChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Null, data: BarChartData, options: BarChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Element, data: BarChartData, options: BarChartOptions[AxisOptions, AxisOptions]) = this()
    def this(
      query: String,
      data: BarChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: String,
      data: BarChartData,
      options: BarChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: BarChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: BarChartData,
      options: BarChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: BarChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: BarChartData,
      options: BarChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
  }
  
  @JSImport("chartist", "BaseChart")
  @js.native
  abstract class BaseChart[TEventsTypes] protected ()
    extends typings.chartist.chartsMod.BaseChart[TEventsTypes] {
    def this(
      query: String,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: Null,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: Element,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: String,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
  }
  
  @JSImport("chartist", "EPSILON")
  @js.native
  val EPSILON: /* 2.221e-16 */ Double = js.native
  
  @JSImport("chartist", "EventEmitter")
  @js.native
  open class EventEmitter ()
    extends typings.chartist.eventMod.EventEmitter
  
  @JSImport("chartist", "FixedScaleAxis")
  @js.native
  open class FixedScaleAxis protected ()
    extends typings.chartist.axesMod.FixedScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  object Interpolation {
    
    @JSImport("chartist", "Interpolation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cardinal(): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardinal")().asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    inline def cardinal(options: CardinalInterpolationOptions): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardinal")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    
    inline def monotoneCubic(): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("monotoneCubic")().asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    inline def monotoneCubic(options: MonotoneCubicInterpolationOptions): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("monotoneCubic")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    
    inline def none(): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    inline def none(options: NoneInterpolationOptions): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    
    inline def simple(): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")().asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    inline def simple(options: SimpleInteractionOptions): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    
    inline def step(): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("step")().asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
    inline def step(options: StepInterpolationOptions): js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
        /* pathCoordinates */ js.Array[Double], 
        /* valueData */ js.Array[SegmentData], 
        typings.chartist.svgMod.SvgPath
      ]]
  }
  
  @JSImport("chartist", "LineChart")
  @js.native
  open class LineChart protected ()
    extends typings.chartist.chartsMod.LineChart {
    /**
      * This method creates a new line chart.
      * @param query A selector query string or directly a DOM element
      * @param data The data object that needs to consist of a labels and a series array
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      * @return An object which exposes the API for the created chart
      *
      * @example
      * // Create a simple line chart
      * const data = {
      *   // A labels array that can contain any sort of values
      *   labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri'],
      *   // Our series array that contains series objects or in this case series data arrays
      *   series: [
      *     [5, 2, 4, 2, 0]
      *   ]
      * };
      *
      * // As options we currently only set a static size of 300x200 px
      * const options = {
      *   width: '300px',
      *   height: '200px'
      * };
      *
      * // In the global name space Chartist we call the Line function to initialize a line chart. As a first parameter we pass in a selector where we would like to get our chart created. Second parameter is the actual data object and as a third parameter we pass in our options
      * new LineChart('.ct-chart', data, options);
      *
      * @example
      * // Use specific interpolation function with configuration from the Chartist.Interpolation module
      *
      * const chart = new LineChart('.ct-chart', {
      *   labels: [1, 2, 3, 4, 5],
      *   series: [
      *     [1, 1, 8, 1, 7]
      *   ]
      * }, {
      *   lineSmooth: Chartist.Interpolation.cardinal({
      *     tension: 0.2
      *   })
      * });
      *
      * @example
      * // Create a line chart with responsive options
      *
      * const data = {
      *   // A labels array that can contain any sort of values
      *   labels: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday'],
      *   // Our series array that contains series objects or in this case series data arrays
      *   series: [
      *     [5, 2, 4, 2, 0]
      *   ]
      * };
      *
      * // In addition to the regular options we specify responsive option overrides that will override the default configutation based on the matching media queries.
      * const responsiveOptions = [
      *   ['screen and (min-width: 641px) and (max-width: 1024px)', {
      *     showPoint: false,
      *     axisX: {
      *       labelInterpolationFnc: function(value) {
      *         // Will return Mon, Tue, Wed etc. on medium screens
      *         return value.slice(0, 3);
      *       }
      *     }
      *   }],
      *   ['screen and (max-width: 640px)', {
      *     showLine: false,
      *     axisX: {
      *       labelInterpolationFnc: function(value) {
      *         // Will return M, T, W etc. on small screens
      *         return value[0];
      *       }
      *     }
      *   }]
      * ];
      *
      * new LineChart('.ct-chart', data, null, responsiveOptions);
      *
      */
    def this(query: String, data: LineChartData) = this()
    def this(query: Null, data: LineChartData) = this()
    def this(query: Element, data: LineChartData) = this()
    def this(query: String, data: LineChartData, options: LineChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Null, data: LineChartData, options: LineChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Element, data: LineChartData, options: LineChartOptions[AxisOptions, AxisOptions]) = this()
    def this(
      query: String,
      data: LineChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: String,
      data: LineChartData,
      options: LineChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: LineChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: LineChartData,
      options: LineChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: LineChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: LineChartData,
      options: LineChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
  }
  
  @JSImport("chartist", "PieChart")
  @js.native
  open class PieChart protected ()
    extends typings.chartist.chartsMod.PieChart {
    /**
      * This method creates a new pie chart and returns an object that can be used to redraw the chart.
      * @param query A selector query string or directly a DOM element
      * @param data The data object in the pie chart needs to have a series property with a one dimensional data array. The values will be normalized against each other and don't necessarily need to be in percentage. The series property can also be an array of value objects that contain a value property and a className property to override the CSS class name for the series group.
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      *
      * @example
      * // Simple pie chart example with four series
      * new PieChart('.ct-chart', {
      *   series: [10, 2, 4, 3]
      * });
      *
      * @example
      * // Drawing a donut chart
      * new PieChart('.ct-chart', {
      *   series: [10, 2, 4, 3]
      * }, {
      *   donut: true
      * });
      *
      * @example
      * // Using donut, startAngle and total to draw a gauge chart
      * new PieChart('.ct-chart', {
      *   series: [20, 10, 30, 40]
      * }, {
      *   donut: true,
      *   donutWidth: 20,
      *   startAngle: 270,
      *   total: 200
      * });
      *
      * @example
      * // Drawing a pie chart with padding and labels that are outside the pie
      * new PieChart('.ct-chart', {
      *   series: [20, 10, 30, 40]
      * }, {
      *   chartPadding: 30,
      *   labelOffset: 50,
      *   labelDirection: 'explode'
      * });
      *
      * @example
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
  }
  
  @JSImport("chartist", "StepAxis")
  @js.native
  open class StepAxis protected ()
    extends typings.chartist.axesMod.StepAxis {
    def this(axisUnit: AxisUnits_, _data: Any, chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  @JSImport("chartist", "Svg")
  @js.native
  open class Svg protected ()
    extends typings.chartist.svgMod.Svg {
    /**
      * @param name The name of the SVG element to create or an SVG dom element which should be wrapped into Svg
      * @param attributes An object with properties that will be added as attributes to the SVG element that is created. Attributes with undefined values will not be added.
      * @param className This class or class list will be added to the SVG element
      * @param parent The parent SVG wrapper object where this newly created wrapper and it's element will be attached to as child
      * @param insertFirst If this param is set to true in conjunction with a parent element the newly created element will be added as first child element in the parent element
      */
    def this(name: String) = this()
    def this(name: Element) = this()
    def this(name: String, attributes: Attributes) = this()
    def this(name: Element, attributes: Attributes) = this()
    def this(name: String, attributes: Unit, className: String) = this()
    def this(name: String, attributes: Attributes, className: String) = this()
    def this(name: Element, attributes: Unit, className: String) = this()
    def this(name: Element, attributes: Attributes, className: String) = this()
    def this(name: String, attributes: Unit, className: String, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: String, attributes: Unit, className: Unit, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: String, attributes: Attributes, className: String, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: String, attributes: Attributes, className: Unit, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: Element, attributes: Unit, className: String, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: Element, attributes: Unit, className: Unit, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: Element, attributes: Attributes, className: String, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: Element, attributes: Attributes, className: Unit, parent: typings.chartist.svgSvgMod.Svg) = this()
    def this(name: String, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Unit,
      className: String,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: String, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Unit,
      className: Unit,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: String, attributes: Attributes, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Attributes,
      className: String,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: String, attributes: Attributes, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Attributes,
      className: Unit,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Unit,
      className: String,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Unit,
      className: Unit,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Attributes, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Attributes,
      className: String,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Attributes, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Attributes,
      className: Unit,
      parent: typings.chartist.svgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
  }
  /* static members */
  object Svg {
    
    /**
      * @todo Only there for chartist <1 compatibility. Remove after deprecation warining.
      * @deprecated Use the animation module export `easings` directly.
      */
    @JSImport("chartist", "Svg.Easing")
    @js.native
    val Easing: EaseInBack = js.native
  }
  
  @JSImport("chartist", "SvgList")
  @js.native
  open class SvgList protected ()
    extends typings.chartist.svgMod.SvgList {
    /**
      * @param nodeList An Array of SVG DOM nodes or a SVG DOM NodeList (as returned by document.querySelectorAll)
      */
    def this(nodeList: ArrayLike[Element]) = this()
  }
  
  @JSImport("chartist", "SvgPath")
  @js.native
  /**
    * Used to construct a new path object.
    * @param close If set to true then this path will be closed when stringified (with a Z at the end)
    * @param options Options object that overrides the default objects. See default options for more details.
    */
  open class SvgPath ()
    extends typings.chartist.svgMod.SvgPath {
    def this(close: Boolean) = this()
    def this(close: Boolean, options: SvgPathOptions) = this()
    def this(close: Unit, options: SvgPathOptions) = this()
  }
  /* static members */
  object SvgPath {
    
    @JSImport("chartist", "SvgPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This static function on `SvgPath` is joining multiple paths together into one paths.
      * @param paths A list of paths to be joined together. The order is important.
      * @param close If the newly created path should be a closed path
      * @param options Path options for the newly created path.
      */
    inline def join(paths: js.Array[typings.chartist.svgPathMod.SvgPath]): typings.chartist.svgPathMod.SvgPath = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[typings.chartist.svgPathMod.SvgPath]
    inline def join(paths: js.Array[typings.chartist.svgPathMod.SvgPath], close: Boolean): typings.chartist.svgPathMod.SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgPathMod.SvgPath]
    inline def join(paths: js.Array[typings.chartist.svgPathMod.SvgPath], close: Boolean, options: SvgPathOptions): typings.chartist.svgPathMod.SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgPathMod.SvgPath]
    inline def join(paths: js.Array[typings.chartist.svgPathMod.SvgPath], close: Unit, options: SvgPathOptions): typings.chartist.svgPathMod.SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgPathMod.SvgPath]
  }
  
  inline def alphaNumerate(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaNumerate")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object axisUnits {
    
    @JSImport("chartist", "axisUnits.x")
    @js.native
    val x: Dir = js.native
    
    @JSImport("chartist", "axisUnits.y")
    @js.native
    val y: Len = js.native
  }
  
  inline def createChartRect(svg: typings.chartist.svgSvgMod.Svg, options: Options[AxisOptions, AxisOptions]): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("createChartRect")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def createGrid(
    position: Double,
    index: Double,
    axis: typings.chartist.axesMod.Axis,
    offset: Double,
    length: Double,
    group: typings.chartist.svgSvgMod.Svg,
    classes: js.Array[String],
    eventEmitter: typings.chartist.eventMod.EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrid")(position.asInstanceOf[js.Any], index.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], group.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createGridBackground(
    gridGroup: typings.chartist.svgSvgMod.Svg,
    chartRect: ChartRect,
    className: String,
    eventEmitter: typings.chartist.eventMod.EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGridBackground")(gridGroup.asInstanceOf[js.Any], chartRect.asInstanceOf[js.Any], className.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createLabel(
    position: Double,
    length: Double,
    index: Double,
    label: Label,
    axis: typings.chartist.axesMod.Axis,
    axisOffset: Double,
    labelOffset: X,
    group: typings.chartist.svgSvgMod.Svg,
    classes: js.Array[String],
    eventEmitter: typings.chartist.eventMod.EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(position.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any], label.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], axisOffset.asInstanceOf[js.Any], labelOffset.asInstanceOf[js.Any], group.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSvg(container: Element): typings.chartist.svgSvgMod.Svg = ^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any]).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: String, height: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: String, height: String, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: String, height: Double): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: String, height: Double, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: String, height: Unit, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Double): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Double, height: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Double, height: String, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Double, height: Double): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Double, height: Double, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Double, height: Unit, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Unit, height: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Unit, height: String, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Unit, height: Double): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Unit, height: Double, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  inline def createSvg(container: Element, width: Unit, height: Unit, className: String): typings.chartist.svgSvgMod.Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.svgSvgMod.Svg]
  
  inline def deserialize[T /* <: js.Object | Double | String */](): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")().asInstanceOf[js.UndefOr[T | Null]]
  inline def deserialize[T /* <: js.Object | Double | String */](data: String): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T | Null]]
  
  inline def deserialize_T_T[T /* <: js.Object | Double | String */](data: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def determineAnchorPosition(center: Dot, label: Dot, direction: LabelDirection): AnchorPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("determineAnchorPosition")(center.asInstanceOf[js.Any], label.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[AnchorPosition]
  
  object easings {
    
    @JSImport("chartist", "easings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chartist", "easings.easeInBack")
    @js.native
    def easeInBack: js.Array[Double] = js.native
    inline def easeInBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInCirc")
    @js.native
    def easeInCirc: js.Array[Double] = js.native
    inline def easeInCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInCubic")
    @js.native
    def easeInCubic: js.Array[Double] = js.native
    inline def easeInCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInExpo")
    @js.native
    def easeInExpo: js.Array[Double] = js.native
    inline def easeInExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutBack")
    @js.native
    def easeInOutBack: js.Array[Double] = js.native
    inline def easeInOutBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutCirc")
    @js.native
    def easeInOutCirc: js.Array[Double] = js.native
    inline def easeInOutCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutCubic")
    @js.native
    def easeInOutCubic: js.Array[Double] = js.native
    inline def easeInOutCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutExpo")
    @js.native
    def easeInOutExpo: js.Array[Double] = js.native
    inline def easeInOutExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutQuad")
    @js.native
    def easeInOutQuad: js.Array[Double] = js.native
    inline def easeInOutQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutQuart")
    @js.native
    def easeInOutQuart: js.Array[Double] = js.native
    inline def easeInOutQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutQuint")
    @js.native
    def easeInOutQuint: js.Array[Double] = js.native
    inline def easeInOutQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInOutSine")
    @js.native
    def easeInOutSine: js.Array[Double] = js.native
    inline def easeInOutSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInQuad")
    @js.native
    def easeInQuad: js.Array[Double] = js.native
    inline def easeInQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInQuart")
    @js.native
    def easeInQuart: js.Array[Double] = js.native
    inline def easeInQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInQuint")
    @js.native
    def easeInQuint: js.Array[Double] = js.native
    inline def easeInQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeInSine")
    @js.native
    def easeInSine: js.Array[Double] = js.native
    inline def easeInSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutBack")
    @js.native
    def easeOutBack: js.Array[Double] = js.native
    inline def easeOutBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutCirc")
    @js.native
    def easeOutCirc: js.Array[Double] = js.native
    inline def easeOutCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutCubic")
    @js.native
    def easeOutCubic: js.Array[Double] = js.native
    inline def easeOutCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutExpo")
    @js.native
    def easeOutExpo: js.Array[Double] = js.native
    inline def easeOutExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutQuad")
    @js.native
    def easeOutQuad: js.Array[Double] = js.native
    inline def easeOutQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutQuart")
    @js.native
    def easeOutQuart: js.Array[Double] = js.native
    inline def easeOutQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutQuint")
    @js.native
    def easeOutQuint: js.Array[Double] = js.native
    inline def easeOutQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist", "easings.easeOutSine")
    @js.native
    def easeOutSine: js.Array[Double] = js.native
    inline def easeOutSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutSine")(x.asInstanceOf[js.Any])
  }
  
  inline def ensureUnit[T](value: T, unit: String): String | T = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureUnit")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String | T]
  
  @JSImport("chartist", "escapingMap")
  @js.native
  val escapingMap: Record[String, String] = js.native
  
  inline def extend[T](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def extend[T, A](target: T, a: A): T & A = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[T & A]
  inline def extend[T, A, B](target: T, a: A, b: B): T & A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T & A & B]
  
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double, onlyInteger: Boolean): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any], onlyInteger.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions]): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[High]
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions], dimension: AxisName): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[High]
  
  inline def getMetaData(seriesData: FlatSeriesValue[FlatSeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetaData(seriesData: SeriesObject[SeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetaData(seriesData: Series[SeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMultiValue(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Any, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Double, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Multi): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Multi, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getNumberOrUndefined(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getNumberOrUndefined(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSeriesOption[T /* <: /* keyof chartist.anon.OmitLineChartOptionsWithD */ plugins | width | height | reverseData | low | lineSmooth | showLine | high | referenceValue | showArea | showPoint | chartPadding | fullWidth | showGridBackground | axisX | axisY | areaBase | classNames */](series: SeriesObject[SeriesPrimitiveValue], options: LineChartOptionsWithDefaults, key: T): /* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeriesOption")(series.asInstanceOf[js.Any], options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any]
  inline def getSeriesOption[T /* <: /* keyof chartist.anon.OmitLineChartOptionsWithD */ plugins | width | height | reverseData | low | lineSmooth | showLine | high | referenceValue | showArea | showPoint | chartPadding | fullWidth | showGridBackground | axisX | axisY | areaBase | classNames */](series: Series[SeriesPrimitiveValue], options: LineChartOptionsWithDefaults, key: T): /* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeriesOption")(series.asInstanceOf[js.Any], options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any]
  
  inline def isArrayOfArrays(data: Any): /* is std.Array<std.Array<unknown>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<unknown>> */ Boolean]
  
  inline def isArrayOfSeries(value: Any): /* is std.Array<chartist.chartist/dist/core/types.Series<chartist.chartist/dist/core/types.SeriesPrimitiveValue> | chartist.chartist/dist/core/types.SeriesObject<chartist.chartist/dist/core/types.SeriesPrimitiveValue>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfSeries")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<chartist.chartist/dist/core/types.Series<chartist.chartist/dist/core/types.SeriesPrimitiveValue> | chartist.chartist/dist/core/types.SeriesObject<chartist.chartist/dist/core/types.SeriesPrimitiveValue>> */ Boolean]
  
  inline def isDataHoleValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataHoleValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFalseyButZero(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalseyButZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultiValue(value: Any): /* is chartist.chartist/dist/core/types.Multi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chartist.chartist/dist/core/types.Multi */ Boolean]
  
  inline def isNumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Double): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[`true`]
  
  @JSImport("chartist", "namespaces")
  @js.native
  val namespaces: Record[String, String] = js.native
  
  inline def noop[T](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(n.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ]
  ): NormalizedData[NormalizedFlatSeries] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any]).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean
  ): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Unit,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Boolean, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Unit, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Boolean,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Unit,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def normalizePadding(): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")().asInstanceOf[Bottom]
  inline def normalizePadding(padding: Double): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  inline def normalizePadding(padding: PartialChartPadding): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def optionsProvider[T](options: T, responsiveOptions: Unit, eventEmitter: typings.chartist.eventMod.EventEmitter): OptionsProvider_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProvider")(options.asInstanceOf[js.Any], responsiveOptions.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[OptionsProvider_[T]]
  inline def optionsProvider[T](
    options: T,
    responsiveOptions: ResponsiveOptions[T],
    eventEmitter: typings.chartist.eventMod.EventEmitter
  ): OptionsProvider_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProvider")(options.asInstanceOf[js.Any], responsiveOptions.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[OptionsProvider_[T]]
  
  inline def orderOfMagnitude(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("orderOfMagnitude")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInDegrees: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[X]
  
  @JSImport("chartist", "precision")
  @js.native
  val precision: /* 8 */ Double = js.native
  
  inline def projectLength(axisLength: Double, length: Double, bounds: Bounds): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("projectLength")(axisLength.asInstanceOf[js.Any], length.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantity[T](input: T): typings.chartist.anon.Unit | Value = ^.asInstanceOf[js.Dynamic].applyDynamic("quantity")(input.asInstanceOf[js.Any]).asInstanceOf[typings.chartist.anon.Unit | Value]
  
  inline def rho(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rho")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def roundWithPrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundWithPrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def roundWithPrecision(value: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundWithPrecision")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def safeHasProperty[T, K /* <: String */](target: T, property: K): /* is chartist.chartist/dist/utils/types.FilterByKey<T, K> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safeHasProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* is chartist.chartist/dist/utils/types.FilterByKey<T, K> */ Boolean]
  
  inline def serialMap[T, K](array: js.Array[js.Array[T]], callback: js.Function1[/* repeated */ T, K]): js.Array[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("serialMap")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[K]]
  
  inline def serialize(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: Any): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serialize_Union(data: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: js.Object): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: Double): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData]): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData], options: FillHoles): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  
  inline def sum(previous: Double, current: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def times[T](length: Double): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("times")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
