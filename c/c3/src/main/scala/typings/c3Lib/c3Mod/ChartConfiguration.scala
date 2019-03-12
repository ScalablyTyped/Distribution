package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartConfiguration extends js.Object {
  var area: js.UndefOr[c3Lib.Anon_Zerobased] = js.undefined
  var axis: js.UndefOr[Axis] = js.undefined
  var bar: js.UndefOr[c3Lib.Anon_Space] = js.undefined
  /**
    * The CSS selector or the element which the chart will be set to. D3 selection object can be specified. If other chart is set already, it will be replaced with the new one (only one chart
    * can be set in one element).
    * If this option is not specified, the chart will be generated but not be set. Instead, we can access the element by chart.element and set it by ourselves.
    * Note: When chart is not binded, c3 starts observing if chart.element is binded by MutationObserver. In this case, polyfill is required in IE9 and IE10 becuase they do not support
    * MutationObserver. On the other hand, if chart always will be binded, polyfill will not be required because MutationObserver will never be called.
    */
  var bindto: js.UndefOr[
    java.lang.String | stdLib.HTMLElement | (d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, _, _]) | scala.Null
  ] = js.undefined
  var color: js.UndefOr[c3Lib.Anon_Pattern] = js.undefined
  var data: Data
  var donut: js.UndefOr[c3Lib.Anon_ExpandLabel] = js.undefined
  var gauge: js.UndefOr[c3Lib.Anon_ExpandFullCircle] = js.undefined
  var grid: js.UndefOr[Grid] = js.undefined
  var interaction: js.UndefOr[c3Lib.Anon_Enabled] = js.undefined
  var legend: js.UndefOr[LegendOptions] = js.undefined
  var line: js.UndefOr[c3Lib.Anon_ConnectNull] = js.undefined
  /**
    * Set a callback to execute when the chart is initialized.
    */
  var oninit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set a callback to execute when mouse leaves the chart.
    */
  var onmouseout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set a callback to execute when mouse enters the chart.
    */
  var onmouseover: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set a callback which is executed when the chart is rendered. Basically, this callback will be called in each time when the chart is redrawed.
    */
  var onrendered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set a callback to execute when user resizes the screen.
    */
  var onresize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set a callback to execute when screen resize finished.
    */
  var onresized: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var padding: js.UndefOr[c3Lib.Anon_Bottom] = js.undefined
  var pie: js.UndefOr[c3Lib.Anon_Expand] = js.undefined
  var point: js.UndefOr[PointOptions] = js.undefined
  /**
    * Show rectangles inside the chart.
    * This option accepts array including object that has axis, start, end and class. The keys start, end and class are optional.
    * axis must be x, y or y2. start and end should be the value where regions start and end. If not specified, the edge values will be used. If timeseries x axis, date string, Date object and
    * unixtime integer can be used. If class is set, the region element will have it as class.
    */
  var regions: js.UndefOr[js.Array[RegionOptions]] = js.undefined
  var resize: js.UndefOr[c3Lib.Anon_Auto] = js.undefined
  var size: js.UndefOr[c3Lib.Anon_Height] = js.undefined
  var spline: js.UndefOr[c3Lib.Anon_Interpolation] = js.undefined
  var subchart: js.UndefOr[SubchartOptions] = js.undefined
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
  var transition: js.UndefOr[c3Lib.Anon_Duration] = js.undefined
  var zoom: js.UndefOr[ZoomOptions] = js.undefined
}

object ChartConfiguration {
  @scala.inline
  def apply(
    data: Data,
    area: c3Lib.Anon_Zerobased = null,
    axis: Axis = null,
    bar: c3Lib.Anon_Space = null,
    bindto: java.lang.String | stdLib.HTMLElement | (d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, _, _]) = null,
    color: c3Lib.Anon_Pattern = null,
    donut: c3Lib.Anon_ExpandLabel = null,
    gauge: c3Lib.Anon_ExpandFullCircle = null,
    grid: Grid = null,
    interaction: c3Lib.Anon_Enabled = null,
    legend: LegendOptions = null,
    line: c3Lib.Anon_ConnectNull = null,
    oninit: () => scala.Unit = null,
    onmouseout: () => scala.Unit = null,
    onmouseover: () => scala.Unit = null,
    onrendered: () => scala.Unit = null,
    onresize: () => scala.Unit = null,
    onresized: () => scala.Unit = null,
    padding: c3Lib.Anon_Bottom = null,
    pie: c3Lib.Anon_Expand = null,
    point: PointOptions = null,
    regions: js.Array[RegionOptions] = null,
    resize: c3Lib.Anon_Auto = null,
    size: c3Lib.Anon_Height = null,
    spline: c3Lib.Anon_Interpolation = null,
    subchart: SubchartOptions = null,
    tooltip: TooltipOptions = null,
    transition: c3Lib.Anon_Duration = null,
    zoom: ZoomOptions = null
  ): ChartConfiguration = {
    val __obj = js.Dynamic.literal(data = data)
    if (area != null) __obj.updateDynamic("area")(area)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (bindto != null) __obj.updateDynamic("bindto")(bindto.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (donut != null) __obj.updateDynamic("donut")(donut)
    if (gauge != null) __obj.updateDynamic("gauge")(gauge)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (interaction != null) __obj.updateDynamic("interaction")(interaction)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (line != null) __obj.updateDynamic("line")(line)
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction0(oninit))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction0(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction0(onmouseover))
    if (onrendered != null) __obj.updateDynamic("onrendered")(js.Any.fromFunction0(onrendered))
    if (onresize != null) __obj.updateDynamic("onresize")(js.Any.fromFunction0(onresize))
    if (onresized != null) __obj.updateDynamic("onresized")(js.Any.fromFunction0(onresized))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (pie != null) __obj.updateDynamic("pie")(pie)
    if (point != null) __obj.updateDynamic("point")(point)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (size != null) __obj.updateDynamic("size")(size)
    if (spline != null) __obj.updateDynamic("spline")(spline)
    if (subchart != null) __obj.updateDynamic("subchart")(subchart)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[ChartConfiguration]
  }
}

