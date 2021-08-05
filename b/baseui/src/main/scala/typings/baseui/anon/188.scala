package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1721
import typings.baseui.baseuiStrings.SX
import typings.baseui.baseuiStrings.`Sint Maarten`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var dialCode: Plussign1721
  
  var id: SX
  
  var label: `Sint Maarten`
}
object `188` {
  
  inline def apply(): `188` = {
    val __obj = js.Dynamic.literal(dialCode = "+1721", id = "SX", label = "Sint Maarten")
    __obj.asInstanceOf[`188`]
  }
  
  extension [Self <: `188`](x: Self) {
    
    inline def setDialCode(value: Plussign1721): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Sint Maarten`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
