package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResponse extends js.Object {
  /**
    * List of jobs
    */
  var Jobs: js.UndefOr[listOfJob] = js.native
  /**
    * Use this string to request the next batch of jobs.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListJobsResponse {
  @scala.inline
  def apply(Jobs: listOfJob = null, NextToken: string = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
}

