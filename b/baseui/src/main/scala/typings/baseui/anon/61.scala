package typings.baseui.anon

import typings.baseui.baseuiStrings.EE
import typings.baseui.baseuiStrings.Plussign372
import typings.baseui.baseuiStrings.`Estonia LeftparenthesisEestiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var dialCode: Plussign372
  
  var id: EE
  
  var label: `Estonia LeftparenthesisEestiRightparenthesis`
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal(dialCode = "+372", id = "EE", label = "Estonia (Eesti)")
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setDialCode(value: Plussign372): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: EE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Estonia LeftparenthesisEestiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
