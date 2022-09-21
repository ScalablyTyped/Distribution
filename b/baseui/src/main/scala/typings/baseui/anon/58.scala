package typings.baseui.anon

import typings.baseui.baseuiStrings.CX
import typings.baseui.baseuiStrings.Plussign61
import typings.baseui.baseuiStrings.`Christmas Island`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  val dialCode: Plussign61
  
  val id: CX
  
  val label: `Christmas Island`
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(dialCode = "+61", id = "CX", label = "Christmas Island")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setDialCode(value: Plussign61): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Christmas Island`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
