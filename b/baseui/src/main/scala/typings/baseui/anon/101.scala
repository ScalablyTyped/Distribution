package typings.baseui.anon

import typings.baseui.baseuiStrings.JE
import typings.baseui.baseuiStrings.Jersey
import typings.baseui.baseuiStrings.Plussign44
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `101` extends StObject {
  
  var dialCode: Plussign44 = js.native
  
  var id: JE = js.native
  
  var label: Jersey = js.native
}
object `101` {
  
  @scala.inline
  def apply(dialCode: Plussign44, id: JE, label: Jersey): `101` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`101`]
  }
  
  @scala.inline
  implicit class `101MutableBuilder`[Self <: `101`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: JE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Jersey): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
