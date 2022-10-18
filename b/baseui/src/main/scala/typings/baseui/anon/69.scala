package typings.baseui.anon

import typings.baseui.baseuiStrings.DK
import typings.baseui.baseuiStrings.Plussign45
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  val dialCode: Plussign45
  
  val id: DK
  
  val label: /* Denmark (Danmark) */ String
}
object `69` {
  
  inline def apply(): `69` = {
    val __obj = js.Dynamic.literal(dialCode = "+45", id = "DK", label = "Denmark (Danmark)")
    __obj.asInstanceOf[`69`]
  }
  
  extension [Self <: `69`](x: Self) {
    
    inline def setDialCode(value: Plussign45): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Denmark (Danmark) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
