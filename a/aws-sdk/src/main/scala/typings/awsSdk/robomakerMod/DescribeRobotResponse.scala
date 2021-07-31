package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRobotResponse extends StObject {
  
  /**
    * The target architecture of the robot application.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time of the last deployment job.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the fleet.
    */
  var status: js.UndefOr[RobotStatus] = js.undefined
  
  /**
    * The list of all tags added to the specified robot.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeRobotResponse {
  
  @scala.inline
  def apply(): DescribeRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRobotResponse]
  }
  
  @scala.inline
  implicit class DescribeRobotResponseMutableBuilder[Self <: DescribeRobotResponse] (val x: Self) extends AnyVal {
    
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
    def setGreengrassGroupId(value: Id): Self = StObject.set(x, "greengrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupIdUndefined: Self = StObject.set(x, "greengrassGroupId", js.undefined)
    
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
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
