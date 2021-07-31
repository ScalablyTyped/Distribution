package typings.baseui.anon

import typings.baseui.baseuiStrings.AX
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Åland Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  var dialCode: Plussign358
  
  var id: AX
  
  var label: `Åland Islands`
}
object `235` {
  
  @scala.inline
  def apply(): `235` = {
    val __obj = js.Dynamic.literal(dialCode = "+358", id = "AX", label = "\u00C5land Islands")
    __obj.asInstanceOf[`235`]
  }
  
  @scala.inline
  implicit class `235MutableBuilder`[Self <: `235`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign358): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Åland Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
