package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign40
import typings.baseui.baseuiStrings.RO
import typings.baseui.baseuiStrings.`Romania LeftparenthesisRomâniaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `169` extends StObject {
  
  var dialCode: Plussign40
  
  var id: RO
  
  var label: `Romania LeftparenthesisRomâniaRightparenthesis`
}
object `169` {
  
  @scala.inline
  def apply(): `169` = {
    val __obj = js.Dynamic.literal(dialCode = "+40", id = "RO", label = "Romania (Rom\u00E2nia)")
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit class `169MutableBuilder`[Self <: `169`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign40): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Romania LeftparenthesisRomâniaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
