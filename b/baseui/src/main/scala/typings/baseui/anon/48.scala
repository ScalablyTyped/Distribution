package typings.baseui.anon

import typings.baseui.baseuiStrings.CU
import typings.baseui.baseuiStrings.Cuba
import typings.baseui.baseuiStrings.Plussign53
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var dialCode: Plussign53
  
  var id: CU
  
  var label: Cuba
}
object `48` {
  
  @scala.inline
  def apply(): `48` = {
    val __obj = js.Dynamic.literal(dialCode = "+53", id = "CU", label = "Cuba")
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit class `48MutableBuilder`[Self <: `48`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign53): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Cuba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
