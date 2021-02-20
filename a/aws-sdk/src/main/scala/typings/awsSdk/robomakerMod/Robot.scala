package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Robot extends StObject {
  
  /**
    * The architecture of the robot.
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
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.native
  
  /**
    * The Greengrass group associated with the robot.
    */
  var greenGrassGroupId: js.UndefOr[Id] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the robot.
    */
  var status: js.UndefOr[RobotStatus] = js.native
}
object Robot {
  
  @scala.inline
  def apply(): Robot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Robot]
  }
  
  @scala.inline
  implicit class RobotMutableBuilder[Self <: Robot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setFleetArn(value: Arn): Self = StObject.set(x, "fleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArnUndefined: Self = StObject.set(x, "fleetArn", js.undefined)
    
    @scala.inline
    def setGreenGrassGroupId(value: Id): Self = StObject.set(x, "greenGrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenGrassGroupIdUndefined: Self = StObject.set(x, "greenGrassGroupId", js.undefined)
    
    @scala.inline
    def setLastDeploymentJob(value: Arn): Self = StObject.set(x, "lastDeploymentJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentJobUndefined: Self = StObject.set(x, "lastDeploymentJob", js.undefined)
    
    @scala.inline
    def setLastDeploymentTime(value: CreatedAt): Self = StObject.set(x, "lastDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentTimeUndefined: Self = StObject.set(x, "lastDeploymentTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: RobotStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
