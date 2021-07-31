package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1721
import typings.baseui.baseuiStrings.SX
import typings.baseui.baseuiStrings.`Sint Maarten`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var dialCode: Plussign1721
  
  var id: SX
  
  var label: `Sint Maarten`
}
object `188` {
  
  @scala.inline
  def apply(): `188` = {
    val __obj = js.Dynamic.literal(dialCode = "+1721", id = "SX", label = "Sint Maarten")
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit class `188MutableBuilder`[Self <: `188`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1721): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sint Maarten`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
