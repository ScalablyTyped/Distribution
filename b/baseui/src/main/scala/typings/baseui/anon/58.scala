package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign503
import typings.baseui.baseuiStrings.SV
import typings.baseui.baseuiStrings.`El Salvador`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var dialCode: Plussign503
  
  var id: SV
  
  var label: `El Salvador`
}
object `58` {
  
  @scala.inline
  def apply(): `58` = {
    val __obj = js.Dynamic.literal(dialCode = "+503", id = "SV", label = "El Salvador")
    __obj.asInstanceOf[`58`]
  }
  
  @scala.inline
  implicit class `58MutableBuilder`[Self <: `58`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign503): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `El Salvador`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
