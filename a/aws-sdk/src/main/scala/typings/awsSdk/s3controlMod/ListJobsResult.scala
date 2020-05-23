package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResult extends js.Object {
  /**
    * The list of current jobs and jobs that have ended within the last 30 days.
    */
  var Jobs: js.UndefOr[JobListDescriptorList] = js.native
  /**
    * If the List Jobs request produced more than the maximum number of results, you can pass this value into a subsequent List Jobs request in order to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[StringForNextToken] = js.native
}

object ListJobsResult {
  @scala.inline
  def apply(Jobs: JobListDescriptorList = null, NextToken: StringForNextToken = null): ListJobsResult = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResult]
  }
}

