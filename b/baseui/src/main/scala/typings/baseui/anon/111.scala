package typings.baseui.anon

import typings.baseui.baseuiStrings.LB
import typings.baseui.baseuiStrings.Plussign961
import typings.baseui.baseuiStrings.`Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `111` extends StObject {
  
  var dialCode: Plussign961 = js.native
  
  var id: LB = js.native
  
  var label: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis` = js.native
}
object `111` {
  
  @scala.inline
  def apply(dialCode: Plussign961, id: LB, label: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`): `111` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit class `111MutableBuilder`[Self <: `111`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign961): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
