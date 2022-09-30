package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign886
import typings.baseui.baseuiStrings.TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  val dialCode: Plussign886
  
  val id: TW
  
  val label: String
}
object `225` {
  
  inline def apply(): `225` = {
    val __obj = js.Dynamic.literal(dialCode = "+886", id = "TW", label = "Taiwan (\u53F0\u7063)")
    __obj.asInstanceOf[`225`]
  }
  
  extension [Self <: `225`](x: Self) {
    
    inline def setDialCode(value: Plussign886): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
