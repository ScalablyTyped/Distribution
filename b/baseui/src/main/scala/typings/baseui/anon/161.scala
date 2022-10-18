package typings.baseui.anon

import typings.baseui.baseuiStrings.NL
import typings.baseui.baseuiStrings.Plussign31
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  val dialCode: Plussign31
  
  val id: NL
  
  val label: /* Netherlands (Nederland) */ String
}
object `161` {
  
  inline def apply(): `161` = {
    val __obj = js.Dynamic.literal(dialCode = "+31", id = "NL", label = "Netherlands (Nederland)")
    __obj.asInstanceOf[`161`]
  }
  
  extension [Self <: `161`](x: Self) {
    
    inline def setDialCode(value: Plussign31): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Netherlands (Nederland) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
