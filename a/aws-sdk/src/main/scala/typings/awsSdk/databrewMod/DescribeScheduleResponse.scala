package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduleResponse extends js.Object {
  
  /**
    * The date and time that the schedule was created.
    */
  var CreateDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (user name) of the user who created the schedule. 
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * The date or dates and time or times, in cron format, when the jobs are to be run for the schedule.
    */
  var CronExpression: js.UndefOr[typings.awsSdk.databrewMod.CronExpression] = js.native
  
  /**
    * The name or names of one or more jobs to be run by using the schedule.
    */
  var JobNames: js.UndefOr[JobNameList] = js.native
  
  /**
    * The identifier (user name) of the user who last modified the schedule.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The date and time that the schedule was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * The name of the schedule.
    */
  var Name: ScheduleName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schedule.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * Metadata tags associated with this schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object DescribeScheduleResponse {
  
  @scala.inline
  def apply(Name: ScheduleName): DescribeScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduleResponse]
  }
  
  @scala.inline
  implicit class DescribeScheduleResponseOps[Self <: DescribeScheduleResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: ScheduleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setCronExpression(value: CronExpression): Self = this.set("CronExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCronExpression: Self = this.set("CronExpression", js.undefined)
    
    @scala.inline
    def setJobNamesVarargs(value: JobName*): Self = this.set("JobNames", js.Array(value :_*))
    
    @scala.inline
    def setJobNames(value: JobNameList): Self = this.set("JobNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobNames: Self = this.set("JobNames", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
