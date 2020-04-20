package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn = js.native
}

object RegisterRobotRequest {
  @scala.inline
  def apply(fleet: Arn, robot: Arn): RegisterRobotRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any], robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRobotRequest]
  }
}

