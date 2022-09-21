package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign260
import typings.baseui.baseuiStrings.ZM
import typings.baseui.baseuiStrings.Zambia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `253` extends StObject {
  
  val dialCode: Plussign260
  
  val id: ZM
  
  val label: Zambia
}
object `253` {
  
  inline def apply(): `253` = {
    val __obj = js.Dynamic.literal(dialCode = "+260", id = "ZM", label = "Zambia")
    __obj.asInstanceOf[`253`]
  }
  
  extension [Self <: `253`](x: Self) {
    
    inline def setDialCode(value: Plussign260): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ZM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Zambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
