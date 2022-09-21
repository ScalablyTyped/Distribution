package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateUnknown extends StObject {
  
  var date: Any
}
object DateUnknown {
  
  inline def apply(date: Any): DateUnknown = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateUnknown]
  }
  
  extension [Self <: DateUnknown](x: Self) {
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
