package typings.baseui.anon

import typings.baseui.baseuiStrings.MA
import typings.baseui.baseuiStrings.Plussign212
import typings.baseui.baseuiStrings.`Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  var dialCode: Plussign212
  
  var id: MA
  
  var label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`
}
object `138` {
  
  inline def apply(): `138` = {
    val __obj = js.Dynamic.literal(dialCode = "+212", id = "MA", label = "Morocco (\u202B\u0627\u0644\u0645\u063A\u0631\u0628\u202C\u200E)")
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setDialCode(value: Plussign212): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
