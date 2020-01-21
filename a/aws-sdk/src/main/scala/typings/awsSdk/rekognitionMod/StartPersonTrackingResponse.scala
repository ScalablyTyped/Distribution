package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPersonTrackingResponse extends js.Object {
  /**
    * The identifier for the person detection job. Use JobId to identify the job in a subsequent call to GetPersonTracking.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}

object StartPersonTrackingResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPersonTrackingResponse]
  }
}

