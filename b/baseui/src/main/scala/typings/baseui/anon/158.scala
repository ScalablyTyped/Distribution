package typings.baseui.anon

import typings.baseui.baseuiStrings.PS
import typings.baseui.baseuiStrings.Plussign970
import typings.baseui.baseuiStrings.`Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var dialCode: Plussign970
  
  var id: PS
  
  var label: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`
}
object `158` {
  
  inline def apply(): `158` = {
    val __obj = js.Dynamic.literal(dialCode = "+970", id = "PS", label = "Palestine (\u202B\u0641\u0644\u0633\u0637\u064A\u0646\u202C\u200E)")
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setDialCode(value: Plussign970): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
