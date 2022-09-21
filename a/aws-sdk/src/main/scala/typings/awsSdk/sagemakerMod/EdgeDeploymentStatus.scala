package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeDeploymentStatus extends StObject {
  
  /**
    * The number of edge devices that failed the deployment in current stage.
    */
  var EdgeDeploymentFailedInStage: Integer
  
  /**
    * The number of edge devices yet to pick up the deployment in current stage, or in progress.
    */
  var EdgeDeploymentPendingInStage: Integer
  
  /**
    * The time when the deployment API started.
    */
  var EdgeDeploymentStageStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A detailed message about deployment status in current stage.
    */
  var EdgeDeploymentStatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The number of edge devices with the successful deployment in the current stage.
    */
  var EdgeDeploymentSuccessInStage: Integer
  
  /**
    * The general status of the current stage.
    */
  var StageStatus: typings.awsSdk.sagemakerMod.StageStatus
}
object EdgeDeploymentStatus {
  
  inline def apply(
    EdgeDeploymentFailedInStage: Integer,
    EdgeDeploymentPendingInStage: Integer,
    EdgeDeploymentSuccessInStage: Integer,
    StageStatus: StageStatus
  ): EdgeDeploymentStatus = {
    val __obj = js.Dynamic.literal(EdgeDeploymentFailedInStage = EdgeDeploymentFailedInStage.asInstanceOf[js.Any], EdgeDeploymentPendingInStage = EdgeDeploymentPendingInStage.asInstanceOf[js.Any], EdgeDeploymentSuccessInStage = EdgeDeploymentSuccessInStage.asInstanceOf[js.Any], StageStatus = StageStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDeploymentStatus]
  }
  
  extension [Self <: EdgeDeploymentStatus](x: Self) {
    
    inline def setEdgeDeploymentFailedInStage(value: Integer): Self = StObject.set(x, "EdgeDeploymentFailedInStage", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPendingInStage(value: Integer): Self = StObject.set(x, "EdgeDeploymentPendingInStage", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentStageStartTime(value: js.Date): Self = StObject.set(x, "EdgeDeploymentStageStartTime", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentStageStartTimeUndefined: Self = StObject.set(x, "EdgeDeploymentStageStartTime", js.undefined)
    
    inline def setEdgeDeploymentStatusMessage(value: String): Self = StObject.set(x, "EdgeDeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentStatusMessageUndefined: Self = StObject.set(x, "EdgeDeploymentStatusMessage", js.undefined)
    
    inline def setEdgeDeploymentSuccessInStage(value: Integer): Self = StObject.set(x, "EdgeDeploymentSuccessInStage", value.asInstanceOf[js.Any])
    
    inline def setStageStatus(value: StageStatus): Self = StObject.set(x, "StageStatus", value.asInstanceOf[js.Any])
  }
}
