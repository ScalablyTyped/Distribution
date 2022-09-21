package typings.baseui.anon

import typings.baseui.baseuiStrings.PA
import typings.baseui.baseuiStrings.Plussign507
import typings.baseui.baseuiStrings.`Panama LeftparenthesisPanamáRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  val dialCode: Plussign507
  
  val id: PA
  
  val label: `Panama LeftparenthesisPanamáRightparenthesis`
}
object `179` {
  
  inline def apply(): `179` = {
    val __obj = js.Dynamic.literal(dialCode = "+507", id = "PA", label = "Panama (Panam\u00E1)")
    __obj.asInstanceOf[`179`]
  }
  
  extension [Self <: `179`](x: Self) {
    
    inline def setDialCode(value: Plussign507): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Panama LeftparenthesisPanamáRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
