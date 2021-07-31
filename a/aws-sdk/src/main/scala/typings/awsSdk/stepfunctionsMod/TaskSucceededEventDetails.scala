package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskSucceededEventDetails extends StObject {
  
  /**
    * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related task. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.undefined
  
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
}
object TaskSucceededEventDetails {
  
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskSucceededEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSucceededEventDetails]
  }
  
  @scala.inline
  implicit class TaskSucceededEventDetailsMutableBuilder[Self <: TaskSucceededEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setResource(value: Name): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: Name): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
