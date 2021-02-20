package typings.baseui.anon

import typings.baseui.baseuiStrings.ES
import typings.baseui.baseuiStrings.Plussign34
import typings.baseui.baseuiStrings.`Spain LeftparenthesisEspañaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `196` extends StObject {
  
  var dialCode: Plussign34 = js.native
  
  var id: ES = js.native
  
  var label: `Spain LeftparenthesisEspañaRightparenthesis` = js.native
}
object `196` {
  
  @scala.inline
  def apply(dialCode: Plussign34, id: ES, label: `Spain LeftparenthesisEspañaRightparenthesis`): `196` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`196`]
  }
  
  @scala.inline
  implicit class `196MutableBuilder`[Self <: `196`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign34): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ES): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Spain LeftparenthesisEspañaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
