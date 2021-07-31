package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationTarget extends StObject {
  
  /**
    * The unique ID of an AWS CloudFormation blue/green deployment.
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  The date and time when the target application was updated by an AWS CloudFormation blue/green deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.undefined
  
  /**
    *  The lifecycle events of the AWS CloudFormation blue/green deployment to this target application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  
  /**
    * The resource type for the AWS CloudFormation blue/green deployment.
    */
  var resourceType: js.UndefOr[CloudFormationResourceType] = js.undefined
  
  /**
    *  The status of an AWS CloudFormation blue/green deployment's target application. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  
  /**
    *  The unique ID of a deployment target that has a type of CloudFormationTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
  
  /**
    * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment receives.
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
}
object CloudFormationTarget {
  
  @scala.inline
  def apply(): CloudFormationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationTarget]
  }
  
  @scala.inline
  implicit class CloudFormationTargetMutableBuilder[Self <: CloudFormationTarget] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: CloudFormationResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: TargetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setTargetVersionWeight(value: TrafficWeight): Self = StObject.set(x, "targetVersionWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionWeightUndefined: Self = StObject.set(x, "targetVersionWeight", js.undefined)
  }
}
