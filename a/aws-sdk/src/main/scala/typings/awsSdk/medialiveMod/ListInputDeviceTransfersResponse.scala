package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputDeviceTransfersResponse extends StObject {
  
  /**
    * The list of devices that you are transferring or are being transferred to you.
    */
  var InputDeviceTransfers: js.UndefOr[listOfTransferringInputDeviceSummary] = js.native
  
  /**
    * A token to get additional list results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListInputDeviceTransfersResponse {
  
  @scala.inline
  def apply(): ListInputDeviceTransfersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputDeviceTransfersResponse]
  }
  
  @scala.inline
  implicit class ListInputDeviceTransfersResponseMutableBuilder[Self <: ListInputDeviceTransfersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDeviceTransfers(value: listOfTransferringInputDeviceSummary): Self = StObject.set(x, "InputDeviceTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDeviceTransfersUndefined: Self = StObject.set(x, "InputDeviceTransfers", js.undefined)
    
    @scala.inline
    def setInputDeviceTransfersVarargs(value: TransferringInputDeviceSummary*): Self = StObject.set(x, "InputDeviceTransfers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
