package typings.baseui.anon

import typings.baseui.baseuiStrings.NP
import typings.baseui.baseuiStrings.Plussign977
import typings.baseui.baseuiStrings.`Nepal LeftparenthesisनेपालRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `143` extends StObject {
  
  var dialCode: Plussign977 = js.native
  
  var id: NP = js.native
  
  var label: `Nepal LeftparenthesisनेपालRightparenthesis` = js.native
}
object `143` {
  
  @scala.inline
  def apply(dialCode: Plussign977, id: NP, label: `Nepal LeftparenthesisनेपालRightparenthesis`): `143` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit class `143MutableBuilder`[Self <: `143`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign977): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Nepal LeftparenthesisनेपालRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
