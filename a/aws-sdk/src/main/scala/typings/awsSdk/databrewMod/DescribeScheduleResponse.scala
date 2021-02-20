package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduleResponse extends StObject {
  
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
  implicit class DescribeScheduleResponseMutableBuilder[Self <: DescribeScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    @scala.inline
    def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNamesUndefined: Self = StObject.set(x, "JobNames", js.undefined)
    
    @scala.inline
    def setJobNamesVarargs(value: JobName*): Self = StObject.set(x, "JobNames", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
