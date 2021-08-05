package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: typings.std.Date | js.Array[typings.std.Date]
}
object Date {
  
  inline def apply(date: typings.std.Date | js.Array[typings.std.Date]): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: typings.std.Date | js.Array[typings.std.Date]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateVarargs(value: typings.std.Date*): Self = StObject.set(x, "date", js.Array(value :_*))
  }
}
