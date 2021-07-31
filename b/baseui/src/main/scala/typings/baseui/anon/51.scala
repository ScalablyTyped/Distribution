package typings.baseui.anon

import typings.baseui.baseuiStrings.CZ
import typings.baseui.baseuiStrings.Plussign420
import typings.baseui.baseuiStrings.`Czech Republic LeftparenthesisČeská republikaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var dialCode: Plussign420
  
  var id: CZ
  
  var label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`
}
object `51` {
  
  @scala.inline
  def apply(): `51` = {
    val __obj = js.Dynamic.literal(dialCode = "+420", id = "CZ", label = "Czech Republic (\u010Cesk\u00E1 republika)")
    __obj.asInstanceOf[`51`]
  }
  
  @scala.inline
  implicit class `51MutableBuilder`[Self <: `51`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign420): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
