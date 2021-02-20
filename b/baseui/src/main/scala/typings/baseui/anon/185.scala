package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign248
import typings.baseui.baseuiStrings.SC
import typings.baseui.baseuiStrings.Seychelles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `185` extends StObject {
  
  var dialCode: Plussign248 = js.native
  
  var id: SC = js.native
  
  var label: Seychelles = js.native
}
object `185` {
  
  @scala.inline
  def apply(dialCode: Plussign248, id: SC, label: Seychelles): `185` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`185`]
  }
  
  @scala.inline
  implicit class `185MutableBuilder`[Self <: `185`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign248): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Seychelles): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
