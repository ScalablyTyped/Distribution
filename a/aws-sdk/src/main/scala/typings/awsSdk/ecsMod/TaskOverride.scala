package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOverride extends StObject {
  
  /**
    * One or more container overrides sent to a task.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
  
  /**
    * The cpu override for the task.
    */
  var cpu: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
    */
  var executionRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic Inference accelerator override for the task.
    */
  var inferenceAcceleratorOverrides: js.UndefOr[InferenceAcceleratorOverrides] = js.undefined
  
  /**
    * The memory override for the task.
    */
  var memory: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
    */
  var taskRoleArn: js.UndefOr[String] = js.undefined
}
object TaskOverride {
  
  inline def apply(): TaskOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOverride]
  }
  
  extension [Self <: TaskOverride](x: Self) {
    
    inline def setContainerOverrides(value: ContainerOverrides): Self = StObject.set(x, "containerOverrides", value.asInstanceOf[js.Any])
    
    inline def setContainerOverridesUndefined: Self = StObject.set(x, "containerOverrides", js.undefined)
    
    inline def setContainerOverridesVarargs(value: ContainerOverride*): Self = StObject.set(x, "containerOverrides", js.Array(value :_*))
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setExecutionRoleArn(value: String): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    inline def setInferenceAcceleratorOverrides(value: InferenceAcceleratorOverrides): Self = StObject.set(x, "inferenceAcceleratorOverrides", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorOverridesUndefined: Self = StObject.set(x, "inferenceAcceleratorOverrides", js.undefined)
    
    inline def setInferenceAcceleratorOverridesVarargs(value: InferenceAcceleratorOverride*): Self = StObject.set(x, "inferenceAcceleratorOverrides", js.Array(value :_*))
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setTaskRoleArn(value: String): Self = StObject.set(x, "taskRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTaskRoleArnUndefined: Self = StObject.set(x, "taskRoleArn", js.undefined)
  }
}
