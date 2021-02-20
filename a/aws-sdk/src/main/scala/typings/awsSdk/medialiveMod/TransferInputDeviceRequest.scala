package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferInputDeviceRequest extends StObject {
  
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
  
  /**
    * The AWS account ID (12 digits) for the recipient of the device transfer.
    */
  var TargetCustomerId: js.UndefOr[string] = js.native
  
  /**
    * An optional message for the recipient. Maximum 280 characters.
    */
  var TransferMessage: js.UndefOr[string] = js.native
}
object TransferInputDeviceRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): TransferInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInputDeviceRequest]
  }
  
  @scala.inline
  implicit class TransferInputDeviceRequestMutableBuilder[Self <: TransferInputDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCustomerId(value: string): Self = StObject.set(x, "TargetCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCustomerIdUndefined: Self = StObject.set(x, "TargetCustomerId", js.undefined)
    
    @scala.inline
    def setTransferMessage(value: string): Self = StObject.set(x, "TransferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessageUndefined: Self = StObject.set(x, "TransferMessage", js.undefined)
  }
}
