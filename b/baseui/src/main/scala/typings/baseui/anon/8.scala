package typings.baseui.anon

import typings.baseui.baseuiStrings.AZ
import typings.baseui.baseuiStrings.Plussign994
import typings.baseui.baseuiStrings.`Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var dialCode: Plussign994
  
  var id: AZ
  
  var label: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(dialCode = "+994", id = "AZ", label = "Azerbaijan (Az\u0259rbaycan)")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setDialCode(value: Plussign994): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
