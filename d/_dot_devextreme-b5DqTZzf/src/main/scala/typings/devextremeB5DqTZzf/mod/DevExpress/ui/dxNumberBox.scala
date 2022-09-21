package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxNumberBox {
  
  type ChangeEvent = NativeEventInfo[dxNumberBox, Event]
  
  type ContentReadyEvent = EventInfo[dxNumberBox]
  
  type CopyEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxNumberBox]
  
  type EnterKeyEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxNumberBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxNumberBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxNumberBox]
  
  type InputEvent = NativeEventInfo[dxNumberBox, UIEvent]
  
  type KeyDownEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxNumberBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxNumberBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type Properties = dxNumberBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxNumberBox, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxNumberBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
