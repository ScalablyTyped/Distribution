package typings.baseui.anon

import typings.baseui.baseuiStrings.AZ
import typings.baseui.baseuiStrings.Plussign994
import typings.baseui.baseuiStrings.`Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var dialCode: Plussign994 = js.native
  
  var id: AZ = js.native
  
  var label: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis` = js.native
}
object `8` {
  
  @scala.inline
  def apply(dialCode: Plussign994, id: AZ, label: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`): `8` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign994): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Azerbaijan LeftparenthesisAzərbaycanRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
