package typings.baseui.anon

import typings.baseui.baseuiStrings.CN
import typings.baseui.baseuiStrings.Plussign86
import typings.baseui.baseuiStrings.`China Leftparenthesis中国Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  val dialCode: Plussign86
  
  val id: CN
  
  val label: `China Leftparenthesis中国Rightparenthesis`
}
object `57` {
  
  inline def apply(): `57` = {
    val __obj = js.Dynamic.literal(dialCode = "+86", id = "CN", label = "China (\u4E2D\u56FD)")
    __obj.asInstanceOf[`57`]
  }
  
  extension [Self <: `57`](x: Self) {
    
    inline def setDialCode(value: Plussign86): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `China Leftparenthesis中国Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
