package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): BatchDescribeSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDescribeSimulationJobResponse]
  }
  
  @scala.inline
  implicit class BatchDescribeSimulationJobResponseOps[Self <: BatchDescribeSimulationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobsVarargs(value: SimulationJob*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: SimulationJobs): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setUnprocessedJobsVarargs(value: Arn*): Self = this.set("unprocessedJobs", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedJobs(value: Arns): Self = this.set("unprocessedJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedJobs: Self = this.set("unprocessedJobs", js.undefined)
  }
}
