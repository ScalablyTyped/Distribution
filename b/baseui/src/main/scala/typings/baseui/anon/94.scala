package typings.baseui.anon

import typings.baseui.baseuiStrings.IQ
import typings.baseui.baseuiStrings.Plussign964
import typings.baseui.baseuiStrings.`Iraq Leftparenthesis‫العراق‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var dialCode: Plussign964
  
  var id: IQ
  
  var label: `Iraq Leftparenthesis‫العراق‬‎Rightparenthesis`
}
object `94` {
  
  inline def apply(): `94` = {
    val __obj = js.Dynamic.literal(dialCode = "+964", id = "IQ", label = "Iraq (\u202B\u0627\u0644\u0639\u0631\u0627\u0642\u202C\u200E)")
    __obj.asInstanceOf[`94`]
  }
  
  extension [Self <: `94`](x: Self) {
    
    inline def setDialCode(value: Plussign964): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IQ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Iraq Leftparenthesis‫العراق‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
