package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterRobotRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}
object DeregisterRobotRequest {
  
  @scala.inline
  def apply(fleet: Arn, robot: Arn): DeregisterRobotRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any], robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterRobotRequest]
  }
  
  @scala.inline
  implicit class DeregisterRobotRequestMutableBuilder[Self <: DeregisterRobotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
  }
}
