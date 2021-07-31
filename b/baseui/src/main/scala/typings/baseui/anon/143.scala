package typings.baseui.anon

import typings.baseui.baseuiStrings.NP
import typings.baseui.baseuiStrings.Plussign977
import typings.baseui.baseuiStrings.`Nepal LeftparenthesisनेपालRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var dialCode: Plussign977
  
  var id: NP
  
  var label: `Nepal LeftparenthesisनेपालRightparenthesis`
}
object `143` {
  
  @scala.inline
  def apply(): `143` = {
    val __obj = js.Dynamic.literal(dialCode = "+977", id = "NP", label = "Nepal (\u0928\u0947\u092A\u093E\u0932)")
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit class `143MutableBuilder`[Self <: `143`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign977): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Nepal LeftparenthesisनेपालRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
