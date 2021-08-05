package typings.baseui.anon

import typings.baseui.baseuiStrings.CG
import typings.baseui.baseuiStrings.Plussign242
import typings.baseui.baseuiStrings.`Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  var dialCode: Plussign242
  
  var id: CG
  
  var label: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal(dialCode = "+242", id = "CG", label = "Congo (Republic) (Congo-Brazzaville)")
    __obj.asInstanceOf[`43`]
  }
  
  extension [Self <: `43`](x: Self) {
    
    inline def setDialCode(value: Plussign242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
