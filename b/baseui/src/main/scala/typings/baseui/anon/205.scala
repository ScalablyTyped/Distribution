package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign886
import typings.baseui.baseuiStrings.TW
import typings.baseui.baseuiStrings.`Taiwan Leftparenthesis台灣Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `205` extends StObject {
  
  var dialCode: Plussign886 = js.native
  
  var id: TW = js.native
  
  var label: `Taiwan Leftparenthesis台灣Rightparenthesis` = js.native
}
object `205` {
  
  @scala.inline
  def apply(dialCode: Plussign886, id: TW, label: `Taiwan Leftparenthesis台灣Rightparenthesis`): `205` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`205`]
  }
  
  @scala.inline
  implicit class `205MutableBuilder`[Self <: `205`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign886): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Taiwan Leftparenthesis台灣Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
