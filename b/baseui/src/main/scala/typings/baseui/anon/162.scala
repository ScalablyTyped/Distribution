package typings.baseui.anon

import typings.baseui.baseuiStrings.PE
import typings.baseui.baseuiStrings.Plussign51
import typings.baseui.baseuiStrings.`Peru LeftparenthesisPerúRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  var dialCode: Plussign51
  
  var id: PE
  
  var label: `Peru LeftparenthesisPerúRightparenthesis`
}
object `162` {
  
  @scala.inline
  def apply(): `162` = {
    val __obj = js.Dynamic.literal(dialCode = "+51", id = "PE", label = "Peru (Per\u00FA)")
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit class `162MutableBuilder`[Self <: `162`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign51): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Peru LeftparenthesisPerúRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
