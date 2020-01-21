package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunsRequest extends js.Object {
  /**
    * The name of the job definition for which to retrieve all job runs.
    */
  var JobName: NameString = js.native
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetJobRunsRequest {
  @scala.inline
  def apply(JobName: NameString, MaxResults: Int | Double = null, NextToken: GenericString = null): GetJobRunsRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunsRequest]
  }
}

