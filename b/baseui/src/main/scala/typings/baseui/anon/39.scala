package typings.baseui.anon

import typings.baseui.baseuiStrings.BO
import typings.baseui.baseuiStrings.Bolivia
import typings.baseui.baseuiStrings.Plussign591
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  val dialCode: Plussign591
  
  val id: BO
  
  val label: Bolivia
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(dialCode = "+591", id = "BO", label = "Bolivia")
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setDialCode(value: Plussign591): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Bolivia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
