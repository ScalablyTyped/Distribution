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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxCheckBox
  extends StObject
     with Editor[dxCheckBoxOptions] {
  
  /**
    * Removes focus from the check box.
    */
  def blur(): Unit = js.native
}
object dxCheckBox {
  
  type ContentReadyEvent = EventInfo[dxCheckBox]
  
  type DisposingEvent = EventInfo[dxCheckBox]
  
  type InitializedEvent = InitializedEventInfo[dxCheckBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxCheckBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxCheckBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxCheckBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxCheckBox, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxCheckBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
