package typings.baseui.anon

import typings.baseui.baseuiStrings.PE
import typings.baseui.baseuiStrings.Plussign51
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  val dialCode: Plussign51
  
  val id: PE
  
  val label: /* Peru (Perú) */ String
}
object `179` {
  
  inline def apply(): `179` = {
    val __obj = js.Dynamic.literal(dialCode = "+51", id = "PE", label = "Peru (Per\u00FA)")
    __obj.asInstanceOf[`179`]
  }
  
  extension [Self <: `179`](x: Self) {
    
    inline def setDialCode(value: Plussign51): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Peru (Perú) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
