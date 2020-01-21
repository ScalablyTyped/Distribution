package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLabelDetectionResponse extends js.Object {
  /**
    * The identifier for the label detection job. Use JobId to identify the job in a subsequent call to GetLabelDetection. 
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}

object StartLabelDetectionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartLabelDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLabelDetectionResponse]
  }
}

