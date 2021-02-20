package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
  /**
    * The ID of the AWS account that owns the schedule.
    */
  var AccountId: js.UndefOr[typings.awsSdk.databrewMod.AccountId] = js.native
  
  /**
    * The date and time that the schedule was created.
    */
  var CreateDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (the user name) of the user who created the schedule.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * The date(s) and time(s), in cron format, when the job will run.
    */
  var CronExpression: js.UndefOr[typings.awsSdk.databrewMod.CronExpression] = js.native
  
  /**
    * A list of jobs to be run, according to the schedule.
    */
  var JobNames: js.UndefOr[JobNameList] = js.native
  
  /**
    * The identifier (the user name) of the user who last modified the schedule.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The date and time when the schedule was last modified.
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
    * Metadata tags that have been applied to the schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(Name: ScheduleName): Schedule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
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
