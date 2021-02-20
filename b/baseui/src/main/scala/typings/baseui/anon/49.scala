package typings.baseui.anon

import typings.baseui.baseuiStrings.CW
import typings.baseui.baseuiStrings.Curaçao
import typings.baseui.baseuiStrings.Plussign599
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `49` extends StObject {
  
  var dialCode: Plussign599 = js.native
  
  var id: CW = js.native
  
  var label: Curaçao = js.native
}
object `49` {
  
  @scala.inline
  def apply(dialCode: Plussign599, id: CW, label: Curaçao): `49` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit class `49MutableBuilder`[Self <: `49`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign599): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Curaçao): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
