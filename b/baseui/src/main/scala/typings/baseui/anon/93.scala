package typings.baseui.anon

import typings.baseui.baseuiStrings.DE
import typings.baseui.baseuiStrings.Plussign49
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  val dialCode: Plussign49
  
  val id: DE
  
  val label: String
}
object `93` {
  
  inline def apply(): `93` = {
    val __obj = js.Dynamic.literal(dialCode = "+49", id = "DE", label = "Germany (Deutschland)")
    __obj.asInstanceOf[`93`]
  }
  
  extension [Self <: `93`](x: Self) {
    
    inline def setDialCode(value: Plussign49): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
