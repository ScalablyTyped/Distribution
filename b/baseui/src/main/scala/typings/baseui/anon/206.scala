package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign992
import typings.baseui.baseuiStrings.TJ
import typings.baseui.baseuiStrings.Tajikistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  var dialCode: Plussign992
  
  var id: TJ
  
  var label: Tajikistan
}
object `206` {
  
  @scala.inline
  def apply(): `206` = {
    val __obj = js.Dynamic.literal(dialCode = "+992", id = "TJ", label = "Tajikistan")
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit class `206MutableBuilder`[Self <: `206`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign992): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tajikistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
