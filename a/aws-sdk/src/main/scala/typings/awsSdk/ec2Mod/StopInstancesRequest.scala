package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Forces the instances to stop. The instances do not have an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file system check and repair procedures. This option is not recommended for Windows instances. Default: false 
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * Hibernates the instance if the instance was enabled for hibernation at launch. If the instance cannot hibernate successfully, a normal shutdown occurs. For more information, see Hibernate your instance in the Amazon Elastic Compute Cloud User Guide.  Default: false 
    */
  var Hibernate: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the instances.
    */
  var InstanceIds: InstanceIdStringList = js.native
}

object StopInstancesRequest {
  @scala.inline
  def apply(
    InstanceIds: InstanceIdStringList,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Force: js.UndefOr[Boolean] = js.undefined,
    Hibernate: js.UndefOr[Boolean] = js.undefined
  ): StopInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Hibernate)) __obj.updateDynamic("Hibernate")(Hibernate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstancesRequest]
  }
}

