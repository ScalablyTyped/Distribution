package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1868
import typings.baseui.baseuiStrings.TT
import typings.baseui.baseuiStrings.`Trinisoad and Tobago`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  var dialCode: Plussign1868
  
  var id: TT
  
  var label: `Trinisoad and Tobago`
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal(dialCode = "+1868", id = "TT", label = "Trinisoad and Tobago")
    __obj.asInstanceOf[`213`]
  }
  
  extension [Self <: `213`](x: Self) {
    
    inline def setDialCode(value: Plussign1868): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Trinisoad and Tobago`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
