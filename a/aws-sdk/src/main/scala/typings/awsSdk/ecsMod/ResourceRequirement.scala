package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRequirement extends js.Object {
  /**
    * The type of resource to assign to a container. The supported values are GPU or InferenceAccelerator.
    */
  var `type`: ResourceType = js.native
  /**
    * The value for the specified resource type. If the GPU type is used, the value is the number of physical GPUs the Amazon ECS container agent will reserve for the container. The number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on the container instance the task is launched on. If the InferenceAccelerator type is used, the value should match the deviceName for an InferenceAccelerator specified in a task definition.
    */
  var value: String = js.native
}

object ResourceRequirement {
  @scala.inline
  def apply(`type`: ResourceType, value: String): ResourceRequirement = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirement]
  }
  @scala.inline
  implicit class ResourceRequirementOps[Self <: ResourceRequirement] (val x: Self) extends AnyVal {
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
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

