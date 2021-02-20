package typings.baseui.anon

import typings.baseui.baseuiStrings.BI
import typings.baseui.baseuiStrings.Plussign257
import typings.baseui.baseuiStrings.`Burundi LeftparenthesisUburundiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28` extends StObject {
  
  var dialCode: Plussign257 = js.native
  
  var id: BI = js.native
  
  var label: `Burundi LeftparenthesisUburundiRightparenthesis` = js.native
}
object `28` {
  
  @scala.inline
  def apply(dialCode: Plussign257, id: BI, label: `Burundi LeftparenthesisUburundiRightparenthesis`): `28` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit class `28MutableBuilder`[Self <: `28`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign257): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Burundi LeftparenthesisUburundiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
