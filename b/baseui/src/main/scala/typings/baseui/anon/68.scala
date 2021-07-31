package typings.baseui.anon

import typings.baseui.baseuiStrings.GF
import typings.baseui.baseuiStrings.Plussign594
import typings.baseui.baseuiStrings.`French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  var dialCode: Plussign594
  
  var id: GF
  
  var label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
}
object `68` {
  
  @scala.inline
  def apply(): `68` = {
    val __obj = js.Dynamic.literal(dialCode = "+594", id = "GF", label = "French Guiana (Guyane fran\u00E7aise)")
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit class `68MutableBuilder`[Self <: `68`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign594): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
