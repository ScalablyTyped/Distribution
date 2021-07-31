package typings.baseui.anon

import typings.baseui.baseuiStrings.GI
import typings.baseui.baseuiStrings.Gibraltar
import typings.baseui.baseuiStrings.Plussign350
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  var dialCode: Plussign350
  
  var id: GI
  
  var label: Gibraltar
}
object `75` {
  
  @scala.inline
  def apply(): `75` = {
    val __obj = js.Dynamic.literal(dialCode = "+350", id = "GI", label = "Gibraltar")
    __obj.asInstanceOf[`75`]
  }
  
  @scala.inline
  implicit class `75MutableBuilder`[Self <: `75`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign350): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Gibraltar): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
