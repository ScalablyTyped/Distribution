package typings.baseui.anon

import typings.baseui.baseuiStrings.AM
import typings.baseui.baseuiStrings.Plussign374
import typings.baseui.baseuiStrings.`Armenia LeftparenthesisՀայաստանRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  val dialCode: Plussign374
  
  val id: AM
  
  val label: `Armenia LeftparenthesisՀայաստանRightparenthesis`
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(dialCode = "+374", id = "AM", label = "Armenia (\u0540\u0561\u0575\u0561\u057D\u057F\u0561\u0576)")
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setDialCode(value: Plussign374): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Armenia LeftparenthesisՀայաստանRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
