package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetJobsRequest extends js.Object {
  /**
    * A list of job names, which might be the names returned from the ListJobs operation.
    */
  var JobNames: JobNameList = js.native
}

object BatchGetJobsRequest {
  @scala.inline
  def apply(JobNames: JobNameList): BatchGetJobsRequest = {
    val __obj = js.Dynamic.literal(JobNames = JobNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetJobsRequest]
  }
}

