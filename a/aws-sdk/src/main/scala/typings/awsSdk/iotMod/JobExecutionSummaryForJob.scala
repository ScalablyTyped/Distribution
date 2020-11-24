package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionSummaryForJob extends js.Object {
  
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.native
  
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
}
object JobExecutionSummaryForJob {
  
  @scala.inline
  def apply(): JobExecutionSummaryForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummaryForJob]
  }
  
  @scala.inline
  implicit class JobExecutionSummaryForJobOps[Self <: JobExecutionSummaryForJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobExecutionSummary(value: JobExecutionSummary): Self = this.set("jobExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobExecutionSummary: Self = this.set("jobExecutionSummary", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
  }
}
