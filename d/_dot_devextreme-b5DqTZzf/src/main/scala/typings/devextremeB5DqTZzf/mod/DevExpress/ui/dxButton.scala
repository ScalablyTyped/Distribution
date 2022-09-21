package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxButton {
  
  trait ClickEvent
    extends StObject
       with NativeEventInfo[dxButton, KeyboardEvent | MouseEvent | PointerEvent] {
    
    var validationGroup: js.UndefOr[Any] = js.undefined
  }
  object ClickEvent {
    
    inline def apply(component: dxButton, element: DxElement_[HTMLElement]): ClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setValidationGroup(value: Any): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
      
      inline def setValidationGroupUndefined: Self = StObject.set(x, "validationGroup", js.undefined)
    }
  }
  
  type ContentReadyEvent = EventInfo[dxButton]
  
  type DisposingEvent = EventInfo[dxButton]
  
  type InitializedEvent = InitializedEventInfo[dxButton]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxButton]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxButton, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxButtonOptions
  
  trait TemplateData extends StObject {
    
    val icon: js.UndefOr[String] = js.undefined
    
    val text: js.UndefOr[String] = js.undefined
  }
  object TemplateData {
    
    inline def apply(): TemplateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateData]
    }
    
    extension [Self <: TemplateData](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
