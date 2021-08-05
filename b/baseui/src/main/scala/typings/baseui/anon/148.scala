package typings.baseui.anon

import typings.baseui.baseuiStrings.NE
import typings.baseui.baseuiStrings.Plussign227
import typings.baseui.baseuiStrings.`Niger LeftparenthesisNijarRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var dialCode: Plussign227
  
  var id: NE
  
  var label: `Niger LeftparenthesisNijarRightparenthesis`
}
object `148` {
  
  inline def apply(): `148` = {
    val __obj = js.Dynamic.literal(dialCode = "+227", id = "NE", label = "Niger (Nijar)")
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setDialCode(value: Plussign227): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Niger LeftparenthesisNijarRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
