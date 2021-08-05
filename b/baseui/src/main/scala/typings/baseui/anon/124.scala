package typings.baseui.anon

import typings.baseui.baseuiStrings.ML
import typings.baseui.baseuiStrings.Mali
import typings.baseui.baseuiStrings.Plussign223
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var dialCode: Plussign223
  
  var id: ML
  
  var label: Mali
}
object `124` {
  
  inline def apply(): `124` = {
    val __obj = js.Dynamic.literal(dialCode = "+223", id = "ML", label = "Mali")
    __obj.asInstanceOf[`124`]
  }
  
  extension [Self <: `124`](x: Self) {
    
    inline def setDialCode(value: Plussign223): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ML): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Mali): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
