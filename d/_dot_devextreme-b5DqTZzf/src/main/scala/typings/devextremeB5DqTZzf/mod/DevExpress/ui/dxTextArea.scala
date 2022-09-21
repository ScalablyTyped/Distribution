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

object dxTextArea {
  
  type ChangeEvent = NativeEventInfo[dxTextArea, Event]
  
  type ContentReadyEvent = EventInfo[dxTextArea]
  
  type CopyEvent = NativeEventInfo[dxTextArea, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxTextArea, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxTextArea]
  
  type EnterKeyEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxTextArea, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxTextArea, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxTextArea]
  
  type InputEvent = NativeEventInfo[dxTextArea, UIEvent]
  
  type KeyDownEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTextArea]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTextArea, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxTextArea, ClipboardEvent]
  
  type Properties = dxTextAreaOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxTextArea, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxTextArea, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
