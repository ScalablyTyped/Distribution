package typings.c3.mod

import typings.c3.anon.Arcs
import typings.c3.anon.Auto
import typings.c3.anon.Brighten
import typings.c3.anon.Classname
import typings.c3.anon.Colors
import typings.c3.anon.Duration
import typings.c3.anon.Expand
import typings.c3.anon.Height
import typings.c3.anon.Interpolation
import typings.c3.anon.Label
import typings.c3.anon.Pattern
import typings.c3.anon.Space
import typings.c3.anon.Zerobased
import typings.d3Selection.mod.Selection_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartConfiguration extends StObject {
  
  var area: js.UndefOr[Zerobased] = js.native
  
  var axis: js.UndefOr[AxesOptions] = js.native
  
  var bar: js.UndefOr[Space] = js.native
  
  /**
    * The CSS selector or the element which the chart will be set to. D3 selection object can be specified. If other chart is set already, it will be replaced with the new one (only one chart
    * can be set in one element).
    * If this option is not specified, the chart will be generated but not be set. Instead, we can access the element by chart.element and set it by ourselves.
    * Note: When chart is not binded, c3 starts observing if chart.element is binded by MutationObserver. In this case, polyfill is required in IE9 and IE10 becuase they do not support
    * MutationObserver. On the other hand, if chart always will be binded, polyfill will not be required because MutationObserver will never be called.
    */
  var bindto: js.UndefOr[String | HTMLElement | (Selection_[_, _, _, _]) | Null] = js.native
  
  var color: js.UndefOr[Pattern] = js.native
  
  var data: Data = js.native
  
  var donut: js.UndefOr[Label] = js.native
  
  var gauge: js.UndefOr[Arcs] = js.native
  
  var grid: js.UndefOr[GridOptions] = js.native
  
  var interaction: js.UndefOr[Brighten] = js.native
  
  var legend: js.UndefOr[LegendOptions] = js.native
  
  var line: js.UndefOr[LineOptions] = js.native
  
  /**
    * Set a callback to execute when the chart is initialized.
    */
  var oninit: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  
  /**
    * Set a callback to execute when mouse leaves the chart.
    */
  var onmouseout: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  
  /**
    * Set a callback to execute when mouse enters the chart.
    */
  var onmouseover: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  
  /**
    * Set a callback which is executed when the chart is rendered. Basically, this callback will be called in each time when the chart is redrawed.
    */
  var onrendered: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  
  /**
    * Set a callback to execute when user resizes the screen.
    */
  var onresize: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  
  /**
    * Set a callback to execute when screen resize finished.
    */
  var onresized: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var pie: js.UndefOr[Expand] = js.native
  
  var point: js.UndefOr[PointOptions] = js.native
  
  /**
    * Show rectangles inside the chart.
    * This option accepts array including object that has axis, start, end and class. The keys start, end and class are optional.
    * axis must be x, y or y2. start and end should be the value where regions start and end. If not specified, the edge values will be used. If timeseries x axis, date string, Date object and
    * unixtime integer can be used. If class is set, the region element will have it as class.
    */
  var regions: js.UndefOr[js.Array[RegionOptions]] = js.native
  
  var resize: js.UndefOr[Auto] = js.native
  
  var size: js.UndefOr[Height] = js.native
  
  var spline: js.UndefOr[Interpolation] = js.native
  
  var stanford: js.UndefOr[Colors] = js.native
  
  var subchart: js.UndefOr[SubchartOptions] = js.native
  
  var svg: js.UndefOr[Classname] = js.native
  
  var title: js.UndefOr[typings.c3.anon.Padding] = js.native
  
  var tooltip: js.UndefOr[TooltipOptions] = js.native
  
  var transition: js.UndefOr[Duration] = js.native
  
  var zoom: js.UndefOr[ZoomOptions] = js.native
}
object ChartConfiguration {
  
  @scala.inline
  def apply(data: Data): ChartConfiguration = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartConfiguration]
  }
  
  @scala.inline
  implicit class ChartConfigurationMutableBuilder[Self <: ChartConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: Zerobased): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setAxis(value: AxesOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBar(value: Space): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setBindto(value: String | HTMLElement | (Selection_[_, _, _, _])): Self = StObject.set(x, "bindto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindtoNull: Self = StObject.set(x, "bindto", null)
    
    @scala.inline
    def setBindtoUndefined: Self = StObject.set(x, "bindto", js.undefined)
    
    @scala.inline
    def setColor(value: Pattern): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonut(value: Label): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    @scala.inline
    def setGauge(value: Arcs): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeUndefined: Self = StObject.set(x, "gauge", js.undefined)
    
    @scala.inline
    def setGrid(value: GridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setInteraction(value: Brighten): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    @scala.inline
    def setLegend(value: LegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLine(value: LineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOninit(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = StObject.set(x, "oninit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    @scala.inline
    def setOnrendered(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = StObject.set(x, "onrendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnrenderedUndefined: Self = StObject.set(x, "onrendered", js.undefined)
    
    @scala.inline
    def setOnresize(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
    
    @scala.inline
    def setOnresized(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = StObject.set(x, "onresized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresizedUndefined: Self = StObject.set(x, "onresized", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPie(value: Expand): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieUndefined: Self = StObject.set(x, "pie", js.undefined)
    
    @scala.inline
    def setPoint(value: PointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[RegionOptions]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: RegionOptions*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setResize(value: Auto): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpline(value: Interpolation): Self = StObject.set(x, "spline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplineUndefined: Self = StObject.set(x, "spline", js.undefined)
    
    @scala.inline
    def setStanford(value: Colors): Self = StObject.set(x, "stanford", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStanfordUndefined: Self = StObject.set(x, "stanford", js.undefined)
    
    @scala.inline
    def setSubchart(value: SubchartOptions): Self = StObject.set(x, "subchart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubchartUndefined: Self = StObject.set(x, "subchart", js.undefined)
    
    @scala.inline
    def setSvg(value: Classname): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    @scala.inline
    def setTitle(value: typings.c3.anon.Padding): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: TooltipOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransition(value: Duration): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setZoom(value: ZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
