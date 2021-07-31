package typings.baseui.anon

import typings.baseui.baseuiStrings.FR
import typings.baseui.baseuiStrings.France
import typings.baseui.baseuiStrings.Plussign33
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  var dialCode: Plussign33
  
  var id: FR
  
  var label: France
}
object `67` {
  
  @scala.inline
  def apply(): `67` = {
    val __obj = js.Dynamic.literal(dialCode = "+33", id = "FR", label = "France")
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit class `67MutableBuilder`[Self <: `67`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign33): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: France): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
