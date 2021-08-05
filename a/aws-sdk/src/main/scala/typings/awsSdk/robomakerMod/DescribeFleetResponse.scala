package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the last deployment.
    */
  var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
  
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * A list of robots.
    */
  var robots: js.UndefOr[Robots] = js.undefined
  
  /**
    * The list of all tags added to the specified fleet.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeFleetResponse {
  
  inline def apply(): DescribeFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetResponse]
  }
  
  extension [Self <: DescribeFleetResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastDeploymentJob(value: Arn): Self = StObject.set(x, "lastDeploymentJob", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentJobUndefined: Self = StObject.set(x, "lastDeploymentJob", js.undefined)
    
    inline def setLastDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "lastDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentStatusUndefined: Self = StObject.set(x, "lastDeploymentStatus", js.undefined)
    
    inline def setLastDeploymentTime(value: CreatedAt): Self = StObject.set(x, "lastDeploymentTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentTimeUndefined: Self = StObject.set(x, "lastDeploymentTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRobots(value: Robots): Self = StObject.set(x, "robots", value.asInstanceOf[js.Any])
    
    inline def setRobotsUndefined: Self = StObject.set(x, "robots", js.undefined)
    
    inline def setRobotsVarargs(value: Robot*): Self = StObject.set(x, "robots", js.Array(value :_*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
