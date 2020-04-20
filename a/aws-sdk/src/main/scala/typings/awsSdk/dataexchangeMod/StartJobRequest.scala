package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRequest extends js.Object {
  /**
    * The unique identifier for a job.
    */
  var JobId: string = js.native
}

object StartJobRequest {
  @scala.inline
  def apply(JobId: string): StartJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRequest]
  }
}

