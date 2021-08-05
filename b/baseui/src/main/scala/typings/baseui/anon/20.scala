package typings.baseui.anon

import typings.baseui.baseuiStrings.BA
import typings.baseui.baseuiStrings.Plussign387
import typings.baseui.baseuiStrings.`Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var dialCode: Plussign387
  
  var id: BA
  
  var label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal(dialCode = "+387", id = "BA", label = "Bosnia and Herzegovina (\u0411\u043E\u0441\u043D\u0430 \u0438 \u0425\u0435\u0440\u0446\u0435\u0433\u043E\u0432\u0438\u043D\u0430)")
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setDialCode(value: Plussign387): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
