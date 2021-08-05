package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign58
import typings.baseui.baseuiStrings.VE
import typings.baseui.baseuiStrings.Venezuela
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `229` extends StObject {
  
  var dialCode: Plussign58
  
  var id: VE
  
  var label: Venezuela
}
object `229` {
  
  inline def apply(): `229` = {
    val __obj = js.Dynamic.literal(dialCode = "+58", id = "VE", label = "Venezuela")
    __obj.asInstanceOf[`229`]
  }
  
  extension [Self <: `229`](x: Self) {
    
    inline def setDialCode(value: Plussign58): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Venezuela): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
