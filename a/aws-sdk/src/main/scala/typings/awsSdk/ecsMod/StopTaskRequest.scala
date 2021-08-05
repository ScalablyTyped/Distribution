package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTaskRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * An optional message specified when a task is stopped. For example, if you are using a custom scheduler, you can use this parameter to specify the reason for stopping the task here, and the message appears in subsequent DescribeTasks API operations on this task. Up to 255 characters are allowed in this message.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task to stop.
    */
  var task: String
}
object StopTaskRequest {
  
  inline def apply(task: String): StopTaskRequest = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTaskRequest]
  }
  
  extension [Self <: StopTaskRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
