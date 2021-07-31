package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRobotRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}
object DeleteRobotRequest {
  
  @scala.inline
  def apply(robot: Arn): DeleteRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRobotRequest]
  }
  
  @scala.inline
  implicit class DeleteRobotRequestMutableBuilder[Self <: DeleteRobotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
  }
}
