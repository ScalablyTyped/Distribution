package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInputDeviceTransferRequest extends StObject {
  
  /**
    * The unique ID of the input device to reject. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object RejectInputDeviceTransferRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): RejectInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInputDeviceTransferRequest]
  }
  
  @scala.inline
  implicit class RejectInputDeviceTransferRequestMutableBuilder[Self <: RejectInputDeviceTransferRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
