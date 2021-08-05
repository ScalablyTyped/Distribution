package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1649
import typings.baseui.baseuiStrings.TC
import typings.baseui.baseuiStrings.`Turks and Caicos Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  var dialCode: Plussign1649
  
  var id: TC
  
  var label: `Turks and Caicos Islands`
}
object `217` {
  
  inline def apply(): `217` = {
    val __obj = js.Dynamic.literal(dialCode = "+1649", id = "TC", label = "Turks and Caicos Islands")
    __obj.asInstanceOf[`217`]
  }
  
  extension [Self <: `217`](x: Self) {
    
    inline def setDialCode(value: Plussign1649): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Turks and Caicos Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
