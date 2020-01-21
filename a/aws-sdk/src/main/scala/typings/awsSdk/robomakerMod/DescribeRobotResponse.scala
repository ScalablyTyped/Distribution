package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRobotResponse extends js.Object {
  /**
    * The target architecture of the robot application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.native
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.native
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  /**
    * The time of the last deployment job.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.native
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the fleet.
    */
  var status: js.UndefOr[RobotStatus] = js.native
  /**
    * The list of all tags added to the specified robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeRobotResponse {
  @scala.inline
  def apply(
    architecture: Architecture = null,
    arn: Arn = null,
    createdAt: CreatedAt = null,
    fleetArn: Arn = null,
    greengrassGroupId: Id = null,
    lastDeploymentJob: Arn = null,
    lastDeploymentTime: CreatedAt = null,
    name: Name = null,
    status: RobotStatus = null,
    tags: TagMap = null
  ): DescribeRobotResponse = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (fleetArn != null) __obj.updateDynamic("fleetArn")(fleetArn.asInstanceOf[js.Any])
    if (greengrassGroupId != null) __obj.updateDynamic("greengrassGroupId")(greengrassGroupId.asInstanceOf[js.Any])
    if (lastDeploymentJob != null) __obj.updateDynamic("lastDeploymentJob")(lastDeploymentJob.asInstanceOf[js.Any])
    if (lastDeploymentTime != null) __obj.updateDynamic("lastDeploymentTime")(lastDeploymentTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRobotResponse]
  }
}

