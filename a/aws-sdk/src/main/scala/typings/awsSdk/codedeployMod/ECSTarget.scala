package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECSTarget extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    *  The date and time when the target Amazon ECS application was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.native
  
  /**
    *  The lifecycle events of the deployment to this target Amazon ECS application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  
  /**
    *  The status an Amazon ECS deployment's target ECS application. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
  
  /**
    *  The unique ID of a deployment target that has a type of ecsTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
  
  /**
    *  The ECSTaskSet objects associated with the ECS target. 
    */
  var taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.native
}
object ECSTarget {
  
  @scala.inline
  def apply(): ECSTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSTarget]
  }
  
  @scala.inline
  implicit class ECSTargetMutableBuilder[Self <: ECSTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Time): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLifecycleEvents(value: LifecycleEventList): Self = StObject.set(x, "lifecycleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleEventsUndefined: Self = StObject.set(x, "lifecycleEvents", js.undefined)
    
    @scala.inline
    def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = StObject.set(x, "lifecycleEvents", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: TargetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setTaskSetsInfo(value: ECSTaskSetList): Self = StObject.set(x, "taskSetsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetsInfoUndefined: Self = StObject.set(x, "taskSetsInfo", js.undefined)
    
    @scala.inline
    def setTaskSetsInfoVarargs(value: ECSTaskSet*): Self = StObject.set(x, "taskSetsInfo", js.Array(value :_*))
  }
}
