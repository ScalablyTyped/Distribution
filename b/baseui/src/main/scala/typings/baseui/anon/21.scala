package typings.baseui.anon

import typings.baseui.baseuiStrings.BW
import typings.baseui.baseuiStrings.Botswana
import typings.baseui.baseuiStrings.Plussign267
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var dialCode: Plussign267
  
  var id: BW
  
  var label: Botswana
}
object `21` {
  
  @scala.inline
  def apply(): `21` = {
    val __obj = js.Dynamic.literal(dialCode = "+267", id = "BW", label = "Botswana")
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign267): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Botswana): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
