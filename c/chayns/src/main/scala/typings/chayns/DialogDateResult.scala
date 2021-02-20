package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogDateResult extends StObject {
  
  var buttonType: typings.chayns.chayns.dialog.buttonType = js.native
  
  var timestamp: Double = js.native
}
object DialogDateResult {
  
  @scala.inline
  def apply(buttonType: buttonType, timestamp: Double): DialogDateResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateResult]
  }
  
  @scala.inline
  implicit class DialogDateResultMutableBuilder[Self <: DialogDateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonType(value: buttonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
