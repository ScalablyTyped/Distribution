package typings.baseui.anon

import typings.baseui.baseuiStrings.MO
import typings.baseui.baseuiStrings.Plussign853
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  val dialCode: Plussign853
  
  val id: MO
  
  val label: /* Macau (澳門) */ String
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal(dialCode = "+853", id = "MO", label = "Macau (\u6FB3\u9580)")
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `135`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign853): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Macau (澳門) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
