package typings.baseui.anon

import typings.baseui.baseuiStrings.CZ
import typings.baseui.baseuiStrings.Plussign420
import typings.baseui.baseuiStrings.`Czech Republic LeftparenthesisČeská republikaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `51` extends StObject {
  
  var dialCode: Plussign420 = js.native
  
  var id: CZ = js.native
  
  var label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis` = js.native
}
object `51` {
  
  @scala.inline
  def apply(
    dialCode: Plussign420,
    id: CZ,
    label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`
  ): `51` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`51`]
  }
  
  @scala.inline
  implicit class `51MutableBuilder`[Self <: `51`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign420): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
