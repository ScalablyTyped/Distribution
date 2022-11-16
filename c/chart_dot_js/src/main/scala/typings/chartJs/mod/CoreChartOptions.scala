package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.AutoPadding
import typings.chartJs.anon.Height
import typings.chartJs.anon.OnComplete
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.anon.keyinChartTypeChartTypeReBar
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesColorMod.Color
import typings.chartJs.typesGeometricMod.ChartArea
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreChartOptions[TType /* <: ChartType */]
  extends StObject
     with ParsingOptions
     with AnimationOptions[TType] {
  
  /**
    * Canvas aspect ratio (i.e. width / height, a value of 1 representing a square canvas). Note that this option is ignored if the height is explicitly defined either as attribute or via the style.
    * @default 2
    */
  var aspectRatio: Double
  
  /**
    * base background color
    * @see Defaults.backgroundColor
    */
  var backgroundColor: Scriptable[Color, ScriptableContext[TType]]
  
  /**
    * base border color
    * @see Defaults.borderColor
    */
  var borderColor: Scriptable[Color, ScriptableContext[TType]]
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  /**
    * base color
    * @see Defaults.color
    */
  var color: Scriptable[Color, ScriptableContext[TType]]
  
  var datasets: keyinChartTypeChartTypeReBar
  
  /**
    * Override the window's default devicePixelRatio.
    * @default window.devicePixelRatio
    */
  var devicePixelRatio: Double
  
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
  
  var layout: Partial[AutoPadding[TType]]
  
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
    * Called if the event is of type 'mouseup' or 'click'. Passed the event, an array of active elements, and the chart.
    */
  def onClick(
    event: ChartEvent,
    elements: js.Array[ActiveElement],
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ): Unit
  
  /**
    * Called when any of the events fire. Passed the event, an array of active elements (bars, points, etc), and the chart.
    */
  def onHover(
    event: ChartEvent,
    elements: js.Array[ActiveElement],
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ): Unit
  
  /**
    * Called when a resize occurs. Gets passed two arguments: the chart instance and the new size.
    */
  def onResize(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], size: Height): Unit
  
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
}
object CoreChartOptions {
  
  inline def apply[TType /* <: ChartType */](
    animation: `false` | (AnimationSpec[TType] & OnComplete),
    animations: AnimationsSpec[TType],
    aspectRatio: Double,
    backgroundColor: Scriptable[Color, ScriptableContext[TType]],
    borderColor: Scriptable[Color, ScriptableContext[TType]],
    clip: Double | ChartArea | `false`,
    color: Scriptable[Color, ScriptableContext[TType]],
    datasets: keyinChartTypeChartTypeReBar,
    devicePixelRatio: Double,
    events: js.Array[
      /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.chartJs.chartJsStrings.fullscreenchange, typings.chartJs.chartJsStrings.fullscreenerror, typings.chartJs.chartJsStrings.copy */ Any
    ],
    font: PartialFontSpec,
    hover: CoreInteractionOptions,
    indexAxis: x | y,
    interaction: CoreInteractionOptions,
    layout: Partial[AutoPadding[TType]],
    locale: String,
    maintainAspectRatio: Boolean,
    normalized: Boolean,
    onClick: (ChartEvent, js.Array[ActiveElement], Chart[ChartType, DefaultDataPoint[ChartType], Any]) => Unit,
    onHover: (ChartEvent, js.Array[ActiveElement], Chart[ChartType, DefaultDataPoint[ChartType], Any]) => Unit,
    onResize: (Chart[ChartType, DefaultDataPoint[ChartType], Any], Height) => Unit,
    parsing: StringDictionary[String] | `false`,
    resizeDelay: Double,
    responsive: Boolean,
    transitions: TransitionsSpec[TType]
  ): CoreChartOptions[TType] = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], aspectRatio = aspectRatio.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], devicePixelRatio = devicePixelRatio.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick), onHover = js.Any.fromFunction3(onHover), onResize = js.Any.fromFunction2(onResize), parsing = parsing.asInstanceOf[js.Any], resizeDelay = resizeDelay.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreChartOptions[TType]]
  }
  
  extension [Self <: CoreChartOptions[?], TType /* <: ChartType */](x: Self & CoreChartOptions[TType]) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Scriptable[Color, ScriptableContext[TType]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBorderColor(value: Scriptable[Color, ScriptableContext[TType]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Scriptable[Color, ScriptableContext[TType]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setDatasets(value: keyinChartTypeChartTypeReBar): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
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
    
    inline def setLayout(value: Partial[AutoPadding[TType]]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (ChartEvent, js.Array[ActiveElement], Chart[ChartType, DefaultDataPoint[ChartType], Any]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setOnHover(
      value: (ChartEvent, js.Array[ActiveElement], Chart[ChartType, DefaultDataPoint[ChartType], Any]) => Unit
    ): Self = StObject.set(x, "onHover", js.Any.fromFunction3(value))
    
    inline def setOnResize(value: (Chart[ChartType, DefaultDataPoint[ChartType], Any], Height) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
    
    inline def setResizeDelay(value: Double): Self = StObject.set(x, "resizeDelay", value.asInstanceOf[js.Any])
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
  }
}
