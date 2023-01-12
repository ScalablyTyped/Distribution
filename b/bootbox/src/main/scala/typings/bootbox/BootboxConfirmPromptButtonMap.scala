package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ButtonMap options for confirm and prompt modals */
trait BootboxConfirmPromptButtonMap
  extends StObject
     with BootboxButtonMap {
  
  var cancel: BootboxButton | js.Function
  
  var confirm: BootboxButton | js.Function
}
object BootboxConfirmPromptButtonMap {
  
  inline def apply(cancel: BootboxButton | js.Function, confirm: BootboxButton | js.Function): BootboxConfirmPromptButtonMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxConfirmPromptButtonMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootboxConfirmPromptButtonMap] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: BootboxButton | js.Function): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: BootboxButton | js.Function): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
  }
}
