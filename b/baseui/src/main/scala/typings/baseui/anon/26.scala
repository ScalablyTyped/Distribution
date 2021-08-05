package typings.baseui.anon

import typings.baseui.baseuiStrings.BG
import typings.baseui.baseuiStrings.Plussign359
import typings.baseui.baseuiStrings.`Bulgaria LeftparenthesisБългарияRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var dialCode: Plussign359
  
  var id: BG
  
  var label: `Bulgaria LeftparenthesisБългарияRightparenthesis`
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(dialCode = "+359", id = "BG", label = "Bulgaria (\u0411\u044A\u043B\u0433\u0430\u0440\u0438\u044F)")
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setDialCode(value: Plussign359): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Bulgaria LeftparenthesisБългарияRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
