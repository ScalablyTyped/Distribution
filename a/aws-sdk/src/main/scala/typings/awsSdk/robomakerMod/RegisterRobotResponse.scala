package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterRobotResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet that the robot will join.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * Information about the robot registration.
    */
  var robot: js.UndefOr[Arn] = js.native
}

object RegisterRobotResponse {
  @scala.inline
  def apply(fleet: Arn = null, robot: Arn = null): RegisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    if (fleet != null) __obj.updateDynamic("fleet")(fleet.asInstanceOf[js.Any])
    if (robot != null) __obj.updateDynamic("robot")(robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRobotResponse]
  }
}

