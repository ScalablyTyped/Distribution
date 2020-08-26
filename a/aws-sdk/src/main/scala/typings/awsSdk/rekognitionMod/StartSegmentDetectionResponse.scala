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
  def apply(): StartSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSegmentDetectionResponse]
  }
  @scala.inline
  implicit class StartSegmentDetectionResponseOps[Self <: StartSegmentDetectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
  }
  
}

