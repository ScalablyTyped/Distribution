package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var maxDate: js.UndefOr[js.Date] = js.undefined
  
  var minDate: js.UndefOr[js.Date] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
