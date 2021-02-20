package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign252
import typings.baseui.baseuiStrings.SO
import typings.baseui.baseuiStrings.`Somalia LeftparenthesisSoomaaliyaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `192` extends StObject {
  
  var dialCode: Plussign252 = js.native
  
  var id: SO = js.native
  
  var label: `Somalia LeftparenthesisSoomaaliyaRightparenthesis` = js.native
}
object `192` {
  
  @scala.inline
  def apply(dialCode: Plussign252, id: SO, label: `Somalia LeftparenthesisSoomaaliyaRightparenthesis`): `192` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`192`]
  }
  
  @scala.inline
  implicit class `192MutableBuilder`[Self <: `192`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign252): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Somalia LeftparenthesisSoomaaliyaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
