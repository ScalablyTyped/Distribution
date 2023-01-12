package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign886
import typings.baseui.baseuiStrings.TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  val dialCode: Plussign886
  
  val id: TW
  
  val label: /* Taiwan (台灣) */ String
}
object `222` {
  
  inline def apply(): `222` = {
    val __obj = js.Dynamic.literal(dialCode = "+886", id = "TW", label = "Taiwan (\u53F0\u7063)")
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `222`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign886): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Taiwan (台灣) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
