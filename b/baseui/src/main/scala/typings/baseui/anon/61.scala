package typings.baseui.anon

import typings.baseui.baseuiStrings.EE
import typings.baseui.baseuiStrings.Plussign372
import typings.baseui.baseuiStrings.`Estonia LeftparenthesisEestiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var dialCode: Plussign372
  
  var id: EE
  
  var label: `Estonia LeftparenthesisEestiRightparenthesis`
}
object `61` {
  
  @scala.inline
  def apply(): `61` = {
    val __obj = js.Dynamic.literal(dialCode = "+372", id = "EE", label = "Estonia (Eesti)")
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit class `61MutableBuilder`[Self <: `61`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign372): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: EE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Estonia LeftparenthesisEestiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
