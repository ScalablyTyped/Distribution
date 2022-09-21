package typings.baseui.anon

import typings.baseui.baseuiStrings.BT
import typings.baseui.baseuiStrings.Plussign975
import typings.baseui.baseuiStrings.`Bhutan LeftparenthesisའབྲུགRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  val dialCode: Plussign975
  
  val id: BT
  
  val label: `Bhutan LeftparenthesisའབྲུགRightparenthesis`
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal(dialCode = "+975", id = "BT", label = "Bhutan (\u0F60\u0F56\u0FB2\u0F74\u0F42)")
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setDialCode(value: Plussign975): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
