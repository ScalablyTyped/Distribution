package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTEventEvent[T] extends StObject {
  
  var date: T
  
  var event: typings.std.Event
}
object DateTEventEvent {
  
  inline def apply[T](date: T, event: typings.std.Event): DateTEventEvent[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTEventEvent[T]]
  }
  
  extension [Self <: DateTEventEvent[?], T](x: Self & DateTEventEvent[T]) {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: typings.std.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
