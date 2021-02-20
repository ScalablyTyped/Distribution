package typings.baseui.anon

import typings.baseui.baseuiStrings.MH
import typings.baseui.baseuiStrings.Plussign692
import typings.baseui.baseuiStrings.`Marshall Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `126` extends StObject {
  
  var dialCode: Plussign692 = js.native
  
  var id: MH = js.native
  
  var label: `Marshall Islands` = js.native
}
object `126` {
  
  @scala.inline
  def apply(dialCode: Plussign692, id: MH, label: `Marshall Islands`): `126` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit class `126MutableBuilder`[Self <: `126`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign692): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Marshall Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
