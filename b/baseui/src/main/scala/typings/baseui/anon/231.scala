package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign216
import typings.baseui.baseuiStrings.TN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  val dialCode: Plussign216
  
  val id: TN
  
  val label: /* Tunisia (‫تونس‬‎) */ String
}
object `231` {
  
  inline def apply(): `231` = {
    val __obj = js.Dynamic.literal(dialCode = "+216", id = "TN", label = "Tunisia (\u202B\u062A\u0648\u0646\u0633\u202C\u200E)")
    __obj.asInstanceOf[`231`]
  }
  
  extension [Self <: `231`](x: Self) {
    
    inline def setDialCode(value: Plussign216): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Tunisia (‫تونس‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
