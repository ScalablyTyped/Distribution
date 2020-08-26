package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFaceDetectionRequest extends js.Object {
  /**
    * Unique identifier for the face detection job. The JobId is returned from StartFaceDetection.
    */
  var JobId: typings.awsSdk.rekognitionMod.JobId = js.native
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.rekognitionMod.MaxResults] = js.native
  /**
    * If the previous response was incomplete (because there are more faces to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of faces.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object GetFaceDetectionRequest {
  @scala.inline
  def apply(JobId: JobId): GetFaceDetectionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFaceDetectionRequest]
  }
  @scala.inline
  implicit class GetFaceDetectionRequestOps[Self <: GetFaceDetectionRequest] (val x: Self) extends AnyVal {
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

