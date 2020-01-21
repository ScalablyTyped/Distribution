package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFaceDetectionResponse extends js.Object {
  /**
    * The identifier for the face detection job. Use JobId to identify the job in a subsequent call to GetFaceDetection.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}

object StartFaceDetectionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartFaceDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceDetectionResponse]
  }
}

