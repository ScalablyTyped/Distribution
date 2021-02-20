package typings.baseui.anon

import typings.baseui.baseuiStrings.MQ
import typings.baseui.baseuiStrings.Martinique
import typings.baseui.baseuiStrings.Plussign596
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `127` extends StObject {
  
  var dialCode: Plussign596 = js.native
  
  var id: MQ = js.native
  
  var label: Martinique = js.native
}
object `127` {
  
  @scala.inline
  def apply(dialCode: Plussign596, id: MQ, label: Martinique): `127` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit class `127MutableBuilder`[Self <: `127`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign596): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MQ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Martinique): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
