package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogFacebookButton extends StObject {
  
  var text: String = js.native
  
  var value: Double = js.native
}
object DialogFacebookButton {
  
  @scala.inline
  def apply(text: String, value: Double): DialogFacebookButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookButton]
  }
  
  @scala.inline
  implicit class DialogFacebookButtonMutableBuilder[Self <: DialogFacebookButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
