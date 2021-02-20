package typings.baseui.anon

import typings.baseui.baseuiStrings.PK
import typings.baseui.baseuiStrings.Plussign92
import typings.baseui.baseuiStrings.`Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `156` extends StObject {
  
  var dialCode: Plussign92 = js.native
  
  var id: PK = js.native
  
  var label: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis` = js.native
}
object `156` {
  
  @scala.inline
  def apply(dialCode: Plussign92, id: PK, label: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`): `156` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`156`]
  }
  
  @scala.inline
  implicit class `156MutableBuilder`[Self <: `156`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign92): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
