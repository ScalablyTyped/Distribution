package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTarget extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  A label that identifies whether the instance is an original target (BLUE) or a replacement target (GREEN). 
    */
  var instanceLabel: js.UndefOr[TargetLabel] = js.undefined
  
  /**
    *  The date and time when the target instance was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.undefined
  
  /**
    *  The lifecycle events of the deployment to this target instance. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  
  /**
    *  The status an EC2/On-premises deployment's target instance. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
  
  /**
    *  The unique ID of a deployment target that has a type of instanceTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}
object InstanceTarget {
  
  @scala.inline
  def apply(): InstanceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTarget]
  }
  
  @scala.inline
  implicit class InstanceTargetMutableBuilder[Self <: InstanceTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setInstanceLabel(value: TargetLabel): Self = StObject.set(x, "instanceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceLabelUndefined: Self = StObject.set(x, "instanceLabel", js.undefined)
    
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
  }
}
