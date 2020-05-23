package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The List Jobs request returns jobs that match the statuses listed in this element.
    */
  var JobStatuses: js.UndefOr[JobStatusList] = js.native
  /**
    * The maximum number of jobs that Amazon S3 will include in the List Jobs response. If there are more jobs than this number, the response will include a pagination token in the NextToken field to enable you to retrieve the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.s3controlMod.MaxResults] = js.native
  /**
    * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the NextToken element of the ListJobsResult from the previous List Jobs request.
    */
  var NextToken: js.UndefOr[StringForNextToken] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    JobStatuses: JobStatusList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: StringForNextToken = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    if (JobStatuses != null) __obj.updateDynamic("JobStatuses")(JobStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}

