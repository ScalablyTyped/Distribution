package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign232
import typings.baseui.baseuiStrings.SL
import typings.baseui.baseuiStrings.`Sierra Leone`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `186` extends StObject {
  
  var dialCode: Plussign232 = js.native
  
  var id: SL = js.native
  
  var label: `Sierra Leone` = js.native
}
object `186` {
  
  @scala.inline
  def apply(dialCode: Plussign232, id: SL, label: `Sierra Leone`): `186` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit class `186MutableBuilder`[Self <: `186`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign232): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sierra Leone`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
