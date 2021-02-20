package typings.baseui.anon

import typings.baseui.baseuiStrings.HN
import typings.baseui.baseuiStrings.Honduras
import typings.baseui.baseuiStrings.Plussign504
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `87` extends StObject {
  
  var dialCode: Plussign504 = js.native
  
  var id: HN = js.native
  
  var label: Honduras = js.native
}
object `87` {
  
  @scala.inline
  def apply(dialCode: Plussign504, id: HN, label: Honduras): `87` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit class `87MutableBuilder`[Self <: `87`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign504): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: HN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Honduras): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
