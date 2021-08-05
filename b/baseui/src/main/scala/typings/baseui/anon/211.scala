package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign690
import typings.baseui.baseuiStrings.TK
import typings.baseui.baseuiStrings.Tokelau
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `211` extends StObject {
  
  var dialCode: Plussign690
  
  var id: TK
  
  var label: Tokelau
}
object `211` {
  
  inline def apply(): `211` = {
    val __obj = js.Dynamic.literal(dialCode = "+690", id = "TK", label = "Tokelau")
    __obj.asInstanceOf[`211`]
  }
  
  extension [Self <: `211`](x: Self) {
    
    inline def setDialCode(value: Plussign690): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tokelau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
