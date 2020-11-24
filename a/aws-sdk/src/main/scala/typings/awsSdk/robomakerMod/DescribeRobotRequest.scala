package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeRobotRequestOps[Self <: DescribeRobotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRobot(value: Arn): Self = this.set("robot", value.asInstanceOf[js.Any])
  }
}
