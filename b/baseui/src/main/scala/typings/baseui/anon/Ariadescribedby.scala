package typings.baseui.anon

import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariadescribedby extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var `aria-describedby`: String
  
  var formatString: String
  
  var value: Any
}
object Ariadescribedby {
  
  inline def apply(adapter: DateIOAdapter[js.Date], `aria-describedby`: String, formatString: String, value: Any): Ariadescribedby = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], formatString = formatString.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariadescribedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ariadescribedby] (val x: Self) extends AnyVal {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
