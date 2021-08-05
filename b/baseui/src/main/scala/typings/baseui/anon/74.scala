package typings.baseui.anon

import typings.baseui.baseuiStrings.GH
import typings.baseui.baseuiStrings.Plussign233
import typings.baseui.baseuiStrings.`Ghana LeftparenthesisGaanaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var dialCode: Plussign233
  
  var id: GH
  
  var label: `Ghana LeftparenthesisGaanaRightparenthesis`
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal(dialCode = "+233", id = "GH", label = "Ghana (Gaana)")
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setDialCode(value: Plussign233): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Ghana LeftparenthesisGaanaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
