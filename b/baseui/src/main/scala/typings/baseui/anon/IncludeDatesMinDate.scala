package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDatesMinDate extends StObject {
  
  var includeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  
  var minDate: js.UndefOr[js.Date] = js.undefined
}
object IncludeDatesMinDate {
  
  inline def apply(): IncludeDatesMinDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeDatesMinDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeDatesMinDate] (val x: Self) extends AnyVal {
    
    inline def setIncludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
