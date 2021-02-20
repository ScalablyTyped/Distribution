package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign688
import typings.baseui.baseuiStrings.TV
import typings.baseui.baseuiStrings.Tuvalu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `218` extends StObject {
  
  var dialCode: Plussign688 = js.native
  
  var id: TV = js.native
  
  var label: Tuvalu = js.native
}
object `218` {
  
  @scala.inline
  def apply(dialCode: Plussign688, id: TV, label: Tuvalu): `218` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit class `218MutableBuilder`[Self <: `218`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign688): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Tuvalu): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
