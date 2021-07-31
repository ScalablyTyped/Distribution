package typings.baseui.anon

import typings.baseui.baseuiStrings.LR
import typings.baseui.baseuiStrings.Liberia
import typings.baseui.baseuiStrings.Plussign231
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var dialCode: Plussign231
  
  var id: LR
  
  var label: Liberia
}
object `113` {
  
  @scala.inline
  def apply(): `113` = {
    val __obj = js.Dynamic.literal(dialCode = "+231", id = "LR", label = "Liberia")
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit class `113MutableBuilder`[Self <: `113`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign231): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Liberia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
