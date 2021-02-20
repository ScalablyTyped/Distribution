package typings.baseui.anon

import typings.baseui.baseuiStrings.CR
import typings.baseui.baseuiStrings.Plussign506
import typings.baseui.baseuiStrings.`Costa Rica`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `45` extends StObject {
  
  var dialCode: Plussign506 = js.native
  
  var id: CR = js.native
  
  var label: `Costa Rica` = js.native
}
object `45` {
  
  @scala.inline
  def apply(dialCode: Plussign506, id: CR, label: `Costa Rica`): `45` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit class `45MutableBuilder`[Self <: `45`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign506): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Costa Rica`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
