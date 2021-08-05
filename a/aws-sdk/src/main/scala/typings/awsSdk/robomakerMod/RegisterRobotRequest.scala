package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterRobotRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}
object RegisterRobotRequest {
  
  inline def apply(fleet: Arn, robot: Arn): RegisterRobotRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any], robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRobotRequest]
  }
  
  extension [Self <: RegisterRobotRequest](x: Self) {
    
    inline def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
  }
}
