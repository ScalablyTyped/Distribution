package typings.baseui.anon

import typings.baseui.baseuiStrings.BB
import typings.baseui.baseuiStrings.Barbados
import typings.baseui.baseuiStrings.Plussign1246
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var dialCode: Plussign1246
  
  var id: BB
  
  var label: Barbados
}
object `12` {
  
  @scala.inline
  def apply(): `12` = {
    val __obj = js.Dynamic.literal(dialCode = "+1246", id = "BB", label = "Barbados")
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1246): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Barbados): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
