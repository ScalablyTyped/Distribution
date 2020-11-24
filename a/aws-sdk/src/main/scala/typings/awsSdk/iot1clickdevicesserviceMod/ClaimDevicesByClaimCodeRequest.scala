package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimDevicesByClaimCodeRequest extends js.Object {
  
  /**
    * The claim code, starting with "C-", as provided by the device manufacturer.
    */
  var ClaimCode: string = js.native
}
object ClaimDevicesByClaimCodeRequest {
  
  @scala.inline
  def apply(ClaimCode: string): ClaimDevicesByClaimCodeRequest = {
    val __obj = js.Dynamic.literal(ClaimCode = ClaimCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDevicesByClaimCodeRequest]
  }
  
  @scala.inline
  implicit class ClaimDevicesByClaimCodeRequestOps[Self <: ClaimDevicesByClaimCodeRequest] (val x: Self) extends AnyVal {
    
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
    def setClaimCode(value: string): Self = this.set("ClaimCode", value.asInstanceOf[js.Any])
  }
}
