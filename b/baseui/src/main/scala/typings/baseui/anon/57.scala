package typings.baseui.anon

import typings.baseui.baseuiStrings.EG
import typings.baseui.baseuiStrings.Plussign20
import typings.baseui.baseuiStrings.`Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `57` extends StObject {
  
  var dialCode: Plussign20 = js.native
  
  var id: EG = js.native
  
  var label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis` = js.native
}
object `57` {
  
  @scala.inline
  def apply(dialCode: Plussign20, id: EG, label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): `57` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit class `57MutableBuilder`[Self <: `57`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign20): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: EG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
