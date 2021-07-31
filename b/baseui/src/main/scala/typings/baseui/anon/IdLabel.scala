package typings.baseui.anon

import typings.baseui.baseuiStrings.AS
import typings.baseui.baseuiStrings.Plussign1684
import typings.baseui.baseuiStrings.`American Samoa`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdLabel extends StObject {
  
  var dialCode: Plussign1684
  
  var id: AS
  
  var label: `American Samoa`
}
object IdLabel {
  
  @scala.inline
  def apply(): IdLabel = {
    val __obj = js.Dynamic.literal(dialCode = "+1684", id = "AS", label = "American Samoa")
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
