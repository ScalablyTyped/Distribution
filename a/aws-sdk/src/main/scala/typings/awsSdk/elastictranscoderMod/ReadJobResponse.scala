package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadJobResponse extends js.Object {
  /**
    * A section of the response body that provides information about the job.
    */
  var Job: js.UndefOr[typings.awsSdk.elastictranscoderMod.Job] = js.native
}

object ReadJobResponse {
  @scala.inline
  def apply(Job: Job = null): ReadJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJobResponse]
  }
}

