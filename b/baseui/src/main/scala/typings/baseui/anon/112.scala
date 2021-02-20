package typings.baseui.anon

import typings.baseui.baseuiStrings.LS
import typings.baseui.baseuiStrings.Lesotho
import typings.baseui.baseuiStrings.Plussign266
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `112` extends StObject {
  
  var dialCode: Plussign266 = js.native
  
  var id: LS = js.native
  
  var label: Lesotho = js.native
}
object `112` {
  
  @scala.inline
  def apply(dialCode: Plussign266, id: LS, label: Lesotho): `112` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit class `112MutableBuilder`[Self <: `112`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign266): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Lesotho): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
