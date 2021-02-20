package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterRobotResponse extends StObject {
  
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
  def apply(): RegisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterRobotResponse]
  }
  
  @scala.inline
  implicit class RegisterRobotResponseMutableBuilder[Self <: RegisterRobotResponse] (val x: Self) extends AnyVal {
    
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
