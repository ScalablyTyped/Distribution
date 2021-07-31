package typings.baseui.anon

import typings.baseui.baseuiStrings.IS
import typings.baseui.baseuiStrings.Plussign354
import typings.baseui.baseuiStrings.`Iceland LeftparenthesisÍslandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  var dialCode: Plussign354
  
  var id: IS
  
  var label: `Iceland LeftparenthesisÍslandRightparenthesis`
}
object `90` {
  
  @scala.inline
  def apply(): `90` = {
    val __obj = js.Dynamic.literal(dialCode = "+354", id = "IS", label = "Iceland (\u00CDsland)")
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit class `90MutableBuilder`[Self <: `90`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign354): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Iceland LeftparenthesisÍslandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
