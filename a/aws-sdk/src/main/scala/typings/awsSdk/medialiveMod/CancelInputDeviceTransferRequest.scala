package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelInputDeviceTransferRequest extends StObject {
  
  /**
    * The unique ID of the input device to cancel. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
}
object CancelInputDeviceTransferRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): CancelInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelInputDeviceTransferRequest]
  }
  
  @scala.inline
  implicit class CancelInputDeviceTransferRequestMutableBuilder[Self <: CancelInputDeviceTransferRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
