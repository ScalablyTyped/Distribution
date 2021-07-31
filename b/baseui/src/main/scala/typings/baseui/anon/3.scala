package typings.baseui.anon

import typings.baseui.baseuiStrings.AR
import typings.baseui.baseuiStrings.Argentina
import typings.baseui.baseuiStrings.Plussign54
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var dialCode: Plussign54
  
  var id: AR
  
  var label: Argentina
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal(dialCode = "+54", id = "AR", label = "Argentina")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign54): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Argentina): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
