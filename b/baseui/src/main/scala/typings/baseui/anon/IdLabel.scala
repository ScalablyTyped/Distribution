package typings.baseui.anon

import typings.baseui.baseuiStrings.AS
import typings.baseui.baseuiStrings.Plussign1684
import typings.baseui.baseuiStrings.`American Samoa`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdLabel extends StObject {
  
  var dialCode: Plussign1684 = js.native
  
  var id: AS = js.native
  
  var label: `American Samoa` = js.native
}
object IdLabel {
  
  @scala.inline
  def apply(dialCode: Plussign1684, id: AS, label: `American Samoa`): IdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdLabel]
  }
  
  @scala.inline
  implicit class IdLabelMutableBuilder[Self <: IdLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign1684): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `American Samoa`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
