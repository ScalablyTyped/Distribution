package typings.baseui.anon

import typings.baseui.baseuiStrings.HK
import typings.baseui.baseuiStrings.Plussign852
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  val dialCode: Plussign852
  
  val id: HK
  
  val label: /* Hong Kong (香港) */ String
}
object `105` {
  
  inline def apply(): `105` = {
    val __obj = js.Dynamic.literal(dialCode = "+852", id = "HK", label = "Hong Kong (\u9999\u6E2F)")
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `105`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign852): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Hong Kong (香港) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
