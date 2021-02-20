package typings.baseui.anon

import typings.baseui.baseuiStrings.NI
import typings.baseui.baseuiStrings.Nicaragua
import typings.baseui.baseuiStrings.Plussign505
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `147` extends StObject {
  
  var dialCode: Plussign505 = js.native
  
  var id: NI = js.native
  
  var label: Nicaragua = js.native
}
object `147` {
  
  @scala.inline
  def apply(dialCode: Plussign505, id: NI, label: Nicaragua): `147` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit class `147MutableBuilder`[Self <: `147`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign505): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Nicaragua): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
