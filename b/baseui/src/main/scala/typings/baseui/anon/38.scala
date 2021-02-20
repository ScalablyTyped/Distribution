package typings.baseui.anon

import typings.baseui.baseuiStrings.CX
import typings.baseui.baseuiStrings.Plussign61
import typings.baseui.baseuiStrings.`Christmas Island`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `38` extends StObject {
  
  var dialCode: Plussign61 = js.native
  
  var id: CX = js.native
  
  var label: `Christmas Island` = js.native
}
object `38` {
  
  @scala.inline
  def apply(dialCode: Plussign61, id: CX, label: `Christmas Island`): `38` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit class `38MutableBuilder`[Self <: `38`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign61): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Christmas Island`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
