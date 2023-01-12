package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.scatter
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.ActiveElement
import typings.chartJs.mod.AnimationsSpec
import typings.chartJs.mod.ChartEvent
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.CoreInteractionOptions
import typings.chartJs.mod.ElementOptionsByType
import typings.chartJs.mod.PluginOptionsByType
import typings.chartJs.mod.ScaleOptionsByType
import typings.chartJs.mod.Scriptable
import typings.chartJs.mod.ScriptableContext
import typings.chartJs.mod.TransitionsSpec
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chart.js.chart.js.CoreChartOptions<'scatter'> & chart.js.chart.js.ElementChartOptions<'scatter'> & chart.js.chart.js.PluginChartOptions<'scatter'> & chart.js.chart.js.DatasetChartOptions<chart.js.chart.js.ChartType> & chart.js.chart.js.ScaleChartOptions<'scatter'> & chart.js.chart.js.ScatterControllerChartOptions */
trait CoreChartOptionsscatterEl extends StObject {
  
  var animation: `false` | AnimationSpecscatteronPro
  
  var animations: AnimationsSpec[scatter]
  
  /**
    * Canvas aspect ratio (i.e. width / height, a value of 1 representing a square canvas). Note that this option is ignored if the height is explicitly defined either as attribute or via the style.
    * @default 2
    */
  var aspectRatio: Double
  
  /**
    * base background color
    * @see Defaults.backgroundColor
    */
  var backgroundColor: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]]
  
  var bar: Datasets
  
  /**
    * base border color
    * @see Defaults.borderColor
    */
  var borderColor: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]]
  
  var bubble: DatasetsBubbleControllerDatasetOptions
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  /**
    * base color
    * @see Defaults.color
    */
  var color: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]]
  
  var datasets: keyinChartTypeChartTypeReBar
  
  /**
    * Override the window's default devicePixelRatio.
    * @default window.devicePixelRatio
    */
  var devicePixelRatio: Double
  
  var doughnut: DatasetsDoughnutControllerDatasetOptions
  
  var elements: ElementOptionsByType[scatter]
  
  /**
    * The events option defines the browser events that the chart should listen to for tooltips and hovering.
    * @default ['mousemove', 'mouseout', 'click', 'touchstart', 'touchmove']
    */
  var events: js.Array[
    /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.chartJs.chartJsStrings.fullscreenchange, typings.chartJs.chartJsStrings.fullscreenerror, typings.chartJs.chartJsStrings.copy */ Any
  ]
  
  /**
    * base font
    * @see Defaults.font
    */
  var font: PartialFontSpec
  
  var hover: CoreInteractionOptions
  
  /**
    * The base axis of the chart. 'x' for vertical charts and 'y' for horizontal charts.
    * @default 'x'
    */
  var indexAxis: x | y
  
  var interaction: CoreInteractionOptions
  
  var layout: PartialautoPaddingbooleanAutoPaddingPadding
  
  var line: `1`
  
  /**
    * Locale used for number formatting (using `Intl.NumberFormat`).
    * @default user's browser setting
    */
  var locale: String
  
  /**
    * Maintain the original canvas aspect ratio (width / height) when resizing.
    * @default true
    */
  var maintainAspectRatio: Boolean
  
  /**
    * Chart.js is fastest if you provide data with indices that are unique, sorted, and consistent across datasets and provide the normalized: true option to let Chart.js know that you have done so.
    */
  var normalized: Boolean
  
  /**
    * Called if the event is of type 'mouseup' or 'click'. Passed the event, an array of active elements, and the chart.
    */
  def onClick(
    event: ChartEvent,
    elements: js.Array[ActiveElement],
    chart: typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]
  ): Unit
  
  /**
    * Called when any of the events fire. Passed the event, an array of active elements (bars, points, etc), and the chart.
    */
  def onHover(
    event: ChartEvent,
    elements: js.Array[ActiveElement],
    chart: typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]
  ): Unit
  
  /**
    * Called when a resize occurs. Gets passed two arguments: the chart instance and the new size.
    */
  def onResize(
    chart: typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any],
    size: Height
  ): Unit
  
  /**
    * How to parse the dataset. The parsing can be disabled by specifying parsing: false at chart options or dataset. If parsing is disabled, data must be sorted and in the formats the associated chart type and scales use internally.
    */
  var parsing: StringDictionary[String] | `false`
  
  var pie: DatasetsPieControllerDatasetOptions
  
  var plugins: PluginOptionsByType[scatter]
  
  var polarArea: DatasetsPolarAreaControllerDatasetOptions
  
  var radar: `0`
  
  /**
    * Delay the resize update by give amount of milliseconds. This can ease the resize process by debouncing update of the elements.
    * @default 0
    */
  var resizeDelay: Double
  
  /**
    * Resizes the chart canvas when its container does (important note...).
    * @default true
    */
  var responsive: Boolean
  
  var scales: StringDictionary[ScaleOptionsByType[linear | logarithmic | category | time | timeseries]]
  
  var scatter: DatasetsScatterControllerDatasetOptions
  
  /**
    * If false, the lines between points are not drawn.
    * @default true
    */
  var showLine: Boolean
  
  /**
    * If true, lines will be drawn between points with no or null data. If false, points with NaN data will create a break in the line. Can also be a number specifying the maximum gap length to span. The unit of the value depends on the scale used.
    * @default false
    */
  var spanGaps: Boolean | Double
  
  var transitions: TransitionsSpec[scatter]
}
object CoreChartOptionsscatterEl {
  
