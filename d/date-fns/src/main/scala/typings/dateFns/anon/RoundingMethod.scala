package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundingMethod extends StObject {
  
  var roundingMethod: js.UndefOr[String] = js.undefined
}
object RoundingMethod {
  
  inline def apply(): RoundingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundingMethod]
  }
  
  extension [Self <: RoundingMethod](x: Self) {
    
    inline def setRoundingMethod(value: String): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
    
    inline def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
  }
}
