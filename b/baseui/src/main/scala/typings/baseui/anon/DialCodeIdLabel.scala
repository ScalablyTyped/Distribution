package typings.baseui.anon

import typings.baseui.baseuiStrings.AD
import typings.baseui.baseuiStrings.Andorra
import typings.baseui.baseuiStrings.Plussign376
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialCodeIdLabel extends StObject {
  
  var dialCode: Plussign376
  
  var id: AD
  
  var label: Andorra
}
object DialCodeIdLabel {
  
  @scala.inline
  def apply(): DialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = "+376", id = "AD", label = "Andorra")
    __obj.asInstanceOf[DialCodeIdLabel]
  }
  
  @scala.inline
  implicit class DialCodeIdLabelMutableBuilder[Self <: DialCodeIdLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign376): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Andorra): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
