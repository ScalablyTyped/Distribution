package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign378
import typings.baseui.baseuiStrings.SM
import typings.baseui.baseuiStrings.`San Marino`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `180` extends StObject {
  
  var dialCode: Plussign378 = js.native
  
  var id: SM = js.native
  
  var label: `San Marino` = js.native
}
object `180` {
  
  @scala.inline
  def apply(dialCode: Plussign378, id: SM, label: `San Marino`): `180` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`180`]
  }
  
  @scala.inline
  implicit class `180MutableBuilder`[Self <: `180`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign378): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `San Marino`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
