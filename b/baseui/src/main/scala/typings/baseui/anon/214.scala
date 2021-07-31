package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign216
import typings.baseui.baseuiStrings.TN
import typings.baseui.baseuiStrings.`Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var dialCode: Plussign216
  
  var id: TN
  
  var label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`
}
object `214` {
  
  @scala.inline
  def apply(): `214` = {
    val __obj = js.Dynamic.literal(dialCode = "+216", id = "TN", label = "Tunisia (\u202B\u062A\u0648\u0646\u0633\u202C\u200E)")
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit class `214MutableBuilder`[Self <: `214`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign216): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
