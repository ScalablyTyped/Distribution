package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign386
import typings.baseui.baseuiStrings.SI
import typings.baseui.baseuiStrings.`Slovenia LeftparenthesisSlovenijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `190` extends StObject {
  
  var dialCode: Plussign386
  
  var id: SI
  
  var label: `Slovenia LeftparenthesisSlovenijaRightparenthesis`
}
object `190` {
  
  inline def apply(): `190` = {
    val __obj = js.Dynamic.literal(dialCode = "+386", id = "SI", label = "Slovenia (Slovenija)")
    __obj.asInstanceOf[`190`]
  }
  
  extension [Self <: `190`](x: Self) {
    
    inline def setDialCode(value: Plussign386): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
