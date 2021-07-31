package typings.baseui.anon

import typings.baseui.baseuiStrings.GL
import typings.baseui.baseuiStrings.Plussign299
import typings.baseui.baseuiStrings.`Greenland LeftparenthesisKalaallit NunaatRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var dialCode: Plussign299
  
  var id: GL
  
  var label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`
}
object `77` {
  
  @scala.inline
  def apply(): `77` = {
    val __obj = js.Dynamic.literal(dialCode = "+299", id = "GL", label = "Greenland (Kalaallit Nunaat)")
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit class `77MutableBuilder`[Self <: `77`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign299): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
