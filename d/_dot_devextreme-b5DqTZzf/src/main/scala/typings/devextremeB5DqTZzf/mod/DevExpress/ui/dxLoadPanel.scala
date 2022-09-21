package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxLoadPanel {
  
  type ContentReadyEvent = EventInfo[dxLoadPanel]
  
  type DisposingEvent = EventInfo[dxLoadPanel]
  
  type HiddenEvent = EventInfo[dxLoadPanel]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxLoadPanel]
  object HidingEvent {
    
    inline def apply(component: dxLoadPanel, element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxLoadPanel]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxLoadPanel]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxLoadPanel, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxLoadPanelOptions
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxLoadPanel]
  object ShowingEvent {
    
    inline def apply(component: dxLoadPanel, element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  type ShownEvent = EventInfo[dxLoadPanel]
}
