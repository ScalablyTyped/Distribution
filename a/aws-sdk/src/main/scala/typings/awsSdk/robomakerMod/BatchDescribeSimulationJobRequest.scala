package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeSimulationJobRequest extends js.Object {
  /**
    * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
    */
  var jobs: Arns = js.native
}

object BatchDescribeSimulationJobRequest {
  @scala.inline
  def apply(jobs: Arns): BatchDescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDescribeSimulationJobRequest]
  }
}

