package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScheduleRequest extends js.Object {
  
  /**
    * The date or dates and time or times, in cron format, when the jobs are to be run.
    */
  var CronExpression: typings.awsSdk.databrewMod.CronExpression = js.native
  
  /**
    * The name or names of one or more jobs to be run.
    */
  var JobNames: js.UndefOr[JobNameList] = js.native
  
  /**
    * A unique name for the schedule.
    */
  var Name: ScheduleName = js.native
  
  /**
    * Metadata tags to apply to this schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateScheduleRequest {
  
  @scala.inline
  def apply(CronExpression: CronExpression, Name: ScheduleName): CreateScheduleRequest = {
    val __obj = js.Dynamic.literal(CronExpression = CronExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleRequest]
  }
  
  @scala.inline
  implicit class CreateScheduleRequestOps[Self <: CreateScheduleRequest] (val x: Self) extends AnyVal {
    
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
    def setCronExpression(value: CronExpression): Self = this.set("CronExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ScheduleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNamesVarargs(value: JobName*): Self = this.set("JobNames", js.Array(value :_*))
    
    @scala.inline
    def setJobNames(value: JobNameList): Self = this.set("JobNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobNames: Self = this.set("JobNames", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
