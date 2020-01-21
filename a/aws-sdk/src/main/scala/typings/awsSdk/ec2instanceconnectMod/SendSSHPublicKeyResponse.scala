package typings.awsSdk.ec2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendSSHPublicKeyResponse extends js.Object {
  /**
    * The request ID as logged by EC2 Connect. Please provide this when contacting AWS Support.
    */
  var RequestId: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.RequestId] = js.native
  /**
    * Indicates request success.
    */
  var Success: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.Success] = js.native
}

object SendSSHPublicKeyResponse {
  @scala.inline
  def apply(RequestId: RequestId = null, Success: js.UndefOr[Boolean] = js.undefined): SendSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSSHPublicKeyResponse]
  }
}

