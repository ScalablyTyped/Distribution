package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetJobBookmarkRequest extends js.Object {
  /**
    * The name of the job in question.
    */
  var JobName: typings.awsSdk.glueMod.JobName = js.native
  /**
    * The unique run identifier associated with this job run.
    */
  var RunId: js.UndefOr[typings.awsSdk.glueMod.RunId] = js.native
}

object ResetJobBookmarkRequest {
  @scala.inline
  def apply(JobName: JobName, RunId: RunId = null): ResetJobBookmarkRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    if (RunId != null) __obj.updateDynamic("RunId")(RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetJobBookmarkRequest]
  }
}

