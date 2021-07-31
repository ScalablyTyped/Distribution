package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterRobotResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: js.UndefOr[Arn] = js.undefined
}
object DeregisterRobotResponse {
  
  @scala.inline
  def apply(): DeregisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterRobotResponse]
  }
  
  @scala.inline
  implicit class DeregisterRobotResponseMutableBuilder[Self <: DeregisterRobotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    @scala.inline
    def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotUndefined: Self = StObject.set(x, "robot", js.undefined)
  }
}
