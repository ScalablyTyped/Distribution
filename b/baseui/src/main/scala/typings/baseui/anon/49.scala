package typings.baseui.anon

import typings.baseui.baseuiStrings.CW
import typings.baseui.baseuiStrings.Curaçao
import typings.baseui.baseuiStrings.Plussign599
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var dialCode: Plussign599
  
  var id: CW
  
  var label: Curaçao
}
object `49` {
  
  @scala.inline
  def apply(): `49` = {
    val __obj = js.Dynamic.literal(dialCode = "+599", id = "CW", label = "Cura\u00E7ao")
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit class `49MutableBuilder`[Self <: `49`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign599): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Curaçao): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
