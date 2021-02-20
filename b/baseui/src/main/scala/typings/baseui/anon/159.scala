package typings.baseui.anon

import typings.baseui.baseuiStrings.PA
import typings.baseui.baseuiStrings.Plussign507
import typings.baseui.baseuiStrings.`Panama LeftparenthesisPanamáRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `159` extends StObject {
  
  var dialCode: Plussign507 = js.native
  
  var id: PA = js.native
  
  var label: `Panama LeftparenthesisPanamáRightparenthesis` = js.native
}
object `159` {
  
  @scala.inline
  def apply(dialCode: Plussign507, id: PA, label: `Panama LeftparenthesisPanamáRightparenthesis`): `159` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit class `159MutableBuilder`[Self <: `159`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign507): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Panama LeftparenthesisPanamáRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
