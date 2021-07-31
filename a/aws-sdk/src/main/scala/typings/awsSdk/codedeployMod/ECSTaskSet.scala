package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSTaskSet extends StObject {
  
  /**
    *  The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After the updated task set is created, CodeDeploy shifts traffic to the new task set. 
    */
  var desiredCount: js.UndefOr[ECSTaskSetCount] = js.undefined
  
  /**
    *  A unique ID of an ECSTaskSet. 
    */
  var identifer: js.UndefOr[ECSTaskSetIdentifier] = js.undefined
  
  /**
    *  The number of tasks in the task set that are in the PENDING status during an Amazon ECS deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time, or when it is restarted after being in the STOPPED state. 
    */
  var pendingCount: js.UndefOr[ECSTaskSetCount] = js.undefined
  
  /**
    *  The number of tasks in the task set that are in the RUNNING status during an Amazon ECS deployment. A task in the RUNNING state is running and ready for use. 
    */
  var runningCount: js.UndefOr[ECSTaskSetCount] = js.undefined
  
  /**
    *  The status of the task set. There are three valid task set statuses:     PRIMARY: Indicates the task set is serving production traffic.     ACTIVE: Indicates the task set is not serving production traffic.     DRAINING: Indicates the tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.   
    */
  var status: js.UndefOr[ECSTaskSetStatus] = js.undefined
  
  /**
    *  The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a task set. 
    */
  var targetGroup: js.UndefOr[TargetGroupInfo] = js.undefined
  
  /**
    *  A label that identifies whether the ECS task set is an original target (BLUE) or a replacement target (GREEN). 
    */
  var taskSetLabel: js.UndefOr[TargetLabel] = js.undefined
  
  /**
    *  The percentage of traffic served by this task set. 
    */
  var trafficWeight: js.UndefOr[TrafficWeight] = js.undefined
}
object ECSTaskSet {
  
  @scala.inline
  def apply(): ECSTaskSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSTaskSet]
  }
  
  @scala.inline
  implicit class ECSTaskSetMutableBuilder[Self <: ECSTaskSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredCount(value: ECSTaskSetCount): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    @scala.inline
    def setIdentifer(value: ECSTaskSetIdentifier): Self = StObject.set(x, "identifer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentiferUndefined: Self = StObject.set(x, "identifer", js.undefined)
    
    @scala.inline
    def setPendingCount(value: ECSTaskSetCount): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    @scala.inline
    def setRunningCount(value: ECSTaskSetCount): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    @scala.inline
    def setStatus(value: ECSTaskSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetGroup(value: TargetGroupInfo): Self = StObject.set(x, "targetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupUndefined: Self = StObject.set(x, "targetGroup", js.undefined)
    
    @scala.inline
    def setTaskSetLabel(value: TargetLabel): Self = StObject.set(x, "taskSetLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetLabelUndefined: Self = StObject.set(x, "taskSetLabel", js.undefined)
    
    @scala.inline
    def setTrafficWeight(value: TrafficWeight): Self = StObject.set(x, "trafficWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficWeightUndefined: Self = StObject.set(x, "trafficWeight", js.undefined)
  }
}
