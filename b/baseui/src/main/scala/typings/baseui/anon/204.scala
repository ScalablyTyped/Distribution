package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign963
import typings.baseui.baseuiStrings.SY
import typings.baseui.baseuiStrings.`Syria Leftparenthesis‫سوريا‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `204` extends StObject {
  
  var dialCode: Plussign963 = js.native
  
  var id: SY = js.native
  
  var label: `Syria Leftparenthesis‫سوريا‬‎Rightparenthesis` = js.native
}
object `204` {
  
  @scala.inline
  def apply(dialCode: Plussign963, id: SY, label: `Syria Leftparenthesis‫سوريا‬‎Rightparenthesis`): `204` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit class `204MutableBuilder`[Self <: `204`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign963): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Syria Leftparenthesis‫سوريا‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
