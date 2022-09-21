package typings.baseui.anon

import typings.baseui.baseuiStrings.PR
import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.`Puerto Rico`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  val dialCode: Plussign1
  
  val id: PR
  
  val label: `Puerto Rico`
}
object `186` {
  
  inline def apply(): `186` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "PR", label = "Puerto Rico")
    __obj.asInstanceOf[`186`]
  }
  
  extension [Self <: `186`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Puerto Rico`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
