package typings.baseui.anon

import typings.baseui.baseuiStrings.DO
import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.`Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var dialCode: Plussign1
  
  var id: DO
  
  var label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "DO", label = "Dominican Republic (Rep\u00FAblica Dominicana)")
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
