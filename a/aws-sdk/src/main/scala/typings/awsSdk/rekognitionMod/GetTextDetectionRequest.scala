package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextDetectionRequest extends js.Object {
  /**
    * Job identifier for the label detection operation for which you want results returned. You get the job identifer from an initial call to StartTextDetection.
    */
  var JobId: typings.awsSdk.rekognitionMod.JobId = js.native
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.rekognitionMod.MaxResults] = js.native
  /**
    * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object GetTextDetectionRequest {
  @scala.inline
  def apply(JobId: JobId, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: PaginationToken = null): GetTextDetectionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextDetectionRequest]
  }
}

