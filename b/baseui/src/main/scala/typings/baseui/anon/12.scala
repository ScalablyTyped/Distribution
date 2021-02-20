package typings.baseui.anon

import typings.baseui.baseuiStrings.BB
import typings.baseui.baseuiStrings.Barbados
import typings.baseui.baseuiStrings.Plussign1246
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  var dialCode: Plussign1246 = js.native
  
  var id: BB = js.native
  
  var label: Barbados = js.native
}
object `12` {
  
  @scala.inline
  def apply(dialCode: Plussign1246, id: BB, label: Barbados): `12` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1246): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Barbados): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
