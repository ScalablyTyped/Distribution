package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskSucceededEventDetails extends js.Object {
  
  /**
    * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related task. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.native
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.native
  
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
}
object TaskSucceededEventDetails {
  
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskSucceededEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSucceededEventDetails]
  }
  
  @scala.inline
  implicit class TaskSucceededEventDetailsOps[Self <: TaskSucceededEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResource(value: Name): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: Name): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: SensitiveData): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = this.set("outputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDetails: Self = this.set("outputDetails", js.undefined)
  }
}
