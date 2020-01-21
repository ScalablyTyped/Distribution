package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRobotResponse extends js.Object {
  /**
    * The target architecture of the robot.
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
    * The Amazon Resource Name (ARN) of the Greengrass group associated with the robot.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.native
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The list of all tags added to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateRobotResponse {
  @scala.inline
  def apply(
    architecture: Architecture = null,
    arn: Arn = null,
    createdAt: CreatedAt = null,
    greengrassGroupId: Id = null,
    name: Name = null,
    tags: TagMap = null
  ): CreateRobotResponse = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (greengrassGroupId != null) __obj.updateDynamic("greengrassGroupId")(greengrassGroupId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotResponse]
  }
}

