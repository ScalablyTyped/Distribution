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
trait dxPolarChart
  extends StObject
     with BaseChart[dxPolarChartOptions] {
  
  /**
    * Gets a value axis.
    */
  def getValueAxis(): chartAxisObject = js.native
  
  /**
    * Resets the value axis&apos; visual range to the data range or to the whole range if it is within the data range.
    */
  def resetVisualRange(): Unit = js.native
}
object dxPolarChart {
  
  trait ArgumentAxisClickEvent
    extends StObject
       with NativeEventInfo[dxPolarChart, MouseEvent | PointerEvent] {
    
    val argument: js.Date | Double | String
  }
  object ArgumentAxisClickEvent {
    
    inline def apply(argument: js.Date | Double | String, component: dxPolarChart, element: DxElement_[HTMLElement]): ArgumentAxisClickEvent = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgumentAxisClickEvent]
    }
    
    extension [Self <: ArgumentAxisClickEvent](x: Self) {
      
      inline def setArgument(value: js.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxPolarChart]
  
  type DoneEvent = EventInfo[dxPolarChart]
  
  type DrawnEvent = EventInfo[dxPolarChart]
  
  type ExportedEvent = EventInfo[dxPolarChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxPolarChart]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPolarChart]
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxPolarChart, MouseEvent | PointerEvent] {
    
    val target: polarChartSeriesObject
  }
  object LegendClickEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: polarChartSeriesObject): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    extension [Self <: LegendClickEvent](x: Self) {
      
      inline def setTarget(value: polarChartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait PointClickEvent
    extends StObject
       with NativeEventInfo[dxPolarChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.area
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bar
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.line
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.scatter
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.stackedbar
  */
  trait PolarChartSeriesType extends StObject
  object PolarChartSeriesType {
    
    inline def area: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.area = "area".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.area]
    
    inline def bar: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bar = "bar".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bar]
    
    inline def line: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.line = "line".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.line]
    
    inline def scatter: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.scatter = "scatter".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.scatter]
    
    inline def stackedbar: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.stackedbar = "stackedbar".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.stackedbar]
  }
  
  type Properties = dxPolarChartOptions
  
  trait SeriesClickEvent
    extends StObject
       with NativeEventInfo[dxPolarChart, MouseEvent | PointerEvent] {
    
    val target: polarChartSeriesObject
  }
  object SeriesClickEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: polarChartSeriesObject): SeriesClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesClickEvent]
    }
    
    extension [Self <: SeriesClickEvent](x: Self) {
      
      inline def setTarget(value: polarChartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesHoverChangedEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with SeriesInteractionInfo
  object SeriesHoverChangedEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: polarChartSeriesObject): SeriesHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesHoverChangedEvent]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait SeriesInteractionInfo extends StObject {
    
    var target: polarChartSeriesObject
  }
  object SeriesInteractionInfo {
    
    inline def apply(target: polarChartSeriesObject): SeriesInteractionInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesInteractionInfo]
    }
    
    extension [Self <: SeriesInteractionInfo](x: Self) {
      
      inline def setTarget(value: polarChartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesSelectionChangedEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with SeriesInteractionInfo
  object SeriesSelectionChangedEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement], target: polarChartSeriesObject): SeriesSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesSelectionChangedEvent]
    }
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxPolarChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxPolarChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
  
  trait ZoomEndEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxPolarChart, MouseEvent | TouchEvent] {
    
    val actionType: zoom | pan
    
    val axis: chartAxisObject
    
    val previousRange: VizRange
    
    val range: VizRange
    
    val shift: Double
    
    val zoomFactor: Double
  }
  object ZoomEndEvent {
    
    inline def apply(
      actionType: zoom | pan,
      axis: chartAxisObject,
      component: dxPolarChart,
      element: DxElement_[HTMLElement],
      previousRange: VizRange,
      range: VizRange,
      shift: Double,
      zoomFactor: Double
    ): ZoomEndEvent = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousRange = previousRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEndEvent]
    }
    
    extension [Self <: ZoomEndEvent](x: Self) {
      
      inline def setActionType(value: zoom | pan): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setPreviousRange(value: VizRange): Self = StObject.set(x, "previousRange", value.asInstanceOf[js.Any])
      
      inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZoomStartEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxPolarChart, MouseEvent | TouchEvent] {
    
    val actionType: zoom | pan
    
    val axis: chartAxisObject
    
    val range: VizRange
  }
  object ZoomStartEvent {
    
    inline def apply(
      actionType: zoom | pan,
      axis: chartAxisObject,
      component: dxPolarChart,
      element: DxElement_[HTMLElement],
      range: VizRange
    ): ZoomStartEvent = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomStartEvent]
    }
    
    extension [Self <: ZoomStartEvent](x: Self) {
      
      inline def setActionType(value: zoom | pan): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
}
