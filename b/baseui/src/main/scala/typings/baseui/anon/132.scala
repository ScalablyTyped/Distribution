package typings.baseui.anon

import typings.baseui.baseuiStrings.FM
import typings.baseui.baseuiStrings.Micronesia
import typings.baseui.baseuiStrings.Plussign691
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var dialCode: Plussign691
  
  var id: FM
  
  var label: Micronesia
}
object `132` {
  
  @scala.inline
  def apply(): `132` = {
    val __obj = js.Dynamic.literal(dialCode = "+691", id = "FM", label = "Micronesia")
    __obj.asInstanceOf[`132`]
  }
  
  @scala.inline
  implicit class `132MutableBuilder`[Self <: `132`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign691): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Micronesia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
