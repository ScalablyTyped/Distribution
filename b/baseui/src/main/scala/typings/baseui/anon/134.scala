package typings.baseui.anon

import typings.baseui.baseuiStrings.LY
import typings.baseui.baseuiStrings.Plussign218
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  val dialCode: Plussign218
  
  val id: LY
  
  val label: String
}
object `134` {
  
  inline def apply(): `134` = {
    val __obj = js.Dynamic.literal(dialCode = "+218", id = "LY", label = "Libya (\u202B\u0644\u064A\u0628\u064A\u0627\u202C\u200E)")
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setDialCode(value: Plussign218): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
