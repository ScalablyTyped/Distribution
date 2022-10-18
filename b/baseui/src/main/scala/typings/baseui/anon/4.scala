package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var date: js.UndefOr[js.Date | Null | js.Array[js.Date]] = js.undefined
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setDate(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDateVarargs(value: js.Date*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
