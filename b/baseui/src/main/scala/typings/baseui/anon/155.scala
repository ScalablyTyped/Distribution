package typings.baseui.anon

import typings.baseui.baseuiStrings.MA
import typings.baseui.baseuiStrings.Plussign212
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  val dialCode: Plussign212
  
  val id: MA
  
  val label: /* Morocco (‫المغرب‬‎) */ String
}
object `155` {
  
  inline def apply(): `155` = {
    val __obj = js.Dynamic.literal(dialCode = "+212", id = "MA", label = "Morocco (\u202B\u0627\u0644\u0645\u063A\u0631\u0628\u202C\u200E)")
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `155`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign212): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Morocco (‫المغرب‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
