package typings.baseui.anon

import typings.baseui.baseuiStrings.PH
import typings.baseui.baseuiStrings.Philippines
import typings.baseui.baseuiStrings.Plussign63
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  val dialCode: Plussign63
  
  val id: PH
  
  val label: Philippines
}
object `180` {
  
  inline def apply(): `180` = {
    val __obj = js.Dynamic.literal(dialCode = "+63", id = "PH", label = "Philippines")
    __obj.asInstanceOf[`180`]
  }
  
  extension [Self <: `180`](x: Self) {
    
    inline def setDialCode(value: Plussign63): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Philippines): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
