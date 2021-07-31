package typings.baseui.anon

import typings.baseui.baseuiStrings.MU
import typings.baseui.baseuiStrings.Plussign230
import typings.baseui.baseuiStrings.`Mauritius LeftparenthesisMorisRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var dialCode: Plussign230
  
  var id: MU
  
  var label: `Mauritius LeftparenthesisMorisRightparenthesis`
}
object `129` {
  
  @scala.inline
  def apply(): `129` = {
    val __obj = js.Dynamic.literal(dialCode = "+230", id = "MU", label = "Mauritius (Moris)")
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129MutableBuilder`[Self <: `129`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign230): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mauritius LeftparenthesisMorisRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
