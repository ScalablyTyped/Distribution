package typings.baseui.anon

import typings.baseui.baseuiStrings.MU
import typings.baseui.baseuiStrings.Plussign230
import typings.baseui.baseuiStrings.`Mauritius LeftparenthesisMorisRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var dialCode: Plussign230
  
  var id: MU
  
  var label: `Mauritius LeftparenthesisMorisRightparenthesis`
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal(dialCode = "+230", id = "MU", label = "Mauritius (Moris)")
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setDialCode(value: Plussign230): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Mauritius LeftparenthesisMorisRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
