package typings.baseui.anon

import typings.baseui.baseuiStrings.NC
import typings.baseui.baseuiStrings.Plussign687
import typings.baseui.baseuiStrings.`New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var dialCode: Plussign687
  
  var id: NC
  
  var label: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`
}
object `145` {
  
  inline def apply(): `145` = {
    val __obj = js.Dynamic.literal(dialCode = "+687", id = "NC", label = "New Caledonia (Nouvelle-Cal\u00E9donie)")
    __obj.asInstanceOf[`145`]
  }
  
  extension [Self <: `145`](x: Self) {
    
    inline def setDialCode(value: Plussign687): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `New Caledonia LeftparenthesisNouvelle-CalédonieRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
