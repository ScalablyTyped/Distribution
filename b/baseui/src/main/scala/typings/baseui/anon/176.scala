package typings.baseui.anon

import typings.baseui.baseuiStrings.PA
import typings.baseui.baseuiStrings.Plussign507
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  val dialCode: Plussign507
  
  val id: PA
  
  val label: /* Panama (Panamá) */ String
}
object `176` {
  
  inline def apply(): `176` = {
    val __obj = js.Dynamic.literal(dialCode = "+507", id = "PA", label = "Panama (Panam\u00E1)")
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `176`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign507): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Panama (Panamá) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
