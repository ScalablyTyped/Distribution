package typings.baseui.anon

import typings.baseui.baseuiStrings.AF
import typings.baseui.baseuiStrings.Plussign93
import typings.baseui.baseuiStrings.`Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialCode extends StObject {
  
  var dialCode: Plussign93 = js.native
  
  var id: AF = js.native
  
  var label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis` = js.native
}
object DialCode {
  
  @scala.inline
  def apply(dialCode: Plussign93, id: AF, label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): DialCode = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCode]
  }
  
  @scala.inline
  implicit class DialCodeMutableBuilder[Self <: DialCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign93): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
