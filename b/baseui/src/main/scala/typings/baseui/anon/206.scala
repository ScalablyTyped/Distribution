package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign992
import typings.baseui.baseuiStrings.TJ
import typings.baseui.baseuiStrings.Tajikistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `206` extends StObject {
  
  var dialCode: Plussign992 = js.native
  
  var id: TJ = js.native
  
  var label: Tajikistan = js.native
}
object `206` {
  
  @scala.inline
  def apply(dialCode: Plussign992, id: TJ, label: Tajikistan): `206` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit class `206MutableBuilder`[Self <: `206`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign992): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tajikistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
