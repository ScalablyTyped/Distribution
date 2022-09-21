package typings.baseui.anon

import typings.baseui.baseuiStrings.MD
import typings.baseui.baseuiStrings.Plussign373
import typings.baseui.baseuiStrings.`Moldova LeftparenthesisRepublica MoldovaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  val dialCode: Plussign373
  
  val id: MD
  
  val label: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis`
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal(dialCode = "+373", id = "MD", label = "Moldova (Republica Moldova)")
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setDialCode(value: Plussign373): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
