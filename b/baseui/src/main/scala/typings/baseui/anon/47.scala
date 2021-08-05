package typings.baseui.anon

import typings.baseui.baseuiStrings.HR
import typings.baseui.baseuiStrings.Plussign385
import typings.baseui.baseuiStrings.`Croatia LeftparenthesisHrvatskaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var dialCode: Plussign385
  
  var id: HR
  
  var label: `Croatia LeftparenthesisHrvatskaRightparenthesis`
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal(dialCode = "+385", id = "HR", label = "Croatia (Hrvatska)")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setDialCode(value: Plussign385): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
