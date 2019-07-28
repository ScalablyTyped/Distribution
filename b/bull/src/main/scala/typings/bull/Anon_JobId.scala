package typings.bull

import typings.bull.bullMod.JobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobId extends js.Object {
  var jobId: js.UndefOr[JobId] = js.undefined
}

object Anon_JobId {
  @scala.inline
  def apply(jobId: JobId = null): Anon_JobId = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JobId]
  }
}

