package typings.baseui.anon

import typings.baseui.baseuiStrings.PW
import typings.baseui.baseuiStrings.Palau
import typings.baseui.baseuiStrings.Plussign680
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var dialCode: Plussign680
  
  var id: PW
  
  var label: Palau
}
object `157` {
  
  @scala.inline
  def apply(): `157` = {
    val __obj = js.Dynamic.literal(dialCode = "+680", id = "PW", label = "Palau")
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit class `157MutableBuilder`[Self <: `157`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign680): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Palau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
