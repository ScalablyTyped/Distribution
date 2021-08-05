package typings.baseui.anon

import typings.baseui.baseuiStrings.PF
import typings.baseui.baseuiStrings.Plussign689
import typings.baseui.baseuiStrings.`French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  var dialCode: Plussign689
  
  var id: PF
  
  var label: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`
}
object `69` {
  
  inline def apply(): `69` = {
    val __obj = js.Dynamic.literal(dialCode = "+689", id = "PF", label = "French Polynesia (Polyn\u00E9sie fran\u00E7aise)")
    __obj.asInstanceOf[`69`]
  }
  
  extension [Self <: `69`](x: Self) {
    
    inline def setDialCode(value: Plussign689): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
