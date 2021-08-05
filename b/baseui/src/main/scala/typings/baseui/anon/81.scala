package typings.baseui.anon

import typings.baseui.baseuiStrings.GT
import typings.baseui.baseuiStrings.Guatemala
import typings.baseui.baseuiStrings.Plussign502
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var dialCode: Plussign502
  
  var id: GT
  
  var label: Guatemala
}
object `81` {
  
  inline def apply(): `81` = {
    val __obj = js.Dynamic.literal(dialCode = "+502", id = "GT", label = "Guatemala")
    __obj.asInstanceOf[`81`]
  }
  
  extension [Self <: `81`](x: Self) {
    
    inline def setDialCode(value: Plussign502): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guatemala): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
