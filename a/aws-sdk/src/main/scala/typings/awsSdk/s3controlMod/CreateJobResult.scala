package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResult extends js.Object {
  /**
    * The ID for this job. Amazon S3 generates this ID automatically and returns it after a successful Create Job request.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
}

object CreateJobResult {
  @scala.inline
  def apply(JobId: JobId = null): CreateJobResult = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobResult]
  }
}

