package typings.baseui.anon

import typings.baseui.baseuiStrings.FI
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Finland LeftparenthesisSuomiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  var dialCode: Plussign358
  
  var id: FI
  
  var label: `Finland LeftparenthesisSuomiRightparenthesis`
}
object `66` {
  
  @scala.inline
  def apply(): `66` = {
    val __obj = js.Dynamic.literal(dialCode = "+358", id = "FI", label = "Finland (Suomi)")
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit class `66MutableBuilder`[Self <: `66`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign358): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Finland LeftparenthesisSuomiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
