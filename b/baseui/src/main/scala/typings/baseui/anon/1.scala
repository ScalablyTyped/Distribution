package typings.baseui.anon

import typings.baseui.baseuiStrings.AI
import typings.baseui.baseuiStrings.Anguilla
import typings.baseui.baseuiStrings.Plussign1264
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var dialCode: Plussign1264
  
  var id: AI
  
  var label: Anguilla
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal(dialCode = "+1264", id = "AI", label = "Anguilla")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Anguilla): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
