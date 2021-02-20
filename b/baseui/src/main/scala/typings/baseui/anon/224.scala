package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1
import typings.baseui.baseuiStrings.US
import typings.baseui.baseuiStrings.`United States`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `224` extends StObject {
  
  var dialCode: Plussign1 = js.native
  
  var id: US = js.native
  
  var label: `United States` = js.native
}
object `224` {
  
  @scala.inline
  def apply(dialCode: Plussign1, id: US, label: `United States`): `224` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`224`]
  }
  
  @scala.inline
  implicit class `224MutableBuilder`[Self <: `224`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: US): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `United States`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
