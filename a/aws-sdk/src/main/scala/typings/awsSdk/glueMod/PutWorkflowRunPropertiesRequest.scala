package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutWorkflowRunPropertiesRequest extends StObject {
  
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString = js.native
  
  /**
    * The ID of the workflow run for which the run properties should be updated.
    */
  var RunId: IdString = js.native
  
  /**
    * The properties to put for the specified run.
    */
  var RunProperties: WorkflowRunProperties = js.native
}
object PutWorkflowRunPropertiesRequest {
  
  @scala.inline
  def apply(Name: NameString, RunId: IdString, RunProperties: WorkflowRunProperties): PutWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any], RunProperties = RunProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutWorkflowRunPropertiesRequest]
  }
  
  @scala.inline
  implicit class PutWorkflowRunPropertiesRequestMutableBuilder[Self <: PutWorkflowRunPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "RunProperties", value.asInstanceOf[js.Any])
  }
}
