package typings.baseui.anon

import typings.baseui.baseuiStrings.DO
import typings.baseui.baseuiStrings.Plussign1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  val dialCode: Plussign1
  
  val id: DO
  
  val label: /* Dominican Republic (República Dominicana) */ String
}
object `72` {
  
  inline def apply(): `72` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "DO", label = "Dominican Republic (Rep\u00FAblica Dominicana)")
    __obj.asInstanceOf[`72`]
  }
  
  extension [Self <: `72`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Dominican Republic (República Dominicana) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
