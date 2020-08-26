package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOverride extends js.Object {
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
  implicit class TaskOverrideOps[Self <: TaskOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerOverridesVarargs(value: ContainerOverride*): Self = this.set("containerOverrides", js.Array(value :_*))
    @scala.inline
    def setContainerOverrides(value: ContainerOverrides): Self = this.set("containerOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerOverrides: Self = this.set("containerOverrides", js.undefined)
    @scala.inline
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setExecutionRoleArn(value: String): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("executionRoleArn", js.undefined)
    @scala.inline
    def setInferenceAcceleratorOverridesVarargs(value: InferenceAcceleratorOverride*): Self = this.set("inferenceAcceleratorOverrides", js.Array(value :_*))
    @scala.inline
    def setInferenceAcceleratorOverrides(value: InferenceAcceleratorOverrides): Self = this.set("inferenceAcceleratorOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferenceAcceleratorOverrides: Self = this.set("inferenceAcceleratorOverrides", js.undefined)
    @scala.inline
    def setMemory(value: String): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setTaskRoleArn(value: String): Self = this.set("taskRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRoleArn: Self = this.set("taskRoleArn", js.undefined)
  }
  
}

