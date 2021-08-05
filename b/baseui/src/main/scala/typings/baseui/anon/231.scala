package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign681
import typings.baseui.baseuiStrings.WF
import typings.baseui.baseuiStrings.`Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  var dialCode: Plussign681
  
  var id: WF
  
  var label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
}
object `231` {
  
  inline def apply(): `231` = {
    val __obj = js.Dynamic.literal(dialCode = "+681", id = "WF", label = "Wallis and Futuna (Wallis-et-Futuna)")
    __obj.asInstanceOf[`231`]
  }
  
  extension [Self <: `231`](x: Self) {
    
    inline def setDialCode(value: Plussign681): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: WF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
