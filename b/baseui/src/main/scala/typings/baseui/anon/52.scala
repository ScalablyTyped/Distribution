package typings.baseui.anon

import typings.baseui.baseuiStrings.DK
import typings.baseui.baseuiStrings.Plussign45
import typings.baseui.baseuiStrings.`Denmark LeftparenthesisDanmarkRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var dialCode: Plussign45
  
  var id: DK
  
  var label: `Denmark LeftparenthesisDanmarkRightparenthesis`
}
object `52` {
  
  inline def apply(): `52` = {
    val __obj = js.Dynamic.literal(dialCode = "+45", id = "DK", label = "Denmark (Danmark)")
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setDialCode(value: Plussign45): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Denmark LeftparenthesisDanmarkRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
