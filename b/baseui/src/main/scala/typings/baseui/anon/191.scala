package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign677
import typings.baseui.baseuiStrings.SB
import typings.baseui.baseuiStrings.`Solomon Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `191` extends StObject {
  
  var dialCode: Plussign677 = js.native
  
  var id: SB = js.native
  
  var label: `Solomon Islands` = js.native
}
object `191` {
  
  @scala.inline
  def apply(dialCode: Plussign677, id: SB, label: `Solomon Islands`): `191` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit class `191MutableBuilder`[Self <: `191`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign677): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Solomon Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
