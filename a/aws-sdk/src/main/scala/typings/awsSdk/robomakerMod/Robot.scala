package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Robot extends js.Object {
  /**
    * The architecture of the robot.
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
    * The Greengrass group associated with the robot.
    */
  var greenGrassGroupId: js.UndefOr[Id] = js.native
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.native
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the robot.
    */
  var status: js.UndefOr[RobotStatus] = js.native
}

object Robot {
  @scala.inline
  def apply(
    architecture: Architecture = null,
    arn: Arn = null,
    createdAt: CreatedAt = null,
    fleetArn: Arn = null,
    greenGrassGroupId: Id = null,
    lastDeploymentJob: Arn = null,
    lastDeploymentTime: CreatedAt = null,
    name: Name = null,
    status: RobotStatus = null
  ): Robot = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (fleetArn != null) __obj.updateDynamic("fleetArn")(fleetArn.asInstanceOf[js.Any])
    if (greenGrassGroupId != null) __obj.updateDynamic("greenGrassGroupId")(greenGrassGroupId.asInstanceOf[js.Any])
    if (lastDeploymentJob != null) __obj.updateDynamic("lastDeploymentJob")(lastDeploymentJob.asInstanceOf[js.Any])
    if (lastDeploymentTime != null) __obj.updateDynamic("lastDeploymentTime")(lastDeploymentTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Robot]
  }
}

