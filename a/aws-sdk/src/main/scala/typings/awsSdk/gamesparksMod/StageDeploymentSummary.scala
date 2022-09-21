package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageDeploymentSummary extends StObject {
  
  /**
    * The type of action of the deployment.
    */
  var DeploymentAction: js.UndefOr[typings.awsSdk.gamesparksMod.DeploymentAction] = js.undefined
  
  /**
    * The identifier of the deployment.
    */
  var DeploymentId: js.UndefOr[typings.awsSdk.gamesparksMod.DeploymentId] = js.undefined
  
  /**
    * The result of the deployment.
    */
  var DeploymentResult: js.UndefOr[typings.awsSdk.gamesparksMod.DeploymentResult] = js.undefined
  
  /**
    * The state of the deployment.
    */
  var DeploymentState: js.UndefOr[typings.awsSdk.gamesparksMod.DeploymentState] = js.undefined
  
  /**
    * The timestamp of when the deployment was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the snapshot associated with the stage deployment.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.gamesparksMod.SnapshotId] = js.undefined
}
object StageDeploymentSummary {
  
  inline def apply(): StageDeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageDeploymentSummary]
  }
  
  extension [Self <: StageDeploymentSummary](x: Self) {
    
    inline def setDeploymentAction(value: DeploymentAction): Self = StObject.set(x, "DeploymentAction", value.asInstanceOf[js.Any])
    
    inline def setDeploymentActionUndefined: Self = StObject.set(x, "DeploymentAction", js.undefined)
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setDeploymentResult(value: DeploymentResult): Self = StObject.set(x, "DeploymentResult", value.asInstanceOf[js.Any])
    
    inline def setDeploymentResultUndefined: Self = StObject.set(x, "DeploymentResult", js.undefined)
    
    inline def setDeploymentState(value: DeploymentState): Self = StObject.set(x, "DeploymentState", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStateUndefined: Self = StObject.set(x, "DeploymentState", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
