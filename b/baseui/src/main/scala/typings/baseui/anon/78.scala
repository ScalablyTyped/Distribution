package typings.baseui.anon

import typings.baseui.baseuiStrings.GD
import typings.baseui.baseuiStrings.Grenada
import typings.baseui.baseuiStrings.Plussign1473
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `78` extends StObject {
  
  var dialCode: Plussign1473 = js.native
  
  var id: GD = js.native
  
  var label: Grenada = js.native
}
object `78` {
  
  @scala.inline
  def apply(dialCode: Plussign1473, id: GD, label: Grenada): `78` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit class `78MutableBuilder`[Self <: `78`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1473): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Grenada): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
