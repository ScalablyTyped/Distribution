package typings.baseui.anon

import typings.baseui.baseuiStrings.GG
import typings.baseui.baseuiStrings.Guernsey
import typings.baseui.baseuiStrings.Plussign44
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var dialCode: Plussign44
  
  var id: GG
  
  var label: Guernsey
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "GG", label = "Guernsey")
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guernsey): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
