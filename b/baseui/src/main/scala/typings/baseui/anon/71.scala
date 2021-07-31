package typings.baseui.anon

import typings.baseui.baseuiStrings.GM
import typings.baseui.baseuiStrings.Gambia
import typings.baseui.baseuiStrings.Plussign220
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  var dialCode: Plussign220
  
  var id: GM
  
  var label: Gambia
}
object `71` {
  
  @scala.inline
  def apply(): `71` = {
    val __obj = js.Dynamic.literal(dialCode = "+220", id = "GM", label = "Gambia")
    __obj.asInstanceOf[`71`]
  }
  
  @scala.inline
  implicit class `71MutableBuilder`[Self <: `71`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign220): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Gambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
