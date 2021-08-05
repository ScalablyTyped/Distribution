package typings.baseui.anon

import typings.baseui.baseuiStrings.GR
import typings.baseui.baseuiStrings.Plussign30
import typings.baseui.baseuiStrings.`Greece LeftparenthesisΕλλάδαRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var dialCode: Plussign30
  
  var id: GR
  
  var label: `Greece LeftparenthesisΕλλάδαRightparenthesis`
}
object `76` {
  
  inline def apply(): `76` = {
    val __obj = js.Dynamic.literal(dialCode = "+30", id = "GR", label = "Greece (\u0395\u03BB\u03BB\u03AC\u03B4\u03B1)")
    __obj.asInstanceOf[`76`]
  }
  
  extension [Self <: `76`](x: Self) {
    
    inline def setDialCode(value: Plussign30): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Greece LeftparenthesisΕλλάδαRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
