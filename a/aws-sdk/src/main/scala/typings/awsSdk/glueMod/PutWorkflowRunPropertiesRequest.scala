package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutWorkflowRunPropertiesRequest extends js.Object {
  
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
  implicit class PutWorkflowRunPropertiesRequestOps[Self <: PutWorkflowRunPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunProperties(value: WorkflowRunProperties): Self = this.set("RunProperties", value.asInstanceOf[js.Any])
  }
}
