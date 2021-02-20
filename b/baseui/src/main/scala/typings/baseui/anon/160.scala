package typings.baseui.anon

import typings.baseui.baseuiStrings.PG
import typings.baseui.baseuiStrings.Plussign675
import typings.baseui.baseuiStrings.`Papua New Guinea`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `160` extends StObject {
  
  var dialCode: Plussign675 = js.native
  
  var id: PG = js.native
  
  var label: `Papua New Guinea` = js.native
}
object `160` {
  
  @scala.inline
  def apply(dialCode: Plussign675, id: PG, label: `Papua New Guinea`): `160` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit class `160MutableBuilder`[Self <: `160`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign675): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Papua New Guinea`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
