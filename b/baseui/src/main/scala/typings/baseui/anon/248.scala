package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.VA
import typings.baseui.baseuiStrings.`Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248` extends StObject {
  
  val dialCode: Plussign39
  
  val id: VA
  
  val label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
}
object `248` {
  
  inline def apply(): `248` = {
    val __obj = js.Dynamic.literal(dialCode = "+39", id = "VA", label = "Vatican City (Citt\u00E0 del Vaticano)")
    __obj.asInstanceOf[`248`]
  }
  
  extension [Self <: `248`](x: Self) {
    
    inline def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
