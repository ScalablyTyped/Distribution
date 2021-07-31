package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1284
import typings.baseui.baseuiStrings.VG
import typings.baseui.baseuiStrings.`British Virgin Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var dialCode: Plussign1284
  
  var id: VG
  
  var label: `British Virgin Islands`
}
object `24` {
  
  @scala.inline
  def apply(): `24` = {
    val __obj = js.Dynamic.literal(dialCode = "+1284", id = "VG", label = "British Virgin Islands")
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1284): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `British Virgin Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
