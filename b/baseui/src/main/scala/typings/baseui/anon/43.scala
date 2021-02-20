package typings.baseui.anon

import typings.baseui.baseuiStrings.CG
import typings.baseui.baseuiStrings.Plussign242
import typings.baseui.baseuiStrings.`Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `43` extends StObject {
  
  var dialCode: Plussign242 = js.native
  
  var id: CG = js.native
  
  var label: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis` = js.native
}
object `43` {
  
  @scala.inline
  def apply(
    dialCode: Plussign242,
    id: CG,
    label: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
  ): `43` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit class `43MutableBuilder`[Self <: `43`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(
      value: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
