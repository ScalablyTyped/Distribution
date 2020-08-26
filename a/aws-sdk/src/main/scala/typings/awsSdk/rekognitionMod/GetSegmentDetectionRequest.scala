package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentDetectionRequest extends js.Object {
  /**
    * Job identifier for the text detection operation for which you want results returned. You get the job identifer from an initial call to StartSegmentDetection.
    */
  var JobId: typings.awsSdk.rekognitionMod.JobId = js.native
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.rekognitionMod.MaxResults] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object GetSegmentDetectionRequest {
  @scala.inline
  def apply(JobId: JobId): GetSegmentDetectionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentDetectionRequest]
  }
  @scala.inline
  implicit class GetSegmentDetectionRequestOps[Self <: GetSegmentDetectionRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

