package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot to be described.
    */
  var robot: Arn = js.native
}

object DescribeRobotRequest {
  @scala.inline
  def apply(robot: Arn): DescribeRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRobotRequest]
  }
}

