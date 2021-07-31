package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign598
import typings.baseui.baseuiStrings.UY
import typings.baseui.baseuiStrings.Uruguay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  var dialCode: Plussign598
  
  var id: UY
  
  var label: Uruguay
}
object `225` {
  
  @scala.inline
  def apply(): `225` = {
    val __obj = js.Dynamic.literal(dialCode = "+598", id = "UY", label = "Uruguay")
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit class `225MutableBuilder`[Self <: `225`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign598): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: UY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Uruguay): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
