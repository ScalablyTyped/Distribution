package typings.baseui.anon

import typings.baseui.baseuiStrings.DM
import typings.baseui.baseuiStrings.Dominica
import typings.baseui.baseuiStrings.Plussign1767
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `54` extends StObject {
  
  var dialCode: Plussign1767 = js.native
  
  var id: DM = js.native
  
  var label: Dominica = js.native
}
object `54` {
  
  @scala.inline
  def apply(dialCode: Plussign1767, id: DM, label: Dominica): `54` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`54`]
  }
  
  @scala.inline
  implicit class `54MutableBuilder`[Self <: `54`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1767): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Dominica): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
