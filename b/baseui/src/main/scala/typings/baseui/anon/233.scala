package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign260
import typings.baseui.baseuiStrings.ZM
import typings.baseui.baseuiStrings.Zambia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `233` extends StObject {
  
  var dialCode: Plussign260 = js.native
  
  var id: ZM = js.native
  
  var label: Zambia = js.native
}
object `233` {
  
  @scala.inline
  def apply(dialCode: Plussign260, id: ZM, label: Zambia): `233` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit class `233MutableBuilder`[Self <: `233`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign260): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Zambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
