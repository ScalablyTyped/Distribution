package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInputDeviceTransferRequest extends StObject {
  
  /**
    * The unique ID of the input device to accept. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object AcceptInputDeviceTransferRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): AcceptInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInputDeviceTransferRequest]
  }
  
  @scala.inline
  implicit class AcceptInputDeviceTransferRequestMutableBuilder[Self <: AcceptInputDeviceTransferRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
