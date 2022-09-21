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

object dxCalendar {
  
  trait CellTemplateData extends StObject {
    
    val date: js.Date
    
    val text: js.UndefOr[String] = js.undefined
    
    val view: String
  }
  object CellTemplateData {
    
    inline def apply(date: js.Date, view: String): CellTemplateData = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellTemplateData]
    }
    
    extension [Self <: CellTemplateData](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentDisabledDate[T] extends StObject {
    
    var component: T
    
    val date: js.Date
    
    val view: String
  }
  object ComponentDisabledDate {
    
    inline def apply[T](component: T, date: js.Date, view: String): ComponentDisabledDate[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDisabledDate[T]]
    }
    
    extension [Self <: ComponentDisabledDate[?], T](x: Self & ComponentDisabledDate[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxCalendar]
  
  type DisabledDate = ComponentDisabledDate[dxCalendar]
  
  type DisposingEvent = EventInfo[dxCalendar]
  
  type InitializedEvent = InitializedEventInfo[dxCalendar]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxCalendar]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxCalendar, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxCalendarOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxCalendar, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxCalendar, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
