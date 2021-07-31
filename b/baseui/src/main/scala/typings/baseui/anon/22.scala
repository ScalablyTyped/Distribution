package typings.baseui.anon

import typings.baseui.baseuiStrings.BR
import typings.baseui.baseuiStrings.Plussign55
import typings.baseui.baseuiStrings.`Brazil LeftparenthesisBrasilRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var dialCode: Plussign55
  
  var id: BR
  
  var label: `Brazil LeftparenthesisBrasilRightparenthesis`
}
object `22` {
  
  @scala.inline
  def apply(): `22` = {
    val __obj = js.Dynamic.literal(dialCode = "+55", id = "BR", label = "Brazil (Brasil)")
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign55): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Brazil LeftparenthesisBrasilRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
