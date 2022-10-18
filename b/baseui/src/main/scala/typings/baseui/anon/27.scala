package typings.baseui.anon

import typings.baseui.baseuiStrings.BH
import typings.baseui.baseuiStrings.Plussign973
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  val dialCode: Plussign973
  
  val id: BH
  
  val label: /* Bahrain (‫البحرين‬‎) */ String
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(dialCode = "+973", id = "BH", label = "Bahrain (\u202B\u0627\u0644\u0628\u062D\u0631\u064A\u0646\u202C\u200E)")
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setDialCode(value: Plussign973): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Bahrain (‫البحرين‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
