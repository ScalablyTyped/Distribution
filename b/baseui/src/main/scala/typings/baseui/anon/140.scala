package typings.baseui.anon

import typings.baseui.baseuiStrings.MM
import typings.baseui.baseuiStrings.Plussign95
import typings.baseui.baseuiStrings.`Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  var dialCode: Plussign95
  
  var id: MM
  
  var label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
}
object `140` {
  
  inline def apply(): `140` = {
    val __obj = js.Dynamic.literal(dialCode = "+95", id = "MM", label = "Myanmar (Burma) (\u1019\u103C\u1014\u103A\u1019\u102C)")
    __obj.asInstanceOf[`140`]
  }
  
  extension [Self <: `140`](x: Self) {
    
    inline def setDialCode(value: Plussign95): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
