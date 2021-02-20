package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.SJ
import typings.baseui.baseuiStrings.`Svalbard and Jan Mayen`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `200` extends StObject {
  
  var dialCode: Plussign47 = js.native
  
  var id: SJ = js.native
  
  var label: `Svalbard and Jan Mayen` = js.native
}
object `200` {
  
  @scala.inline
  def apply(dialCode: Plussign47, id: SJ, label: `Svalbard and Jan Mayen`): `200` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit class `200MutableBuilder`[Self <: `200`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign47): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Svalbard and Jan Mayen`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
