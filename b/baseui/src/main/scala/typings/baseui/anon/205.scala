package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign886
import typings.baseui.baseuiStrings.TW
import typings.baseui.baseuiStrings.`Taiwan Leftparenthesis台灣Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  var dialCode: Plussign886
  
  var id: TW
  
  var label: `Taiwan Leftparenthesis台灣Rightparenthesis`
}
object `205` {
  
  @scala.inline
  def apply(): `205` = {
    val __obj = js.Dynamic.literal(dialCode = "+886", id = "TW", label = "Taiwan (\u53F0\u7063)")
    __obj.asInstanceOf[`205`]
  }
  
  @scala.inline
  implicit class `205MutableBuilder`[Self <: `205`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign886): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Taiwan Leftparenthesis台灣Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
