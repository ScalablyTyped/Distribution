package typings.baseui.anon

import typings.baseui.baseuiStrings.ML
import typings.baseui.baseuiStrings.Mali
import typings.baseui.baseuiStrings.Plussign223
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `124` extends StObject {
  
  var dialCode: Plussign223 = js.native
  
  var id: ML = js.native
  
  var label: Mali = js.native
}
object `124` {
  
  @scala.inline
  def apply(dialCode: Plussign223, id: ML, label: Mali): `124` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit class `124MutableBuilder`[Self <: `124`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign223): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ML): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Mali): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
