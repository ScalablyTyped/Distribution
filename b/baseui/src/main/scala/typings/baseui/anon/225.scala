package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign598
import typings.baseui.baseuiStrings.UY
import typings.baseui.baseuiStrings.Uruguay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `225` extends StObject {
  
  var dialCode: Plussign598 = js.native
  
  var id: UY = js.native
  
  var label: Uruguay = js.native
}
object `225` {
  
  @scala.inline
  def apply(dialCode: Plussign598, id: UY, label: Uruguay): `225` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit class `225MutableBuilder`[Self <: `225`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign598): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: UY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Uruguay): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
