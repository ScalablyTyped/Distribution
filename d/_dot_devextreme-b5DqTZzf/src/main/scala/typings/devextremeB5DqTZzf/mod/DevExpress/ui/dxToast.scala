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

object dxToast {
  
  type ContentReadyEvent = EventInfo[dxToast]
  
  type DisposingEvent = EventInfo[dxToast]
  
  type HiddenEvent = EventInfo[dxToast]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxToast]
  object HidingEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxToast]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxToast]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxToastOptions
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxToast]
  object ShowingEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  type ShownEvent = EventInfo[dxToast]
}
