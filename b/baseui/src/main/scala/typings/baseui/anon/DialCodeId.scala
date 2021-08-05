package typings.baseui.anon

import typings.baseui.baseuiStrings.DZ
import typings.baseui.baseuiStrings.Plussign213
import typings.baseui.baseuiStrings.`Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialCodeId extends StObject {
  
  var dialCode: Plussign213
  
  var id: DZ
  
  var label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
}
object DialCodeId {
  
  inline def apply(): DialCodeId = {
    val __obj = js.Dynamic.literal(dialCode = "+213", id = "DZ", label = "Algeria (\u202B\u0627\u0644\u062C\u0632\u0627\u0626\u0631\u202C\u200E)")
    __obj.asInstanceOf[DialCodeId]
  }
  
  extension [Self <: DialCodeId](x: Self) {
    
    inline def setDialCode(value: Plussign213): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
