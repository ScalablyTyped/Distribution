package typings.baseui.anon

import typings.baseui.baseuiStrings.LI
import typings.baseui.baseuiStrings.Liechtenstein
import typings.baseui.baseuiStrings.Plussign423
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `115` extends StObject {
  
  var dialCode: Plussign423 = js.native
  
  var id: LI = js.native
  
  var label: Liechtenstein = js.native
}
object `115` {
  
  @scala.inline
  def apply(dialCode: Plussign423, id: LI, label: Liechtenstein): `115` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit class `115MutableBuilder`[Self <: `115`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign423): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Liechtenstein): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
