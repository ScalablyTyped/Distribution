package typings.baseui.anon

import typings.baseui.baseuiStrings.LB
import typings.baseui.baseuiStrings.Plussign961
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  val dialCode: Plussign961
  
  val id: LB
  
  val label: String
}
object `131` {
  
  inline def apply(): `131` = {
    val __obj = js.Dynamic.literal(dialCode = "+961", id = "LB", label = "Lebanon (\u202B\u0644\u0628\u0646\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`131`]
  }
  
  extension [Self <: `131`](x: Self) {
    
    inline def setDialCode(value: Plussign961): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
