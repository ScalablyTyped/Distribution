package typings.baseui.anon

import typings.baseui.baseuiStrings.NA
import typings.baseui.baseuiStrings.Plussign264
import typings.baseui.baseuiStrings.`Namibia LeftparenthesisNamibiëRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var dialCode: Plussign264
  
  var id: NA
  
  var label: `Namibia LeftparenthesisNamibiëRightparenthesis`
}
object `141` {
  
  @scala.inline
  def apply(): `141` = {
    val __obj = js.Dynamic.literal(dialCode = "+264", id = "NA", label = "Namibia (Namibi\u00EB)")
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit class `141MutableBuilder`[Self <: `141`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Namibia LeftparenthesisNamibiëRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
