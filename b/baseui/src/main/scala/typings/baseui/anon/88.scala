package typings.baseui.anon

import typings.baseui.baseuiStrings.HK
import typings.baseui.baseuiStrings.Plussign852
import typings.baseui.baseuiStrings.`Hong Kong Leftparenthesis香港Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `88` extends StObject {
  
  var dialCode: Plussign852 = js.native
  
  var id: HK = js.native
  
  var label: `Hong Kong Leftparenthesis香港Rightparenthesis` = js.native
}
object `88` {
  
  @scala.inline
  def apply(dialCode: Plussign852, id: HK, label: `Hong Kong Leftparenthesis香港Rightparenthesis`): `88` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`88`]
  }
  
  @scala.inline
  implicit class `88MutableBuilder`[Self <: `88`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign852): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Hong Kong Leftparenthesis香港Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
