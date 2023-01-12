package typings.baseui.anon

import typings.baseui.baseuiStrings.BY
import typings.baseui.baseuiStrings.Plussign375
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  val dialCode: Plussign375
  
  val id: BY
  
  val label: /* Belarus (Беларусь) */ String
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal(dialCode = "+375", id = "BY", label = "Belarus (\u0411\u0435\u043B\u0430\u0440\u0443\u0441\u044C)")
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign375): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Belarus (Беларусь) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
