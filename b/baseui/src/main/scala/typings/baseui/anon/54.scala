package typings.baseui.anon

import typings.baseui.baseuiStrings.DM
import typings.baseui.baseuiStrings.Dominica
import typings.baseui.baseuiStrings.Plussign1767
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var dialCode: Plussign1767
  
  var id: DM
  
  var label: Dominica
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal(dialCode = "+1767", id = "DM", label = "Dominica")
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setDialCode(value: Plussign1767): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Dominica): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
