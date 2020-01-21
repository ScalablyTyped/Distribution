package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLabelingJobsForWorkteamResponse extends js.Object {
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListLabelingJobsForWorkteamResponse {
  @scala.inline
  def apply(LabelingJobSummaryList: LabelingJobForWorkteamSummaryList, NextToken: NextToken = null): ListLabelingJobsForWorkteamResponse = {
    val __obj = js.Dynamic.literal(LabelingJobSummaryList = LabelingJobSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamResponse]
  }
}

