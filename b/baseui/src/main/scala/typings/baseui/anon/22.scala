package typings.baseui.anon

import typings.baseui.baseuiStrings.AW
import typings.baseui.baseuiStrings.Aruba
import typings.baseui.baseuiStrings.Plussign297
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  val dialCode: Plussign297
  
  val id: AW
  
  val label: Aruba
}
object `22` {
  
  inline def apply(): `22` = {
    val __obj = js.Dynamic.literal(dialCode = "+297", id = "AW", label = "Aruba")
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setDialCode(value: Plussign297): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Aruba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
