package typings.baseui.anon

import typings.baseui.baseuiStrings.CM
import typings.baseui.baseuiStrings.Plussign237
import typings.baseui.baseuiStrings.`Cameroon LeftparenthesisCamerounRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var dialCode: Plussign237
  
  var id: CM
  
  var label: `Cameroon LeftparenthesisCamerounRightparenthesis`
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal(dialCode = "+237", id = "CM", label = "Cameroon (Cameroun)")
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setDialCode(value: Plussign237): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Cameroon LeftparenthesisCamerounRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
