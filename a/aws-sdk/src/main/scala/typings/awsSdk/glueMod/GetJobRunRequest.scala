package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunRequest extends js.Object {
  /**
    * Name of the job definition being run.
    */
  var JobName: NameString = js.native
  /**
    * True if a list of predecessor runs should be returned.
    */
  var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.native
  /**
    * The ID of the job run.
    */
  var RunId: IdString = js.native
}

object GetJobRunRequest {
  @scala.inline
  def apply(
    JobName: NameString,
    RunId: IdString,
    PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
  ): GetJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    if (!js.isUndefined(PredecessorsIncluded)) __obj.updateDynamic("PredecessorsIncluded")(PredecessorsIncluded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunRequest]
  }
}

