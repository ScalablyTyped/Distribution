package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeDeploymentPlanSummary extends StObject {
  
  /**
    * The time when the edge deployment plan was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the device fleet used for the deployment. 
    */
  var DeviceFleetName: EntityName
  
  /**
    * The number of edge devices that failed the deployment.
    */
  var EdgeDeploymentFailed: Integer
  
  /**
    * The number of edge devices yet to pick up the deployment, or in progress.
    */
  var EdgeDeploymentPending: Integer
  
  /**
    * The ARN of the edge deployment plan.
    */
  var EdgeDeploymentPlanArn: typings.awsSdk.sagemakerMod.EdgeDeploymentPlanArn
  
  /**
    * The name of the edge deployment plan.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The number of edge devices with the successful deployment.
    */
  var EdgeDeploymentSuccess: Integer
  
  /**
    * The time when the edge deployment plan was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object EdgeDeploymentPlanSummary {
  
  inline def apply(
    DeviceFleetName: EntityName,
    EdgeDeploymentFailed: Integer,
    EdgeDeploymentPending: Integer,
    EdgeDeploymentPlanArn: EdgeDeploymentPlanArn,
    EdgeDeploymentPlanName: EntityName,
    EdgeDeploymentSuccess: Integer
  ): EdgeDeploymentPlanSummary = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], EdgeDeploymentFailed = EdgeDeploymentFailed.asInstanceOf[js.Any], EdgeDeploymentPending = EdgeDeploymentPending.asInstanceOf[js.Any], EdgeDeploymentPlanArn = EdgeDeploymentPlanArn.asInstanceOf[js.Any], EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], EdgeDeploymentSuccess = EdgeDeploymentSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDeploymentPlanSummary]
  }
  
  extension [Self <: EdgeDeploymentPlanSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentFailed(value: Integer): Self = StObject.set(x, "EdgeDeploymentFailed", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPending(value: Integer): Self = StObject.set(x, "EdgeDeploymentPending", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanArn(value: EdgeDeploymentPlanArn): Self = StObject.set(x, "EdgeDeploymentPlanArn", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentSuccess(value: Integer): Self = StObject.set(x, "EdgeDeploymentSuccess", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
