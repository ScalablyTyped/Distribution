package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningJobsResponse extends js.Object {
  /**
    * A list of your signing jobs.
    */
  var jobs: js.UndefOr[SigningJobs] = js.native
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListSigningJobsResponse {
  @scala.inline
  def apply(jobs: SigningJobs = null, nextToken: NextToken = null): ListSigningJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSigningJobsResponse]
  }
}

