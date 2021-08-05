package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  /**
    * The ID of the AWS account that owns the schedule.
    */
  var AccountId: js.UndefOr[typings.awsSdk.databrewMod.AccountId] = js.undefined
  
  /**
    * The date and time that the schedule was created.
    */
  var CreateDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (the user name) of the user who created the schedule.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The date(s) and time(s), in cron format, when the job will run.
    */
  var CronExpression: js.UndefOr[typings.awsSdk.databrewMod.CronExpression] = js.undefined
  
  /**
    * A list of jobs to be run, according to the schedule.
    */
  var JobNames: js.UndefOr[JobNameList] = js.undefined
  
  /**
    * The identifier (the user name) of the user who last modified the schedule.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The date and time when the schedule was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the schedule.
    */
  var Name: ScheduleName
  
  /**
    * The Amazon Resource Name (ARN) of the schedule.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Metadata tags that have been applied to the schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Schedule {
  
  inline def apply(Name: ScheduleName): Schedule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    inline def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    inline def setJobNamesUndefined: Self = StObject.set(x, "JobNames", js.undefined)
    
    inline def setJobNamesVarargs(value: JobName*): Self = StObject.set(x, "JobNames", js.Array(value :_*))
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
