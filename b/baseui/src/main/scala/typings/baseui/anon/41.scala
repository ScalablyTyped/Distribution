package typings.baseui.anon

import typings.baseui.baseuiStrings.KM
import typings.baseui.baseuiStrings.Plussign269
import typings.baseui.baseuiStrings.`Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `41` extends StObject {
  
  var dialCode: Plussign269 = js.native
  
  var id: KM = js.native
  
  var label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis` = js.native
}
object `41` {
  
  @scala.inline
  def apply(dialCode: Plussign269, id: KM, label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): `41` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit class `41MutableBuilder`[Self <: `41`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign269): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
