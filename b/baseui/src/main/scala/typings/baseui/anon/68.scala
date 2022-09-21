package typings.baseui.anon

import typings.baseui.baseuiStrings.CU
import typings.baseui.baseuiStrings.Cuba
import typings.baseui.baseuiStrings.Plussign53
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  val dialCode: Plussign53
  
  val id: CU
  
  val label: Cuba
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal(dialCode = "+53", id = "CU", label = "Cuba")
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setDialCode(value: Plussign53): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Cuba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
