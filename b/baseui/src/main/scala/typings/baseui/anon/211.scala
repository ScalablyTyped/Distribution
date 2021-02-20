package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign690
import typings.baseui.baseuiStrings.TK
import typings.baseui.baseuiStrings.Tokelau
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `211` extends StObject {
  
  var dialCode: Plussign690 = js.native
  
  var id: TK = js.native
  
  var label: Tokelau = js.native
}
object `211` {
  
  @scala.inline
  def apply(dialCode: Plussign690, id: TK, label: Tokelau): `211` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`211`]
  }
  
  @scala.inline
  implicit class `211MutableBuilder`[Self <: `211`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign690): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tokelau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
