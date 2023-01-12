package typings.baseui.anon

import typings.baseui.baseuiStrings.LY
import typings.baseui.baseuiStrings.Plussign218
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  val dialCode: Plussign218
  
  val id: LY
  
  val label: /* Libya (‫ليبيا‬‎) */ String
}
object `131` {
  
  inline def apply(): `131` = {
    val __obj = js.Dynamic.literal(dialCode = "+218", id = "LY", label = "Libya (\u202B\u0644\u064A\u0628\u064A\u0627\u202C\u200E)")
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `131`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign218): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Libya (‫ليبيا‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
