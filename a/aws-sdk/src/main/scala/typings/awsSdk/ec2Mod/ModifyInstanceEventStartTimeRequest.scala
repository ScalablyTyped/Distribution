package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceEventStartTimeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the event whose date and time you are modifying.
    */
  var InstanceEventId: String = js.native
  /**
    * The ID of the instance with the scheduled event.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The new date and time when the event will take place.
    */
  var NotBefore: DateTime = js.native
}

object ModifyInstanceEventStartTimeRequest {
  @scala.inline
  def apply(
    InstanceEventId: String,
    InstanceId: InstanceId,
    NotBefore: DateTime,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyInstanceEventStartTimeRequest = {
    val __obj = js.Dynamic.literal(InstanceEventId = InstanceEventId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NotBefore = NotBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventStartTimeRequest]
  }
}

