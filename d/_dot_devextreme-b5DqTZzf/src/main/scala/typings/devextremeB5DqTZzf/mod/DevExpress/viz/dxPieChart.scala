package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChart
  extends StObject
     with BaseChart[dxPieChartOptions] {
  
  /**
    * Gets the radius of the doughnut hole in pixels. Applies only when the type is &apos;doughnut&apos; or &apos;donut&apos;.
    */
  def getInnerRadius(): Double = js.native
}
object dxPieChart {
  
  type DisposingEvent = EventInfo[dxPieChart]
  
  type DoneEvent = EventInfo[dxPieChart]
  
  type DrawnEvent = EventInfo[dxPieChart]
  
  type ExportedEvent = EventInfo[dxPieChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxPieChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxPieChart]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxPieChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPieChart]
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxPieChart, MouseEvent | PointerEvent] {
    
    val points: js.Array[piePointObject]
    
    val target: String | Double
  }
  object LegendClickEvent {
    
    inline def apply(
      component: dxPieChart,
      element: DxElement_[HTMLElement],
      points: js.Array[piePointObject],
      target: String | Double
    ): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    extension [Self <: LegendClickEvent](x: Self) {
      
      inline def setPoints(value: js.Array[piePointObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: piePointObject*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTarget(value: String | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type LegendItem = PieChartLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.donut
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.doughnut
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pie
  */
  trait PieSeriesType extends StObject
  object PieSeriesType {
    
    inline def donut: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.donut = "donut".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.donut]
    
    inline def doughnut: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.doughnut = "doughnut".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.doughnut]
    
    inline def pie: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pie = "pie".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pie]
  }
  
  trait PointClickEvent
    extends StObject
       with NativeEventInfo[dxPieChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  type Properties = dxPieChartOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.anticlockwise
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.clockwise
  */
  trait SegmentsDirectionType extends StObject
  object SegmentsDirectionType {
    
    inline def anticlockwise: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.anticlockwise = "anticlockwise".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.anticlockwise]
    
    inline def clockwise: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.clockwise = "clockwise".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.clockwise]
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxPieChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxPieChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
}
