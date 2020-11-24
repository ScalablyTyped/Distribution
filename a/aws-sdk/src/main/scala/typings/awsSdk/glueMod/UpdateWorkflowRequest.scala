package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkflowRequest extends js.Object {
  
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  
  /**
    * The description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  
  /**
    * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  var MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.native
  
  /**
    * Name of the workflow to be updated.
    */
  var Name: NameString = js.native
}
object UpdateWorkflowRequest {
  
  @scala.inline
  def apply(Name: NameString): UpdateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowRequest]
  }
  
  @scala.inline
  implicit class UpdateWorkflowRequestOps[Self <: UpdateWorkflowRequest] (val x: Self) extends AnyVal {
    
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
    def setDefaultRunProperties(value: WorkflowRunProperties): Self = this.set("DefaultRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRunProperties: Self = this.set("DefaultRunProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: GenericString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRuns(value: NullableInteger): Self = this.set("MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentRuns: Self = this.set("MaxConcurrentRuns", js.undefined)
  }
}
