package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign993
import typings.baseui.baseuiStrings.TM
import typings.baseui.baseuiStrings.Turkmenistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `216` extends StObject {
  
  var dialCode: Plussign993 = js.native
  
  var id: TM = js.native
  
  var label: Turkmenistan = js.native
}
object `216` {
  
  @scala.inline
  def apply(dialCode: Plussign993, id: TM, label: Turkmenistan): `216` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`216`]
  }
  
  @scala.inline
  implicit class `216MutableBuilder`[Self <: `216`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign993): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Turkmenistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
