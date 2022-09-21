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

object dxRangeSlider {
  
  type ContentReadyEvent = EventInfo[dxRangeSlider]
  
  type DisposingEvent = EventInfo[dxRangeSlider]
  
  type InitializedEvent = InitializedEventInfo[dxRangeSlider]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxRangeSlider]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxRangeSlider, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxRangeSliderOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[
          dxRangeSlider, 
          KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | UIEvent | Event
        ]
       with ValueChangedInfo {
    
    val end: js.UndefOr[Double] = js.undefined
    
    val start: js.UndefOr[Double] = js.undefined
    
    @JSName("value")
    val value_ValueChangedEvent: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ValueChangedEvent {
    
    inline def apply(component: dxRangeSlider, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    extension [Self <: ValueChangedEvent](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
