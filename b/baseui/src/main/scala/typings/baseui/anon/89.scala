package typings.baseui.anon

import typings.baseui.baseuiStrings.HU
import typings.baseui.baseuiStrings.Plussign36
import typings.baseui.baseuiStrings.`Hungary LeftparenthesisMagyarországRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `89` extends StObject {
  
  var dialCode: Plussign36 = js.native
  
  var id: HU = js.native
  
  var label: `Hungary LeftparenthesisMagyarországRightparenthesis` = js.native
}
object `89` {
  
  @scala.inline
  def apply(dialCode: Plussign36, id: HU, label: `Hungary LeftparenthesisMagyarországRightparenthesis`): `89` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit class `89MutableBuilder`[Self <: `89`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign36): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Hungary LeftparenthesisMagyarországRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
