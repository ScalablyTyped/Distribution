package typings.baseui.anon

import typings.baseui.baseuiStrings.LU
import typings.baseui.baseuiStrings.Luxembourg
import typings.baseui.baseuiStrings.Plussign352
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `117` extends StObject {
  
  var dialCode: Plussign352 = js.native
  
  var id: LU = js.native
  
  var label: Luxembourg = js.native
}
object `117` {
  
  @scala.inline
  def apply(dialCode: Plussign352, id: LU, label: Luxembourg): `117` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit class `117MutableBuilder`[Self <: `117`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign352): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Luxembourg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
