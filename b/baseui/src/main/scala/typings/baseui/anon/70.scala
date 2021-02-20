package typings.baseui.anon

import typings.baseui.baseuiStrings.GA
import typings.baseui.baseuiStrings.Gabon
import typings.baseui.baseuiStrings.Plussign241
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `70` extends StObject {
  
  var dialCode: Plussign241 = js.native
  
  var id: GA = js.native
  
  var label: Gabon = js.native
}
object `70` {
  
  @scala.inline
  def apply(dialCode: Plussign241, id: GA, label: Gabon): `70` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`70`]
  }
  
  @scala.inline
  implicit class `70MutableBuilder`[Self <: `70`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign241): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Gabon): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
