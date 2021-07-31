package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceSummary extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    * The instance ID.
    */
  var instanceId: js.UndefOr[InstanceId] = js.undefined
  
  /**
    * Information about which environment an instance belongs to in a blue/green deployment.   BLUE: The instance is part of the original environment.   GREEN: The instance is part of the replacement environment.  
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * A timestamp that indicates when the instance information was last updated.
    */
  var lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A list of lifecycle events for this instance.
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  
  /**
    * The deployment status for this instance:    Pending: The deployment is pending for this instance.    In Progress: The deployment is in progress for this instance.    Succeeded: The deployment has succeeded for this instance.    Failed: The deployment has failed for this instance.    Skipped: The deployment has been skipped for this instance.    Unknown: The deployment status is unknown for this instance.  
    */
  var status: js.UndefOr[InstanceStatus] = js.undefined
}
object InstanceSummary {
  
  @scala.inline
  def apply(): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSummary]
  }
  
  @scala.inline
  implicit class InstanceSummaryMutableBuilder[Self <: InstanceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Timestamp): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLifecycleEvents(value: LifecycleEventList): Self = StObject.set(x, "lifecycleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleEventsUndefined: Self = StObject.set(x, "lifecycleEvents", js.undefined)
    
    @scala.inline
    def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = StObject.set(x, "lifecycleEvents", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: InstanceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
