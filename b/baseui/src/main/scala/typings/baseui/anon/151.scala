package typings.baseui.anon

import typings.baseui.baseuiStrings.NF
import typings.baseui.baseuiStrings.Plussign672
import typings.baseui.baseuiStrings.`Norfolk Island`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `151` extends StObject {
  
  var dialCode: Plussign672 = js.native
  
  var id: NF = js.native
  
  var label: `Norfolk Island` = js.native
}
object `151` {
  
  @scala.inline
  def apply(dialCode: Plussign672, id: NF, label: `Norfolk Island`): `151` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit class `151MutableBuilder`[Self <: `151`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign672): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Norfolk Island`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
