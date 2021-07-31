package typings.baseui.anon

import typings.baseui.baseuiStrings.ER
import typings.baseui.baseuiStrings.Eritrea
import typings.baseui.baseuiStrings.Plussign291
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var dialCode: Plussign291
  
  var id: ER
  
  var label: Eritrea
}
object `60` {
  
  @scala.inline
  def apply(): `60` = {
    val __obj = js.Dynamic.literal(dialCode = "+291", id = "ER", label = "Eritrea")
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit class `60MutableBuilder`[Self <: `60`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign291): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ER): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Eritrea): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
