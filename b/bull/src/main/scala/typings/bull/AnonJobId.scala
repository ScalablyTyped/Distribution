package typings.bull

import typings.bull.mod.JobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJobId extends js.Object {
  var jobId: js.UndefOr[JobId] = js.undefined
}

object AnonJobId {
  @scala.inline
  def apply(jobId: JobId = null): AnonJobId = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJobId]
  }
}

