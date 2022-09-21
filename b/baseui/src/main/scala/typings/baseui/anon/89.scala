package typings.baseui.anon

import typings.baseui.baseuiStrings.PF
import typings.baseui.baseuiStrings.Plussign689
import typings.baseui.baseuiStrings.`French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  val dialCode: Plussign689
  
  val id: PF
  
  val label: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`
}
object `89` {
  
  inline def apply(): `89` = {
    val __obj = js.Dynamic.literal(dialCode = "+689", id = "PF", label = "French Polynesia (Polyn\u00E9sie fran\u00E7aise)")
    __obj.asInstanceOf[`89`]
  }
  
  extension [Self <: `89`](x: Self) {
    
    inline def setDialCode(value: Plussign689): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `French Polynesia LeftparenthesisPolynésie françaiseRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
