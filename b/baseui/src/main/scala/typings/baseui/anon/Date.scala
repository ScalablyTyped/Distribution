package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: typings.std.Date | js.Array[typings.std.Date]
}
object Date {
  
  @scala.inline
  def apply(date: typings.std.Date | js.Array[typings.std.Date]): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: typings.std.Date | js.Array[typings.std.Date]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateVarargs(value: typings.std.Date*): Self = StObject.set(x, "date", js.Array(value :_*))
  }
}
