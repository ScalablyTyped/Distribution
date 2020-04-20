package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobRequest extends js.Object {
  /**
    * The identifier of the job that you want to cancel. To get a list of the jobs (including their jobId) that have a status of Submitted, use the ListJobsByStatus API action.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
}

object CancelJobRequest {
  @scala.inline
  def apply(Id: Id): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
}

