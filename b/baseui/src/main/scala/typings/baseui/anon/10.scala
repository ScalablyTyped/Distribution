package typings.baseui.anon

import typings.baseui.baseuiStrings.BH
import typings.baseui.baseuiStrings.Plussign973
import typings.baseui.baseuiStrings.`Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var dialCode: Plussign973
  
  var id: BH
  
  var label: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(dialCode = "+973", id = "BH", label = "Bahrain (\u202B\u0627\u0644\u0628\u062D\u0631\u064A\u0646\u202C\u200E)")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setDialCode(value: Plussign973): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
