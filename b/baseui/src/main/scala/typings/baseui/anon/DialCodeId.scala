package typings.baseui.anon

import typings.baseui.baseuiStrings.DZ
import typings.baseui.baseuiStrings.Plussign213
import typings.baseui.baseuiStrings.`Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialCodeId extends StObject {
  
  var dialCode: Plussign213 = js.native
  
  var id: DZ = js.native
  
  var label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis` = js.native
}
object DialCodeId {
  
  @scala.inline
  def apply(dialCode: Plussign213, id: DZ, label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): DialCodeId = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeId]
  }
  
  @scala.inline
  implicit class DialCodeIdMutableBuilder[Self <: DialCodeId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign213): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
