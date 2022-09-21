package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxSpeedDialAction {
  
  trait ClickEvent
    extends StObject
       with NativeEventInfo[dxSpeedDialAction, MouseEvent | PointerEvent] {
    
    var actionElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object ClickEvent {
    
    inline def apply(component: dxSpeedDialAction, element: DxElement_[HTMLElement]): ClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setActionElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "actionElement", value.asInstanceOf[js.Any])
      
      inline def setActionElementUndefined: Self = StObject.set(x, "actionElement", js.undefined)
    }
  }
  
  trait ContentReadyEvent
    extends StObject
       with EventInfo[dxSpeedDialAction] {
    
    var actionElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object ContentReadyEvent {
    
    inline def apply(component: dxSpeedDialAction, element: DxElement_[HTMLElement]): ContentReadyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentReadyEvent]
    }
    
    extension [Self <: ContentReadyEvent](x: Self) {
      
      inline def setActionElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "actionElement", value.asInstanceOf[js.Any])
      
      inline def setActionElementUndefined: Self = StObject.set(x, "actionElement", js.undefined)
    }
  }
  
  type DisposingEvent = EventInfo[dxSpeedDialAction]
  
  type InitializedEvent = InitializedEventInfo[dxSpeedDialAction]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSpeedDialAction]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSpeedDialAction, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSpeedDialActionOptions
}
