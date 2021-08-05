package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign84
import typings.baseui.baseuiStrings.VN
import typings.baseui.baseuiStrings.`Vietnam LeftparenthesisViệt NamRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `230` extends StObject {
  
  var dialCode: Plussign84
  
  var id: VN
  
  var label: `Vietnam LeftparenthesisViệt NamRightparenthesis`
}
object `230` {
  
  inline def apply(): `230` = {
    val __obj = js.Dynamic.literal(dialCode = "+84", id = "VN", label = "Vietnam (Vi\u1EC7t Nam)")
    __obj.asInstanceOf[`230`]
  }
  
  extension [Self <: `230`](x: Self) {
    
    inline def setDialCode(value: Plussign84): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Vietnam LeftparenthesisViệt NamRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
