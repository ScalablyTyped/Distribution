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
}

