package typings.baseui.anon

import typings.baseui.baseuiStrings.GY
import typings.baseui.baseuiStrings.Guyana
import typings.baseui.baseuiStrings.Plussign592
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `85` extends StObject {
  
  var dialCode: Plussign592 = js.native
  
  var id: GY = js.native
  
  var label: Guyana = js.native
}
object `85` {
  
  @scala.inline
  def apply(dialCode: Plussign592, id: GY, label: Guyana): `85` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit class `85MutableBuilder`[Self <: `85`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign592): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guyana): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
