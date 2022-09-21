package typings.baseui.anon

import typings.baseui.baseuiStrings.MU
import typings.baseui.baseuiStrings.Plussign230
import typings.baseui.baseuiStrings.`Mauritius LeftparenthesisMorisRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  val dialCode: Plussign230
  
  val id: MU
  
  val label: `Mauritius LeftparenthesisMorisRightparenthesis`
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal(dialCode = "+230", id = "MU", label = "Mauritius (Moris)")
    __obj.asInstanceOf[`149`]
  }
  
  extension [Self <: `149`](x: Self) {
    
    inline def setDialCode(value: Plussign230): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Mauritius LeftparenthesisMorisRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
