package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseGauge.TooltipInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxCircularGauge {
  
  type DisposingEvent = EventInfo[dxCircularGauge]
  
  type DrawnEvent = EventInfo[dxCircularGauge]
  
  type ExportedEvent = EventInfo[dxCircularGauge]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxCircularGauge]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxCircularGauge]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxCircularGaugeOptions
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], target: Any): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], target: Any): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
}
