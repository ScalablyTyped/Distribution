package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeSimulationJobResponse extends js.Object {
  /**
    * A list of simulation jobs.
    */
  var jobs: js.UndefOr[SimulationJobs] = js.native
  /**
    * A list of unprocessed simulation job Amazon Resource Names (ARNs).
    */
  var unprocessedJobs: js.UndefOr[Arns] = js.native
}

object BatchDescribeSimulationJobResponse {
  @scala.inline
  def apply(jobs: SimulationJobs = null, unprocessedJobs: Arns = null): BatchDescribeSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (unprocessedJobs != null) __obj.updateDynamic("unprocessedJobs")(unprocessedJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeSimulationJobResponse]
  }
}

