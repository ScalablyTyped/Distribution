package typings.baseui.anon

import typings.baseui.baseuiStrings.GM
import typings.baseui.baseuiStrings.Gambia
import typings.baseui.baseuiStrings.Plussign220
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  val dialCode: Plussign220
  
  val id: GM
  
  val label: Gambia
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal(dialCode = "+220", id = "GM", label = "Gambia")
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setDialCode(value: Plussign220): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Gambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
