package typings.baseui.anon

import typings.baseui.baseuiStrings.NO
import typings.baseui.baseuiStrings.Plussign47
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  val dialCode: Plussign47
  
  val id: NO
  
  val label: /* Norway (Norge) */ String
}
object `171` {
  
  inline def apply(): `171` = {
    val __obj = js.Dynamic.literal(dialCode = "+47", id = "NO", label = "Norway (Norge)")
    __obj.asInstanceOf[`171`]
  }
  
  extension [Self <: `171`](x: Self) {
    
    inline def setDialCode(value: Plussign47): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Norway (Norge) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
