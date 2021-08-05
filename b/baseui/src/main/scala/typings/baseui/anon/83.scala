package typings.baseui.anon

import typings.baseui.baseuiStrings.GN
import typings.baseui.baseuiStrings.Plussign224
import typings.baseui.baseuiStrings.`Guinea LeftparenthesisGuinéeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var dialCode: Plussign224
  
  var id: GN
  
  var label: `Guinea LeftparenthesisGuinéeRightparenthesis`
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal(dialCode = "+224", id = "GN", label = "Guinea (Guin\u00E9e)")
    __obj.asInstanceOf[`83`]
  }
  
  extension [Self <: `83`](x: Self) {
    
    inline def setDialCode(value: Plussign224): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Guinea LeftparenthesisGuinéeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
