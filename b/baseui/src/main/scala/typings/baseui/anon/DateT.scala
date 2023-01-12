package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateT[T] extends StObject {
  
  var date: T
}
object DateT {
  
  inline def apply[T](date: T): DateT[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateT[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateT[?], T] (val x: Self & DateT[T]) extends AnyVal {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
