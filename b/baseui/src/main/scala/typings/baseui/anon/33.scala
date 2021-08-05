package typings.baseui.anon

import typings.baseui.baseuiStrings.KY
import typings.baseui.baseuiStrings.Plussign1345
import typings.baseui.baseuiStrings.`Cayman Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var dialCode: Plussign1345
  
  var id: KY
  
  var label: `Cayman Islands`
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(dialCode = "+1345", id = "KY", label = "Cayman Islands")
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setDialCode(value: Plussign1345): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Cayman Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
