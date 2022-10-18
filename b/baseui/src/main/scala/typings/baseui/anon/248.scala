package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign681
import typings.baseui.baseuiStrings.WF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248` extends StObject {
  
  val dialCode: Plussign681
  
  val id: WF
  
  val label: /* Wallis and Futuna (Wallis-et-Futuna) */ String
}
object `248` {
  
  inline def apply(): `248` = {
    val __obj = js.Dynamic.literal(dialCode = "+681", id = "WF", label = "Wallis and Futuna (Wallis-et-Futuna)")
    __obj.asInstanceOf[`248`]
  }
  
  extension [Self <: `248`](x: Self) {
    
    inline def setDialCode(value: Plussign681): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: WF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Wallis and Futuna (Wallis-et-Futuna) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
