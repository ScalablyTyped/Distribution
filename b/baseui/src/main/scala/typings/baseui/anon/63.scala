package typings.baseui.anon

import typings.baseui.baseuiStrings.CG
import typings.baseui.baseuiStrings.Plussign242
import typings.baseui.baseuiStrings.`Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  val dialCode: Plussign242
  
  val id: CG
  
  val label: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal(dialCode = "+242", id = "CG", label = "Congo (Republic) (Congo-Brazzaville)")
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def setDialCode(value: Plussign242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
