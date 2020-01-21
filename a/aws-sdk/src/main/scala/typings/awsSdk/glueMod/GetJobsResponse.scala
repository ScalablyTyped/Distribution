package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobsResponse extends js.Object {
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.native
  /**
    * A continuation token, if not all job definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetJobsResponse {
  @scala.inline
  def apply(Jobs: JobList = null, NextToken: GenericString = null): GetJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobsResponse]
  }
}

