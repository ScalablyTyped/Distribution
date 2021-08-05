package typings.baseui.anon

import typings.baseui.baseuiStrings.BS
import typings.baseui.baseuiStrings.Bahamas
import typings.baseui.baseuiStrings.Plussign1242
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var dialCode: Plussign1242
  
  var id: BS
  
  var label: Bahamas
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(dialCode = "+1242", id = "BS", label = "Bahamas")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setDialCode(value: Plussign1242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Bahamas): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
