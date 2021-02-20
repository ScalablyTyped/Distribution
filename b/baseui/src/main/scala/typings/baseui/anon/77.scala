package typings.baseui.anon

import typings.baseui.baseuiStrings.GL
import typings.baseui.baseuiStrings.Plussign299
import typings.baseui.baseuiStrings.`Greenland LeftparenthesisKalaallit NunaatRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `77` extends StObject {
  
  var dialCode: Plussign299 = js.native
  
  var id: GL = js.native
  
  var label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis` = js.native
}
object `77` {
  
  @scala.inline
  def apply(dialCode: Plussign299, id: GL, label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`): `77` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
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
