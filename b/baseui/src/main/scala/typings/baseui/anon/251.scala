package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign681
import typings.baseui.baseuiStrings.WF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `251` extends StObject {
  
  val dialCode: Plussign681
  
  val id: WF
  
  val label: String
}
object `251` {
  
  inline def apply(): `251` = {
    val __obj = js.Dynamic.literal(dialCode = "+681", id = "WF", label = "Wallis and Futuna (Wallis-et-Futuna)")
    __obj.asInstanceOf[`251`]
  }
  
  extension [Self <: `251`](x: Self) {
    
    inline def setDialCode(value: Plussign681): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: WF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
