package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign46
import typings.baseui.baseuiStrings.SE
import typings.baseui.baseuiStrings.`Sweden LeftparenthesisSverigeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202` extends StObject {
  
  var dialCode: Plussign46
  
  var id: SE
  
  var label: `Sweden LeftparenthesisSverigeRightparenthesis`
}
object `202` {
  
  @scala.inline
  def apply(): `202` = {
    val __obj = js.Dynamic.literal(dialCode = "+46", id = "SE", label = "Sweden (Sverige)")
    __obj.asInstanceOf[`202`]
  }
  
  @scala.inline
  implicit class `202MutableBuilder`[Self <: `202`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign46): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sweden LeftparenthesisSverigeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
