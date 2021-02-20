package typings.baseui.anon

import typings.baseui.baseuiStrings.BZ
import typings.baseui.baseuiStrings.Belize
import typings.baseui.baseuiStrings.Plussign501
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `15` extends StObject {
  
  var dialCode: Plussign501 = js.native
  
  var id: BZ = js.native
  
  var label: Belize = js.native
}
object `15` {
  
  @scala.inline
  def apply(dialCode: Plussign501, id: BZ, label: Belize): `15` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign501): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Belize): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
