package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign90
import typings.baseui.baseuiStrings.TR
import typings.baseui.baseuiStrings.`Turkey LeftparenthesisTürkiyeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `215` extends StObject {
  
  var dialCode: Plussign90 = js.native
  
  var id: TR = js.native
  
  var label: `Turkey LeftparenthesisTürkiyeRightparenthesis` = js.native
}
object `215` {
  
  @scala.inline
  def apply(dialCode: Plussign90, id: TR, label: `Turkey LeftparenthesisTürkiyeRightparenthesis`): `215` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`215`]
  }
  
  @scala.inline
  implicit class `215MutableBuilder`[Self <: `215`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign90): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Turkey LeftparenthesisTürkiyeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
