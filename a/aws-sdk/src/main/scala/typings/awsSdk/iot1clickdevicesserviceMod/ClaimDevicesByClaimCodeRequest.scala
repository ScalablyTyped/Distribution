package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

