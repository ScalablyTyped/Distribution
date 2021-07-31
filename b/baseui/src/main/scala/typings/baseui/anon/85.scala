package typings.baseui.anon

import typings.baseui.baseuiStrings.GY
import typings.baseui.baseuiStrings.Guyana
import typings.baseui.baseuiStrings.Plussign592
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var dialCode: Plussign592
  
  var id: GY
  
  var label: Guyana
}
object `85` {
  
  @scala.inline
  def apply(): `85` = {
    val __obj = js.Dynamic.literal(dialCode = "+592", id = "GY", label = "Guyana")
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit class `85MutableBuilder`[Self <: `85`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign592): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guyana): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
