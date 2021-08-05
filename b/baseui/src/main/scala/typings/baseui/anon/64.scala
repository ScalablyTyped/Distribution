package typings.baseui.anon

import typings.baseui.baseuiStrings.FO
import typings.baseui.baseuiStrings.Plussign298
import typings.baseui.baseuiStrings.`Faroe Islands LeftparenthesisFøroyarRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var dialCode: Plussign298
  
  var id: FO
  
  var label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`
}
object `64` {
  
  inline def apply(): `64` = {
    val __obj = js.Dynamic.literal(dialCode = "+298", id = "FO", label = "Faroe Islands (F\u00F8royar)")
    __obj.asInstanceOf[`64`]
  }
  
  extension [Self <: `64`](x: Self) {
    
    inline def setDialCode(value: Plussign298): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
