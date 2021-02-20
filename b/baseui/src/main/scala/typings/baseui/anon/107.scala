package typings.baseui.anon

import typings.baseui.baseuiStrings.KW
import typings.baseui.baseuiStrings.Plussign965
import typings.baseui.baseuiStrings.`Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `107` extends StObject {
  
  var dialCode: Plussign965 = js.native
  
  var id: KW = js.native
  
  var label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis` = js.native
}
object `107` {
  
  @scala.inline
  def apply(dialCode: Plussign965, id: KW, label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): `107` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit class `107MutableBuilder`[Self <: `107`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign965): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
