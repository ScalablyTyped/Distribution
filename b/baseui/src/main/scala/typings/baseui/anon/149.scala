package typings.baseui.anon

import typings.baseui.baseuiStrings.NG
import typings.baseui.baseuiStrings.Nigeria
import typings.baseui.baseuiStrings.Plussign234
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `149` extends StObject {
  
  var dialCode: Plussign234 = js.native
  
  var id: NG = js.native
  
  var label: Nigeria = js.native
}
object `149` {
  
  @scala.inline
  def apply(dialCode: Plussign234, id: NG, label: Nigeria): `149` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`149`]
  }
  
  @scala.inline
  implicit class `149MutableBuilder`[Self <: `149`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign234): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Nigeria): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
