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
  def apply(JobId: JobId, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: PaginationToken = null): GetSegmentDetectionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentDetectionRequest]
  }
}

