package typings.baseui.anon

import typings.baseui.baseuiStrings.KH
import typings.baseui.baseuiStrings.Plussign855
import typings.baseui.baseuiStrings.`Cambodia Leftparenthesisកម្ពុជាRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `29` extends StObject {
  
  var dialCode: Plussign855 = js.native
  
  var id: KH = js.native
  
  var label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis` = js.native
}
object `29` {
  
  @scala.inline
  def apply(dialCode: Plussign855, id: KH, label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): `29` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign855): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
