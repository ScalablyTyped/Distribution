package typings.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderProps[T]
  extends StObject
     with CalendarProps[T] {
  
  var date: T
  
  var order: Double
}
object HeaderProps {
  
  inline def apply[T](date: T, order: Double): HeaderProps[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderProps[?], T] (val x: Self & HeaderProps[T]) extends AnyVal {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
