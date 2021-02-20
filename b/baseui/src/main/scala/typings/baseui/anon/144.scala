package typings.baseui.anon

import typings.baseui.baseuiStrings.NL
import typings.baseui.baseuiStrings.Plussign31
import typings.baseui.baseuiStrings.`Netherlands LeftparenthesisNederlandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `144` extends StObject {
  
  var dialCode: Plussign31 = js.native
  
  var id: NL = js.native
  
  var label: `Netherlands LeftparenthesisNederlandRightparenthesis` = js.native
}
object `144` {
  
  @scala.inline
  def apply(dialCode: Plussign31, id: NL, label: `Netherlands LeftparenthesisNederlandRightparenthesis`): `144` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit class `144MutableBuilder`[Self <: `144`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign31): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Netherlands LeftparenthesisNederlandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
