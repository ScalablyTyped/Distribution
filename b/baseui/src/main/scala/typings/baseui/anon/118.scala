package typings.baseui.anon

import typings.baseui.baseuiStrings.MO
import typings.baseui.baseuiStrings.Plussign853
import typings.baseui.baseuiStrings.`Macau Leftparenthesis澳門Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `118` extends StObject {
  
  var dialCode: Plussign853 = js.native
  
  var id: MO = js.native
  
  var label: `Macau Leftparenthesis澳門Rightparenthesis` = js.native
}
object `118` {
  
  @scala.inline
  def apply(dialCode: Plussign853, id: MO, label: `Macau Leftparenthesis澳門Rightparenthesis`): `118` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit class `118MutableBuilder`[Self <: `118`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign853): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Macau Leftparenthesis澳門Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
