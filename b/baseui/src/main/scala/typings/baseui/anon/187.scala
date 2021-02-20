package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign65
import typings.baseui.baseuiStrings.SG
import typings.baseui.baseuiStrings.Singapore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `187` extends StObject {
  
  var dialCode: Plussign65 = js.native
  
  var id: SG = js.native
  
  var label: Singapore = js.native
}
object `187` {
  
  @scala.inline
  def apply(dialCode: Plussign65, id: SG, label: Singapore): `187` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`187`]
  }
  
  @scala.inline
  implicit class `187MutableBuilder`[Self <: `187`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign65): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Singapore): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
