package typings.baseui.anon

import typings.baseui.baseuiStrings.KZ
import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.`Kazakhstan LeftparenthesisКазахстанRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var dialCode: Plussign7
  
  var id: KZ
  
  var label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`
}
object `103` {
  
  @scala.inline
  def apply(): `103` = {
    val __obj = js.Dynamic.literal(dialCode = "+7", id = "KZ", label = "Kazakhstan (\u041A\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043D)")
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit class `103MutableBuilder`[Self <: `103`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign7): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
