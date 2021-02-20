package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign228
import typings.baseui.baseuiStrings.TG
import typings.baseui.baseuiStrings.Togo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `210` extends StObject {
  
  var dialCode: Plussign228 = js.native
  
  var id: TG = js.native
  
  var label: Togo = js.native
}
object `210` {
  
  @scala.inline
  def apply(dialCode: Plussign228, id: TG, label: Togo): `210` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`210`]
  }
  
  @scala.inline
  implicit class `210MutableBuilder`[Self <: `210`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign228): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Togo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
