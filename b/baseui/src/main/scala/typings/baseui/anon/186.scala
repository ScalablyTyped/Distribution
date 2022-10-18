package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign40
import typings.baseui.baseuiStrings.RO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  val dialCode: Plussign40
  
  val id: RO
  
  val label: /* Romania (România) */ String
}
object `186` {
  
  inline def apply(): `186` = {
    val __obj = js.Dynamic.literal(dialCode = "+40", id = "RO", label = "Romania (Rom\u00E2nia)")
    __obj.asInstanceOf[`186`]
  }
  
  extension [Self <: `186`](x: Self) {
    
    inline def setDialCode(value: Plussign40): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: RO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Romania (România) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
