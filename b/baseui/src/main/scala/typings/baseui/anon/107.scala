package typings.baseui.anon

import typings.baseui.baseuiStrings.KW
import typings.baseui.baseuiStrings.Plussign965
import typings.baseui.baseuiStrings.`Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  var dialCode: Plussign965
  
  var id: KW
  
  var label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`
}
object `107` {
  
  @scala.inline
  def apply(): `107` = {
    val __obj = js.Dynamic.literal(dialCode = "+965", id = "KW", label = "Kuwait (\u202B\u0627\u0644\u0643\u0648\u064A\u062A\u202C\u200E)")
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit class `107MutableBuilder`[Self <: `107`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign965): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
