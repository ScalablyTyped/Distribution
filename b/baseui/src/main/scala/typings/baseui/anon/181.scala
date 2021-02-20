package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign239
import typings.baseui.baseuiStrings.ST
import typings.baseui.baseuiStrings.`São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `181` extends StObject {
  
  var dialCode: Plussign239 = js.native
  
  var id: ST = js.native
  
  var label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis` = js.native
}
object `181` {
  
  @scala.inline
  def apply(
    dialCode: Plussign239,
    id: ST,
    label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
  ): `181` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit class `181MutableBuilder`[Self <: `181`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign239): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ST): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
