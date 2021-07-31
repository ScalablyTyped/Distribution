package typings.baseui.anon

import typings.baseui.baseuiStrings.KM
import typings.baseui.baseuiStrings.Plussign269
import typings.baseui.baseuiStrings.`Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var dialCode: Plussign269
  
  var id: KM
  
  var label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`
}
object `41` {
  
  @scala.inline
  def apply(): `41` = {
    val __obj = js.Dynamic.literal(dialCode = "+269", id = "KM", label = "Comoros (\u202B\u062C\u0632\u0631 \u0627\u0644\u0642\u0645\u0631\u202C\u200E)")
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit class `41MutableBuilder`[Self <: `41`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign269): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
