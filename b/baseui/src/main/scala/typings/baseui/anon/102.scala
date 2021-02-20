package typings.baseui.anon

import typings.baseui.baseuiStrings.JO
import typings.baseui.baseuiStrings.Plussign962
import typings.baseui.baseuiStrings.`Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `102` extends StObject {
  
  var dialCode: Plussign962 = js.native
  
  var id: JO = js.native
  
  var label: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis` = js.native
}
object `102` {
  
  @scala.inline
  def apply(dialCode: Plussign962, id: JO, label: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`): `102` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit class `102MutableBuilder`[Self <: `102`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign962): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: JO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
