package typings
package bullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobId extends js.Object {
  var jobId: js.UndefOr[bullLib.bullMod.JobId] = js.undefined
}

object Anon_JobId {
  @scala.inline
  def apply(jobId: bullLib.bullMod.JobId = null): Anon_JobId = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JobId]
  }
}

