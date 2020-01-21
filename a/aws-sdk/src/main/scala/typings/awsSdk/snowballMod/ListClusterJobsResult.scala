package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClusterJobsResult extends js.Object {
  /**
    * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
    */
  var JobListEntries: js.UndefOr[JobListEntryList] = js.native
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ListClusterJobsResult call, your list of returned jobs will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListClusterJobsResult {
  @scala.inline
  def apply(JobListEntries: JobListEntryList = null, NextToken: String = null): ListClusterJobsResult = {
    val __obj = js.Dynamic.literal()
    if (JobListEntries != null) __obj.updateDynamic("JobListEntries")(JobListEntries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClusterJobsResult]
  }
}

