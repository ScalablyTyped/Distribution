package typings.baseui.anon

import typings.baseui.baseuiStrings.MG
import typings.baseui.baseuiStrings.Plussign261
import typings.baseui.baseuiStrings.`Madagascar LeftparenthesisMadagasikaraRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  val dialCode: Plussign261
  
  val id: MG
  
  val label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`
}
object `140` {
  
  inline def apply(): `140` = {
    val __obj = js.Dynamic.literal(dialCode = "+261", id = "MG", label = "Madagascar (Madagasikara)")
    __obj.asInstanceOf[`140`]
  }
  
  extension [Self <: `140`](x: Self) {
    
    inline def setDialCode(value: Plussign261): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
