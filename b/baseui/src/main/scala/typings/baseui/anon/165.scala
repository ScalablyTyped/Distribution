package typings.baseui.anon

import typings.baseui.baseuiStrings.PT
import typings.baseui.baseuiStrings.Plussign351
import typings.baseui.baseuiStrings.Portugal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `165` extends StObject {
  
  var dialCode: Plussign351 = js.native
  
  var id: PT = js.native
  
  var label: Portugal = js.native
}
object `165` {
  
  @scala.inline
  def apply(dialCode: Plussign351, id: PT, label: Portugal): `165` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`165`]
  }
  
  @scala.inline
  implicit class `165MutableBuilder`[Self <: `165`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign351): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Portugal): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
