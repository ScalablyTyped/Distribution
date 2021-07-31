package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign268
import typings.baseui.baseuiStrings.SZ
import typings.baseui.baseuiStrings.Swaziland
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var dialCode: Plussign268
  
  var id: SZ
  
  var label: Swaziland
}
object `201` {
  
  @scala.inline
  def apply(): `201` = {
    val __obj = js.Dynamic.literal(dialCode = "+268", id = "SZ", label = "Swaziland")
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit class `201MutableBuilder`[Self <: `201`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign268): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Swaziland): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
