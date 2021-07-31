package typings.baseui.anon

import typings.baseui.baseuiStrings.MF
import typings.baseui.baseuiStrings.Plussign590
import typings.baseui.baseuiStrings.`Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  var dialCode: Plussign590
  
  var id: MF
  
  var label: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
}
object `176` {
  
  @scala.inline
  def apply(): `176` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "MF", label = "Saint Martin (Saint-Martin (partie fran\u00E7aise))")
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit class `176MutableBuilder`[Self <: `176`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(
      value: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
