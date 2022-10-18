package typings.baseui.anon

import typings.baseui.baseuiStrings.CZ
import typings.baseui.baseuiStrings.Plussign420
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  val dialCode: Plussign420
  
  val id: CZ
  
  val label: /* Czech Republic (Česká republika) */ String
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal(dialCode = "+420", id = "CZ", label = "Czech Republic (\u010Cesk\u00E1 republika)")
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setDialCode(value: Plussign420): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Czech Republic (Česká republika) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
