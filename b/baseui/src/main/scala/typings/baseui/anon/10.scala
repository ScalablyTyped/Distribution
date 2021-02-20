package typings.baseui.anon

import typings.baseui.baseuiStrings.BH
import typings.baseui.baseuiStrings.Plussign973
import typings.baseui.baseuiStrings.`Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var dialCode: Plussign973 = js.native
  
  var id: BH = js.native
  
  var label: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis` = js.native
}
object `10` {
  
  @scala.inline
  def apply(dialCode: Plussign973, id: BH, label: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`): `10` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign973): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Bahrain Leftparenthesis‫البحرين‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
