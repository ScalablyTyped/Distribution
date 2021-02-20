package typings.baseui.anon

import typings.baseui.baseuiStrings.NR
import typings.baseui.baseuiStrings.Nauru
import typings.baseui.baseuiStrings.Plussign674
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `142` extends StObject {
  
  var dialCode: Plussign674 = js.native
  
  var id: NR = js.native
  
  var label: Nauru = js.native
}
object `142` {
  
  @scala.inline
  def apply(dialCode: Plussign674, id: NR, label: Nauru): `142` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`142`]
  }
  
  @scala.inline
  implicit class `142MutableBuilder`[Self <: `142`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign674): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Nauru): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
