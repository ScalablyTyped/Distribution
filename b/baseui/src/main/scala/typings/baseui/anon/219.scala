package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1340
import typings.baseui.baseuiStrings.VI
import typings.baseui.baseuiStrings.`UDotSDot Virgin Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var dialCode: Plussign1340
  
  var id: VI
  
  var label: `UDotSDot Virgin Islands`
}
object `219` {
  
  inline def apply(): `219` = {
    val __obj = js.Dynamic.literal(dialCode = "+1340", id = "VI", label = "U.S. Virgin Islands")
    __obj.asInstanceOf[`219`]
  }
  
  extension [Self <: `219`](x: Self) {
    
    inline def setDialCode(value: Plussign1340): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `UDotSDot Virgin Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
