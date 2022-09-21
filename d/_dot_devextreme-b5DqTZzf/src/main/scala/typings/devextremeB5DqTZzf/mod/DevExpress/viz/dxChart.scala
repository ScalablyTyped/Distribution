package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pan
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.zoom
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseChart.PointInteractionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseChart.TooltipInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChart
  extends StObject
     with BaseChart[dxChartOptions] {
  
  /**
    * Gets the argument axis.
    */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /**
    * Gets a value axis.
    */
  def getValueAxis(): chartAxisObject = js.native
  /**
    * Gets a value axis with the specified name.
    */
  def getValueAxis(name: String): chartAxisObject = js.native
  
  /**
    * Resets the visual ranges of both axes to the data range or to the whole range if it is within the data range.
    */
  def resetVisualRange(): Unit = js.native
  
  def zoomArgument(startValue: String, endValue: String): Unit = js.native
  def zoomArgument(startValue: String, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: String, endValue: Double): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: String): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Double, endValue: String): Unit = js.native
  def zoomArgument(startValue: Double, endValue: js.Date): Unit = js.native
  /**
    * Sets the argument axis&apos; start and end values.
    */
  def zoomArgument(startValue: Double, endValue: Double): Unit = js.native
}
object dxChart {
  
  trait ArgumentAxisClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val argument: js.Date | Double | String
  }
  object ArgumentAxisClickEvent {
    
    inline def apply(argument: js.Date | Double | String, component: dxChart, element: DxElement_[HTMLElement]): ArgumentAxisClickEvent = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgumentAxisClickEvent]
    }
    
    extension [Self <: ArgumentAxisClickEvent](x: Self) {
      
      inline def setArgument(value: js.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.avg
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.count
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.max
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.min
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.sum
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom
  */
  trait ChartSingleValueSeriesAggregationMethodType extends StObject
  object ChartSingleValueSeriesAggregationMethodType {
    
    inline def avg: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.avg = "avg".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.avg]
    
    inline def count: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.count = "count".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.count]
    
    inline def custom: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom = "custom".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom]
    
    inline def max: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.max = "max".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.max]
    
    inline def min: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.min = "min".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.min]
    
    inline def sum: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.sum = "sum".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.sum]
  }
  
  type DisposingEvent = EventInfo[dxChart]
  
  type DoneEvent = EventInfo[dxChart]
  
  type DrawnEvent = EventInfo[dxChart]
  
  type ExportedEvent = EventInfo[dxChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxChart]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxChart]
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val target: chartSeriesObject
  }
  object LegendClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    extension [Self <: LegendClickEvent](x: Self) {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait PointClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  type Properties = dxChartOptions
  
  trait SeriesClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val target: chartSeriesObject
  }
  object SeriesClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesClickEvent]
    }
    
    extension [Self <: SeriesClickEvent](x: Self) {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesHoverChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with SeriesInteractionInfo
  object SeriesHoverChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesHoverChangedEvent]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait SeriesInteractionInfo extends StObject {
    
    var target: chartSeriesObject
  }
  object SeriesInteractionInfo {
    
    inline def apply(target: chartSeriesObject): SeriesInteractionInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesInteractionInfo]
    }
    
    extension [Self <: SeriesInteractionInfo](x: Self) {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesSelectionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with SeriesInteractionInfo
  object SeriesSelectionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesSelectionChangedEvent]
    }
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
  
  trait ZoomEndEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | TouchEvent] {
    
    val actionType: zoom | pan
    
    val axis: chartAxisObject
    
    val previousRange: VizRange
    
    val range: VizRange
    
    val rangeEnd: js.Date | Double
    
    val rangeStart: js.Date | Double
    
    val shift: Double
    
    val zoomFactor: Double
  }
  object ZoomEndEvent {
    
    inline def apply(
      actionType: zoom | pan,
      axis: chartAxisObject,
      component: dxChart,
      element: DxElement_[HTMLElement],
      previousRange: VizRange,
      range: VizRange,
      rangeEnd: js.Date | Double,
      rangeStart: js.Date | Double,
      shift: Double,
      zoomFactor: Double
    ): ZoomEndEvent = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousRange = previousRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEndEvent]
    }
    
    extension [Self <: ZoomEndEvent](x: Self) {
      
      inline def setActionType(value: zoom | pan): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setPreviousRange(value: VizRange): Self = StObject.set(x, "previousRange", value.asInstanceOf[js.Any])
      
      inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeEnd(value: js.Date | Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
      
      inline def setRangeStart(value: js.Date | Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZoomStartEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | TouchEvent] {
    
    val actionType: js.UndefOr[zoom | pan] = js.undefined
    
    val axis: chartAxisObject
    
    val range: VizRange
  }
  object ZoomStartEvent {
    
    inline def apply(axis: chartAxisObject, component: dxChart, element: DxElement_[HTMLElement], range: VizRange): ZoomStartEvent = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomStartEvent]
    }
    
    extension [Self <: ZoomStartEvent](x: Self) {
      
      inline def setActionType(value: zoom | pan): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
}
