package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowRunPropertiesResponse extends js.Object {
  
  /**
    * The workflow run properties which were set during the specified run.
    */
  var RunProperties: js.UndefOr[WorkflowRunProperties] = js.native
}
object GetWorkflowRunPropertiesResponse {
  
  @scala.inline
  def apply(): GetWorkflowRunPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunPropertiesResponse]
  }
  
  @scala.inline
  implicit class GetWorkflowRunPropertiesResponseOps[Self <: GetWorkflowRunPropertiesResponse] (val x: Self) extends AnyVal {
    
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
    def setRunProperties(value: WorkflowRunProperties): Self = this.set("RunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunProperties: Self = this.set("RunProperties", js.undefined)
  }
}
