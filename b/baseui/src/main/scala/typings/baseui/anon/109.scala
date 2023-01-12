package typings.baseui.anon

import typings.baseui.baseuiStrings.ID
import typings.baseui.baseuiStrings.Indonesia
import typings.baseui.baseuiStrings.Plussign62
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  val dialCode: Plussign62
  
  val id: ID
  
  val label: Indonesia
}
object `109` {
  
  inline def apply(): `109` = {
    val __obj = js.Dynamic.literal(dialCode = "+62", id = "ID", label = "Indonesia")
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `109`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign62): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Indonesia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
