package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign84
import typings.baseui.baseuiStrings.VN
import typings.baseui.baseuiStrings.`Vietnam LeftparenthesisViệt NamRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250` extends StObject {
  
  val dialCode: Plussign84
  
  val id: VN
  
  val label: `Vietnam LeftparenthesisViệt NamRightparenthesis`
}
object `250` {
  
  inline def apply(): `250` = {
    val __obj = js.Dynamic.literal(dialCode = "+84", id = "VN", label = "Vietnam (Vi\u1EC7t Nam)")
    __obj.asInstanceOf[`250`]
  }
  
  extension [Self <: `250`](x: Self) {
    
    inline def setDialCode(value: Plussign84): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Vietnam LeftparenthesisViệt NamRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
