package typings.baseui.anon

import typings.baseui.baseuiStrings.Kosovo
import typings.baseui.baseuiStrings.Plussign383
import typings.baseui.baseuiStrings.XK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `106` extends StObject {
  
  var dialCode: Plussign383 = js.native
  
  var id: XK = js.native
  
  var label: Kosovo = js.native
}
object `106` {
  
  @scala.inline
  def apply(dialCode: Plussign383, id: XK, label: Kosovo): `106` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`106`]
  }
  
  @scala.inline
  implicit class `106MutableBuilder`[Self <: `106`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign383): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: XK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Kosovo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
