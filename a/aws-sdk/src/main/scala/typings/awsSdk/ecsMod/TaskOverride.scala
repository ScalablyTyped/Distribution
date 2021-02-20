package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOverride extends StObject {
  
  /**
    * One or more container overrides sent to a task.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.native
  
  /**
    * The cpu override for the task.
    */
  var cpu: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
    */
  var executionRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The Elastic Inference accelerator override for the task.
    */
  var inferenceAcceleratorOverrides: js.UndefOr[InferenceAcceleratorOverrides] = js.native
  
  /**
    * The memory override for the task.
    */
  var memory: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
    */
  var taskRoleArn: js.UndefOr[String] = js.native
}
object TaskOverride {
  
  @scala.inline
  def apply(): TaskOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOverride]
  }
  
  @scala.inline
  implicit class TaskOverrideMutableBuilder[Self <: TaskOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerOverrides(value: ContainerOverrides): Self = StObject.set(x, "containerOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerOverridesUndefined: Self = StObject.set(x, "containerOverrides", js.undefined)
    
    @scala.inline
    def setContainerOverridesVarargs(value: ContainerOverride*): Self = StObject.set(x, "containerOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: String): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    @scala.inline
    def setInferenceAcceleratorOverrides(value: InferenceAcceleratorOverrides): Self = StObject.set(x, "inferenceAcceleratorOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceAcceleratorOverridesUndefined: Self = StObject.set(x, "inferenceAcceleratorOverrides", js.undefined)
    
    @scala.inline
    def setInferenceAcceleratorOverridesVarargs(value: InferenceAcceleratorOverride*): Self = StObject.set(x, "inferenceAcceleratorOverrides", js.Array(value :_*))
    
    @scala.inline
    def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setTaskRoleArn(value: String): Self = StObject.set(x, "taskRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRoleArnUndefined: Self = StObject.set(x, "taskRoleArn", js.undefined)
  }
}
