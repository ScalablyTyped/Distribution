package typings.baseui.anon

import typings.baseui.baseuiStrings.KR
import typings.baseui.baseuiStrings.Plussign82
import typings.baseui.baseuiStrings.`South Korea Leftparenthesis대한민국Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `194` extends StObject {
  
  var dialCode: Plussign82 = js.native
  
  var id: KR = js.native
  
  var label: `South Korea Leftparenthesis대한민국Rightparenthesis` = js.native
}
object `194` {
  
  @scala.inline
  def apply(dialCode: Plussign82, id: KR, label: `South Korea Leftparenthesis대한민국Rightparenthesis`): `194` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`194`]
  }
  
  @scala.inline
  implicit class `194MutableBuilder`[Self <: `194`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign82): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `South Korea Leftparenthesis대한민국Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
