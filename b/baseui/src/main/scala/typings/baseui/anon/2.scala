package typings.baseui.anon

import typings.baseui.baseuiStrings.AG
import typings.baseui.baseuiStrings.Plussign1268
import typings.baseui.baseuiStrings.`Antigua and Barbuda`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var dialCode: Plussign1268 = js.native
  
  var id: AG = js.native
  
  var label: `Antigua and Barbuda` = js.native
}
object `2` {
  
  @scala.inline
  def apply(dialCode: Plussign1268, id: AG, label: `Antigua and Barbuda`): `2` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1268): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Antigua and Barbuda`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
