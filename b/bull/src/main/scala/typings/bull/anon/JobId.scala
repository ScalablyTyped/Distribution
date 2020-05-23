package typings.bull.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobId extends js.Object {
  var jobId: js.UndefOr[typings.bull.mod.JobId] = js.undefined
}

object JobId {
  @scala.inline
  def apply(jobId: typings.bull.mod.JobId = null): JobId = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobId]
  }
}

