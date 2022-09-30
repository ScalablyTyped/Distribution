package typings.baseui.anon

import typings.baseui.baseuiStrings.OM
import typings.baseui.baseuiStrings.Plussign968
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  val dialCode: Plussign968
  
  val id: OM
  
  val label: String
}
object `175` {
  
  inline def apply(): `175` = {
    val __obj = js.Dynamic.literal(dialCode = "+968", id = "OM", label = "Oman (\u202B\u0639\u064F\u0645\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setDialCode(value: Plussign968): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: OM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
