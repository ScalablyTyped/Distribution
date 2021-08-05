package typings.baseui.anon

import typings.baseui.baseuiStrings.NA
import typings.baseui.baseuiStrings.Plussign264
import typings.baseui.baseuiStrings.`Namibia LeftparenthesisNamibiëRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var dialCode: Plussign264
  
  var id: NA
  
  var label: `Namibia LeftparenthesisNamibiëRightparenthesis`
}
object `141` {
  
  inline def apply(): `141` = {
    val __obj = js.Dynamic.literal(dialCode = "+264", id = "NA", label = "Namibia (Namibi\u00EB)")
    __obj.asInstanceOf[`141`]
  }
  
  extension [Self <: `141`](x: Self) {
    
    inline def setDialCode(value: Plussign264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Namibia LeftparenthesisNamibiëRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
