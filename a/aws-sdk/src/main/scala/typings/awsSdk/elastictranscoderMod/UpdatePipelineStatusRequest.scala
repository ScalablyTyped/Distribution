package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineStatusRequest extends js.Object {
  /**
    * The identifier of the pipeline to update.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
  /**
    * The desired status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: PipelineStatus = js.native
}

object UpdatePipelineStatusRequest {
  @scala.inline
  def apply(Id: Id, Status: PipelineStatus): UpdatePipelineStatusRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePipelineStatusRequest]
  }
}

