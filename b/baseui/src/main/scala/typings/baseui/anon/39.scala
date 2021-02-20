package typings.baseui.anon

import typings.baseui.baseuiStrings.CC
import typings.baseui.baseuiStrings.Plussign61
import typings.baseui.baseuiStrings.`Cocos LeftparenthesisKeelingRightparenthesis Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `39` extends StObject {
  
  var dialCode: Plussign61 = js.native
  
  var id: CC = js.native
  
  var label: `Cocos LeftparenthesisKeelingRightparenthesis Islands` = js.native
}
object `39` {
  
  @scala.inline
  def apply(dialCode: Plussign61, id: CC, label: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): `39` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit class `39MutableBuilder`[Self <: `39`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign61): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
