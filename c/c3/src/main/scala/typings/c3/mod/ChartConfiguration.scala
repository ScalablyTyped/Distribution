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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartConfiguration extends js.Object {
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
  implicit class ChartConfigurationOps[Self <: ChartConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setArea(value: Zerobased): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setAxis(value: AxesOptions): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setBar(value: Space): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setBindto(value: String | HTMLElement | (Selection_[_, _, _, _])): Self = this.set("bindto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindto: Self = this.set("bindto", js.undefined)
    @scala.inline
    def setBindtoNull: Self = this.set("bindto", null)
    @scala.inline
    def setColor(value: Pattern): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDonut(value: Label): Self = this.set("donut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    @scala.inline
    def setGauge(value: Arcs): Self = this.set("gauge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGauge: Self = this.set("gauge", js.undefined)
    @scala.inline
    def setGrid(value: GridOptions): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setInteraction(value: Brighten): Self = this.set("interaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteraction: Self = this.set("interaction", js.undefined)
    @scala.inline
    def setLegend(value: LegendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLine(value: LineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setOninit(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = this.set("oninit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOninit: Self = this.set("oninit", js.undefined)
    @scala.inline
    def setOnmouseout(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseover(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnrendered(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = this.set("onrendered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnrendered: Self = this.set("onrendered", js.undefined)
    @scala.inline
    def setOnresize(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = this.set("onresize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    @scala.inline
    def setOnresized(value: js.ThisFunction0[/* this */ ChartInternal, Unit]): Self = this.set("onresized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnresized: Self = this.set("onresized", js.undefined)
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPie(value: Expand): Self = this.set("pie", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePie: Self = this.set("pie", js.undefined)
    @scala.inline
    def setPoint(value: PointOptions): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: RegionOptions*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[RegionOptions]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    @scala.inline
    def setResize(value: Auto): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpline(value: Interpolation): Self = this.set("spline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpline: Self = this.set("spline", js.undefined)
    @scala.inline
    def setStanford(value: Colors): Self = this.set("stanford", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStanford: Self = this.set("stanford", js.undefined)
    @scala.inline
    def setSubchart(value: SubchartOptions): Self = this.set("subchart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubchart: Self = this.set("subchart", js.undefined)
    @scala.inline
    def setSvg(value: Classname): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setTitle(value: typings.c3.anon.Padding): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: TooltipOptions): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTransition(value: Duration): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setZoom(value: ZoomOptions): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

