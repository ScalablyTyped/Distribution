package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimDevicesByClaimCodeResponse extends js.Object {
  
  /**
    * The claim code provided by the device manufacturer.
    */
  var ClaimCode: js.UndefOr[stringMin12Max40] = js.native
  
  /**
    * The total number of devices associated with the claim code that has been processed in
    the claim request.
    */
  var Total: js.UndefOr[integer] = js.native
}
object ClaimDevicesByClaimCodeResponse {
  
  @scala.inline
  def apply(): ClaimDevicesByClaimCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDevicesByClaimCodeResponse]
  }
  
  @scala.inline
  implicit class ClaimDevicesByClaimCodeResponseOps[Self <: ClaimDevicesByClaimCodeResponse] (val x: Self) extends AnyVal {
    
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
    def setClaimCode(value: stringMin12Max40): Self = this.set("ClaimCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimCode: Self = this.set("ClaimCode", js.undefined)
    
    @scala.inline
    def setTotal(value: integer): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
}
