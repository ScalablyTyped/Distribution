package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunRequest extends js.Object {
  /**
    * The name of the job definition for which to stop job runs.
    */
  var JobName: NameString = js.native
  /**
    * A list of the JobRunIds that should be stopped for that job definition.
    */
  var JobRunIds: BatchStopJobRunJobRunIdList = js.native
}

object BatchStopJobRunRequest {
  @scala.inline
  def apply(JobName: NameString, JobRunIds: BatchStopJobRunJobRunIdList): BatchStopJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobRunIds = JobRunIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchStopJobRunRequest]
  }
}

