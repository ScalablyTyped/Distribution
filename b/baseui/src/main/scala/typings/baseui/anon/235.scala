package typings.baseui.anon

import typings.baseui.baseuiStrings.AX
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Åland Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `235` extends StObject {
  
  var dialCode: Plussign358 = js.native
  
  var id: AX = js.native
  
  var label: `Åland Islands` = js.native
}
object `235` {
  
  @scala.inline
  def apply(dialCode: Plussign358, id: AX, label: `Åland Islands`): `235` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`235`]
  }
  
  @scala.inline
  implicit class `235MutableBuilder`[Self <: `235`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign358): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Åland Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
