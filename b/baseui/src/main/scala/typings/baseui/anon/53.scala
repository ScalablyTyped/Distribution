package typings.baseui.anon

import typings.baseui.baseuiStrings.DJ
import typings.baseui.baseuiStrings.Djibouti
import typings.baseui.baseuiStrings.Plussign253
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var dialCode: Plussign253
  
  var id: DJ
  
  var label: Djibouti
}
object `53` {
  
  @scala.inline
  def apply(): `53` = {
    val __obj = js.Dynamic.literal(dialCode = "+253", id = "DJ", label = "Djibouti")
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit class `53MutableBuilder`[Self <: `53`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign253): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Djibouti): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
