package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign681
import typings.baseui.baseuiStrings.WF
import typings.baseui.baseuiStrings.`Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `231` extends StObject {
  
  var dialCode: Plussign681 = js.native
  
  var id: WF = js.native
  
  var label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis` = js.native
}
object `231` {
  
  @scala.inline
  def apply(
    dialCode: Plussign681,
    id: WF,
    label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
  ): `231` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  
  @scala.inline
  implicit class `231MutableBuilder`[Self <: `231`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign681): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: WF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
