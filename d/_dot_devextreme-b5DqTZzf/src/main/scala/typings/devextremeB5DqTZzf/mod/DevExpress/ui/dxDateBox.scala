package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxCalendar.ComponentDisabledDate
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDateBox
  extends StObject
     with dxDropDownEditor[dxDateBoxOptions]
object dxDateBox {
  
  type ChangeEvent = NativeEventInfo[dxDateBox, Event]
  
  type ClosedEvent = EventInfo[dxDateBox]
  
  type ContentReadyEvent = EventInfo[dxDateBox]
  
  type CopyEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type DisabledDate = ComponentDisabledDate[dxDateBox]
  
  type DisposingEvent = EventInfo[dxDateBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxDateBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxDateBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxDateBox]
  
  type InputEvent = NativeEventInfo[dxDateBox, UIEvent]
  
  type KeyDownEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxDateBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDateBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDateBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type Properties = dxDateBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxDateBox, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxDateBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
