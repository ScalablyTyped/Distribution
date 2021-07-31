package typings.baseui.anon

import typings.baseui.baseuiStrings.NZ
import typings.baseui.baseuiStrings.Plussign64
import typings.baseui.baseuiStrings.`New Zealand`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var dialCode: Plussign64
  
  var id: NZ
  
  var label: `New Zealand`
}
object `146` {
  
  @scala.inline
  def apply(): `146` = {
    val __obj = js.Dynamic.literal(dialCode = "+64", id = "NZ", label = "New Zealand")
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit class `146MutableBuilder`[Self <: `146`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign64): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `New Zealand`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
