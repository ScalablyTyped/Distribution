package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxSwitch {
  
  type ContentReadyEvent = EventInfo[dxSwitch]
  
  type DisposingEvent = EventInfo[dxSwitch]
  
  type InitializedEvent = InitializedEventInfo[dxSwitch]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSwitch]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSwitch, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSwitchOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxSwitch, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | UIEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxSwitch, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
