package typings.baseui.anon

import typings.baseui.baseuiStrings.PA
import typings.baseui.baseuiStrings.Plussign507
import typings.baseui.baseuiStrings.`Panama LeftparenthesisPanamáRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var dialCode: Plussign507
  
  var id: PA
  
  var label: `Panama LeftparenthesisPanamáRightparenthesis`
}
object `159` {
  
  @scala.inline
  def apply(): `159` = {
    val __obj = js.Dynamic.literal(dialCode = "+507", id = "PA", label = "Panama (Panam\u00E1)")
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
