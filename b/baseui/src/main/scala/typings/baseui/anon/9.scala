package typings.baseui.anon

import typings.baseui.baseuiStrings.BS
import typings.baseui.baseuiStrings.Bahamas
import typings.baseui.baseuiStrings.Plussign1242
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var dialCode: Plussign1242
  
  var id: BS
  
  var label: Bahamas
}
object `9` {
  
  @scala.inline
  def apply(): `9` = {
    val __obj = js.Dynamic.literal(dialCode = "+1242", id = "BS", label = "Bahamas")
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Bahamas): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
