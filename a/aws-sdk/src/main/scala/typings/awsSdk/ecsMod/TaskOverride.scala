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
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
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
  def apply(
    containerOverrides: ContainerOverrides = null,
    cpu: String = null,
    executionRoleArn: String = null,
    inferenceAcceleratorOverrides: InferenceAcceleratorOverrides = null,
    memory: String = null,
    taskRoleArn: String = null
  ): TaskOverride = {
    val __obj = js.Dynamic.literal()
    if (containerOverrides != null) __obj.updateDynamic("containerOverrides")(containerOverrides.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn.asInstanceOf[js.Any])
    if (inferenceAcceleratorOverrides != null) __obj.updateDynamic("inferenceAcceleratorOverrides")(inferenceAcceleratorOverrides.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (taskRoleArn != null) __obj.updateDynamic("taskRoleArn")(taskRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOverride]
  }
}

