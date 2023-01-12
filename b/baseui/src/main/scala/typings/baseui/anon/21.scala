package typings.baseui.anon

import typings.baseui.baseuiStrings.AM
import typings.baseui.baseuiStrings.Plussign374
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  val dialCode: Plussign374
  
  val id: AM
  
  val label: /* Armenia (Հայաստան) */ String
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(dialCode = "+374", id = "AM", label = "Armenia (\u0540\u0561\u0575\u0561\u057D\u057F\u0561\u0576)")
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign374): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Armenia (Հայաստան) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
