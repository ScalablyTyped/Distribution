package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetStatusInput extends js.Object {
  /**
    * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both types.
    */
  var objectIds: idList = js.native
  /**
    * The ID of the pipeline that contains the objects.
    */
  var pipelineId: id = js.native
  /**
    * The status to be set on all the objects specified in objectIds. For components, use PAUSE or RESUME. For instances, use TRY_CANCEL, RERUN, or MARK_FINISHED.
    */
  var status: String = js.native
}

object SetStatusInput {
  @scala.inline
  def apply(objectIds: idList, pipelineId: id, status: String): SetStatusInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStatusInput]
  }
  @scala.inline
  implicit class SetStatusInputOps[Self <: SetStatusInput] (val x: Self) extends AnyVal {
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
    def setObjectIdsVarargs(value: id*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: idList): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

