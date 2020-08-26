package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeWorkflowRunResponse extends js.Object {
  /**
    * A list of the node IDs for the nodes that were actually restarted.
    */
  var NodeIds: js.UndefOr[NodeIdList] = js.native
  /**
    * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
    */
  var RunId: js.UndefOr[IdString] = js.native
}

object ResumeWorkflowRunResponse {
  @scala.inline
  def apply(): ResumeWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeWorkflowRunResponse]
  }
  @scala.inline
  implicit class ResumeWorkflowRunResponseOps[Self <: ResumeWorkflowRunResponse] (val x: Self) extends AnyVal {
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
    def setNodeIdsVarargs(value: NameString*): Self = this.set("NodeIds", js.Array(value :_*))
    @scala.inline
    def setNodeIds(value: NodeIdList): Self = this.set("NodeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIds: Self = this.set("NodeIds", js.undefined)
    @scala.inline
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunId: Self = this.set("RunId", js.undefined)
  }
  
}

