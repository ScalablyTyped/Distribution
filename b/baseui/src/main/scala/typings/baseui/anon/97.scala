package typings.baseui.anon

import typings.baseui.baseuiStrings.IL
import typings.baseui.baseuiStrings.Plussign972
import typings.baseui.baseuiStrings.`Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var dialCode: Plussign972
  
  var id: IL
  
  var label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal(dialCode = "+972", id = "IL", label = "Israel (\u202B\u05D9\u05E9\u05E8\u05D0\u05DC\u202C\u200E)")
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setDialCode(value: Plussign972): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
