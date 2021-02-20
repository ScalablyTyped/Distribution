package typings.baseui.anon

import typings.baseui.baseuiStrings.BJ
import typings.baseui.baseuiStrings.Plussign229
import typings.baseui.baseuiStrings.`Benin LeftparenthesisBéninRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  var dialCode: Plussign229 = js.native
  
  var id: BJ = js.native
  
  var label: `Benin LeftparenthesisBéninRightparenthesis` = js.native
}
object `16` {
  
  @scala.inline
  def apply(dialCode: Plussign229, id: BJ, label: `Benin LeftparenthesisBéninRightparenthesis`): `16` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign229): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Benin LeftparenthesisBéninRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
