package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatus extends js.Object {
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Any scheduled events associated with the instance.
    */
  var Events: js.UndefOr[InstanceStatusEventList] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The intended state of the instance. DescribeInstanceStatus requires that an instance be in the running state.
    */
  var InstanceState: js.UndefOr[typings.awsSdk.ec2Mod.InstanceState] = js.native
  /**
    * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
    */
  var InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * Reports impaired functionality that stems from issues related to the systems that support an instance, such as hardware failures and network connectivity problems.
    */
  var SystemStatus: js.UndefOr[InstanceStatusSummary] = js.native
}

object InstanceStatus {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    Events: InstanceStatusEventList = null,
    InstanceId: String = null,
    InstanceState: InstanceState = null,
    InstanceStatus: InstanceStatusSummary = null,
    OutpostArn: String = null,
    SystemStatus: InstanceStatusSummary = null
  ): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceState != null) __obj.updateDynamic("InstanceState")(InstanceState.asInstanceOf[js.Any])
    if (InstanceStatus != null) __obj.updateDynamic("InstanceStatus")(InstanceStatus.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (SystemStatus != null) __obj.updateDynamic("SystemStatus")(SystemStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStatus]
  }
}

