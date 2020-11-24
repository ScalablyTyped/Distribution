package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeWorkflowRunRequest extends js.Object {
  
  /**
    * The name of the workflow to resume.
    */
  var Name: NameString = js.native
  
  /**
    * A list of the node IDs for the nodes you want to restart. The nodes that are to be restarted must have a run attempt in the original run.
    */
  var NodeIds: NodeIdList = js.native
  
  /**
    * The ID of the workflow run to resume.
    */
  var RunId: IdString = js.native
}
object ResumeWorkflowRunRequest {
  
  @scala.inline
  def apply(Name: NameString, NodeIds: NodeIdList, RunId: IdString): ResumeWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NodeIds = NodeIds.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeWorkflowRunRequest]
  }
  
  @scala.inline
  implicit class ResumeWorkflowRunRequestOps[Self <: ResumeWorkflowRunRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeIdsVarargs(value: NameString*): Self = this.set("NodeIds", js.Array(value :_*))
    
    @scala.inline
    def setNodeIds(value: NodeIdList): Self = this.set("NodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
  }
}
