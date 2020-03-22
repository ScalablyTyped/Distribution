package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextDetectionResponse extends js.Object {
  /**
    * Identifier for the text detection job. Use JobId to identify the job in a subsequent call to GetTextDetection.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}

object StartTextDetectionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextDetectionResponse]
  }
}

