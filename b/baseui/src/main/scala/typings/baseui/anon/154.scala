package typings.baseui.anon

import typings.baseui.baseuiStrings.NO
import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.`Norway LeftparenthesisNorgeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `154` extends StObject {
  
  var dialCode: Plussign47 = js.native
  
  var id: NO = js.native
  
  var label: `Norway LeftparenthesisNorgeRightparenthesis` = js.native
}
object `154` {
  
  @scala.inline
  def apply(dialCode: Plussign47, id: NO, label: `Norway LeftparenthesisNorgeRightparenthesis`): `154` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit class `154MutableBuilder`[Self <: `154`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign47): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Norway LeftparenthesisNorgeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
