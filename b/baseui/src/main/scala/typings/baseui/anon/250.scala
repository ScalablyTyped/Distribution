package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign260
import typings.baseui.baseuiStrings.ZM
import typings.baseui.baseuiStrings.Zambia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250` extends StObject {
  
  val dialCode: Plussign260
  
  val id: ZM
  
  val label: Zambia
}
object `250` {
  
  inline def apply(): `250` = {
    val __obj = js.Dynamic.literal(dialCode = "+260", id = "ZM", label = "Zambia")
    __obj.asInstanceOf[`250`]
  }
  
  extension [Self <: `250`](x: Self) {
    
    inline def setDialCode(value: Plussign260): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ZM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Zambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
