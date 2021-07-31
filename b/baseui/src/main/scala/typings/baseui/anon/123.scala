package typings.baseui.anon

import typings.baseui.baseuiStrings.MV
import typings.baseui.baseuiStrings.Maldives
import typings.baseui.baseuiStrings.Plussign960
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  var dialCode: Plussign960
  
  var id: MV
  
  var label: Maldives
}
object `123` {
  
  @scala.inline
  def apply(): `123` = {
    val __obj = js.Dynamic.literal(dialCode = "+960", id = "MV", label = "Maldives")
    __obj.asInstanceOf[`123`]
  }
  
  @scala.inline
  implicit class `123MutableBuilder`[Self <: `123`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign960): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Maldives): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
