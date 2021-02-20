package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign256
import typings.baseui.baseuiStrings.UG
import typings.baseui.baseuiStrings.Uganda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `220` extends StObject {
  
  var dialCode: Plussign256 = js.native
  
  var id: UG = js.native
  
  var label: Uganda = js.native
}
object `220` {
  
  @scala.inline
  def apply(dialCode: Plussign256, id: UG, label: Uganda): `220` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`220`]
  }
  
  @scala.inline
  implicit class `220MutableBuilder`[Self <: `220`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign256): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: UG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Uganda): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
