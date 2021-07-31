package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferringInputDeviceSummary extends StObject {
  
  /**
    * The unique ID of the input device.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The optional message that the sender has attached to the transfer.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The AWS account ID for the recipient of the input device transfer.
    */
  var TargetCustomerId: js.UndefOr[string] = js.undefined
  
  /**
    * The type (direction) of the input device transfer.
    */
  var TransferType: js.UndefOr[InputDeviceTransferType] = js.undefined
}
object TransferringInputDeviceSummary {
  
  @scala.inline
  def apply(): TransferringInputDeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferringInputDeviceSummary]
  }
  
  @scala.inline
  implicit class TransferringInputDeviceSummaryMutableBuilder[Self <: TransferringInputDeviceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setTargetCustomerId(value: string): Self = StObject.set(x, "TargetCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCustomerIdUndefined: Self = StObject.set(x, "TargetCustomerId", js.undefined)
    
    @scala.inline
    def setTransferType(value: InputDeviceTransferType): Self = StObject.set(x, "TransferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferTypeUndefined: Self = StObject.set(x, "TransferType", js.undefined)
  }
}
