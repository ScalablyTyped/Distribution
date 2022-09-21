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

object dxTextBox {
  
  type ChangeEvent = NativeEventInfo[dxTextBox[Properties], Event]
  
  type ContentReadyEvent = EventInfo[dxTextBox[Properties]]
  
  type CopyEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxTextBox[Properties]]
  
  type EnterKeyEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxTextBox[Properties], FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxTextBox[Properties], FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxTextBox[Properties]]
  
  type InputEvent = NativeEventInfo[dxTextBox[Properties], UIEvent]
  
  type KeyDownEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTextBox[Properties]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTextBox[Properties], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type Properties = dxTextBoxOptions[TextBoxInstance]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  @js.native
  trait TextBoxInstance
    extends StObject
       with dxTextEditor[Properties]
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[
          dxTextBox[Properties], 
          KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event
        ]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxTextBox[Properties], element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
