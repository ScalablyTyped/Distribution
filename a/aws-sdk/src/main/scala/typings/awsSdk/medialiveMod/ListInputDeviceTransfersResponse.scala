package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputDeviceTransfersResponse extends js.Object {
  
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
  implicit class ListInputDeviceTransfersResponseOps[Self <: ListInputDeviceTransfersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputDeviceTransfersVarargs(value: TransferringInputDeviceSummary*): Self = this.set("InputDeviceTransfers", js.Array(value :_*))
    
    @scala.inline
    def setInputDeviceTransfers(value: listOfTransferringInputDeviceSummary): Self = this.set("InputDeviceTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDeviceTransfers: Self = this.set("InputDeviceTransfers", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
