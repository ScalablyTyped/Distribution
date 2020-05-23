package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPasswordDataRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}

object GetPasswordDataRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, DryRun: js.UndefOr[Boolean] = js.undefined): GetPasswordDataRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPasswordDataRequest]
  }
}

