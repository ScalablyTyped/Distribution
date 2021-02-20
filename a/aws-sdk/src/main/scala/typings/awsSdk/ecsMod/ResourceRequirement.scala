package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRequirement extends StObject {
  
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
  implicit class ResourceRequirementMutableBuilder[Self <: ResourceRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
