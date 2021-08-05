package typings.baseui.anon

import typings.baseui.baseuiStrings.ME
import typings.baseui.baseuiStrings.Plussign382
import typings.baseui.baseuiStrings.`Montenegro LeftparenthesisCrna GoraRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  var dialCode: Plussign382
  
  var id: ME
  
  var label: `Montenegro LeftparenthesisCrna GoraRightparenthesis`
}
object `136` {
  
  inline def apply(): `136` = {
    val __obj = js.Dynamic.literal(dialCode = "+382", id = "ME", label = "Montenegro (Crna Gora)")
    __obj.asInstanceOf[`136`]
  }
  
  extension [Self <: `136`](x: Self) {
    
    inline def setDialCode(value: Plussign382): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ME): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Montenegro LeftparenthesisCrna GoraRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
