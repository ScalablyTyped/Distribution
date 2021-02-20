package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign255
import typings.baseui.baseuiStrings.TZ
import typings.baseui.baseuiStrings.Tanzania
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `207` extends StObject {
  
  var dialCode: Plussign255 = js.native
  
  var id: TZ = js.native
  
  var label: Tanzania = js.native
}
object `207` {
  
  @scala.inline
  def apply(dialCode: Plussign255, id: TZ, label: Tanzania): `207` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit class `207MutableBuilder`[Self <: `207`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign255): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tanzania): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