  inline def apply(
    animation: `false` | AnimationSpecscatteronPro,
    animations: AnimationsSpec[scatter],
    aspectRatio: Double,
    backgroundColor: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]],
    bar: Datasets,
    borderColor: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]],
    bubble: DatasetsBubbleControllerDatasetOptions,
    clip: Double | ChartArea | `false`,
    color: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]],
    datasets: keyinChartTypeChartTypeReBar,
    devicePixelRatio: Double,
    doughnut: DatasetsDoughnutControllerDatasetOptions,
    elements: ElementOptionsByType[scatter],
    events: js.Array[
      /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.chartJs.chartJsStrings.fullscreenchange, typings.chartJs.chartJsStrings.fullscreenerror, typings.chartJs.chartJsStrings.copy */ Any
    ],
    font: PartialFontSpec,
    hover: CoreInteractionOptions,
    indexAxis: x | y,
    interaction: CoreInteractionOptions,
    layout: PartialautoPaddingbooleanAutoPaddingPadding,
    line: `1`,
    locale: String,
    maintainAspectRatio: Boolean,
    normalized: Boolean,
    onClick: (ChartEvent, js.Array[ActiveElement], typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Unit,
    onHover: (ChartEvent, js.Array[ActiveElement], typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Unit,
    onResize: (typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any], Height) => Unit,
    parsing: StringDictionary[String] | `false`,
    pie: DatasetsPieControllerDatasetOptions,
    plugins: PluginOptionsByType[scatter],
    polarArea: DatasetsPolarAreaControllerDatasetOptions,
    radar: `0`,
    resizeDelay: Double,
    responsive: Boolean,
    scales: StringDictionary[ScaleOptionsByType[linear | logarithmic | category | time | timeseries]],
    scatter: DatasetsScatterControllerDatasetOptions,
    showLine: Boolean,
    spanGaps: Boolean | Double,
    transitions: TransitionsSpec[scatter]
  ): CoreChartOptionsscatterEl = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], aspectRatio = aspectRatio.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], devicePixelRatio = devicePixelRatio.asInstanceOf[js.Any], doughnut = doughnut.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick), onHover = js.Any.fromFunction3(onHover), onResize = js.Any.fromFunction2(onResize), parsing = parsing.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], polarArea = polarArea.asInstanceOf[js.Any], radar = radar.asInstanceOf[js.Any], resizeDelay = resizeDelay.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any], showLine = showLine.asInstanceOf[js.Any], spanGaps = spanGaps.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreChartOptionsscatterEl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreChartOptionsscatterEl] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: `false` | AnimationSpecscatteronPro): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[scatter]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableContext[scatter], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBar(value: Datasets): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableContext[scatter], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBubble(value: DatasetsBubbleControllerDatasetOptions): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Scriptable[typings.chartJs.typesColorMod.Color, ScriptableContext[scatter]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(
      value: (ScriptableContext[scatter], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setDatasets(value: keyinChartTypeChartTypeReBar): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: DatasetsDoughnutControllerDatasetOptions): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setElements(value: ElementOptionsByType[scatter]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setEvents(
      value: js.Array[
          /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.chartJs.chartJsStrings.fullscreenchange, typings.chartJs.chartJsStrings.fullscreenerror, typings.chartJs.chartJsStrings.copy */ Any
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(
      value: (/* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.chartJs.chartJsStrings.fullscreenchange, typings.chartJs.chartJsStrings.fullscreenerror, typings.chartJs.chartJsStrings.copy */ Any)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFont(value: PartialFontSpec): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setHover(value: CoreInteractionOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: CoreInteractionOptions): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: PartialautoPaddingbooleanAutoPaddingPadding): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLine(value: `1`): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (ChartEvent, js.Array[ActiveElement], typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setOnHover(
      value: (ChartEvent, js.Array[ActiveElement], typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Unit
    ): Self = StObject.set(x, "onHover", js.Any.fromFunction3(value))
    
    inline def setOnResize(
      value: (typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any], Height) => Unit
    ): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setPie(value: DatasetsPieControllerDatasetOptions): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: PluginOptionsByType[scatter]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: DatasetsPolarAreaControllerDatasetOptions): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: `0`): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setResizeDelay(value: Double): Self = StObject.set(x, "resizeDelay", value.asInstanceOf[js.Any])
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setScales(value: StringDictionary[ScaleOptionsByType[linear | logarithmic | category | time | timeseries]]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: DatasetsScatterControllerDatasetOptions): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
    
    inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setSpanGaps(value: Boolean | Double): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: TransitionsSpec[scatter]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
  }
}
