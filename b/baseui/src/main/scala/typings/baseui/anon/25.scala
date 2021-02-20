package typings.baseui.anon

import typings.baseui.baseuiStrings.BN
import typings.baseui.baseuiStrings.Brunei
import typings.baseui.baseuiStrings.Plussign673
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `25` extends StObject {
  
  var dialCode: Plussign673 = js.native
  
  var id: BN = js.native
  
  var label: Brunei = js.native
}
object `25` {
  
  @scala.inline
  def apply(dialCode: Plussign673, id: BN, label: Brunei): `25` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign673): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Brunei): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
