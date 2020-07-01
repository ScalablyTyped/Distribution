package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSegmentDetectionResponse extends js.Object {
  /**
    * Unique identifier for the segment detection job. The JobId is returned from StartSegmentDetection. 
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}

object StartSegmentDetectionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSegmentDetectionResponse]
  }
}

