package typings.baseui.anon

import typings.baseui.baseuiStrings.GG
import typings.baseui.baseuiStrings.Guernsey
import typings.baseui.baseuiStrings.Plussign44
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var dialCode: Plussign44
  
  var id: GG
  
  var label: Guernsey
}
object `82` {
  
  @scala.inline
  def apply(): `82` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "GG", label = "Guernsey")
    __obj.asInstanceOf[`82`]
  }
  
  @scala.inline
  implicit class `82MutableBuilder`[Self <: `82`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Guernsey): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
