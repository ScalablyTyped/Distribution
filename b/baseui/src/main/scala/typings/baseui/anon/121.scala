package typings.baseui.anon

import typings.baseui.baseuiStrings.MW
import typings.baseui.baseuiStrings.Malawi
import typings.baseui.baseuiStrings.Plussign265
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  var dialCode: Plussign265
  
  var id: MW
  
  var label: Malawi
}
object `121` {
  
  @scala.inline
  def apply(): `121` = {
    val __obj = js.Dynamic.literal(dialCode = "+265", id = "MW", label = "Malawi")
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit class `121MutableBuilder`[Self <: `121`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign265): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Malawi): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
