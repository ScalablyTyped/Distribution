package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledQueryDescription extends StObject {
  
  /**
    * Scheduled query ARN.
    */
  var Arn: AmazonResourceName
  
  /**
    * Creation time of the scheduled query.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Error-reporting configuration for the scheduled query.
    */
  var ErrorReportConfiguration: js.UndefOr[typings.awsSdk.timestreamqueryMod.ErrorReportConfiguration] = js.undefined
  
  /**
    * A customer provided KMS key used to encrypt the scheduled query resource.
    */
  var KmsKeyId: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    * Runtime summary for the last scheduled query run. 
    */
  var LastRunSummary: js.UndefOr[ScheduledQueryRunSummary] = js.undefined
  
  /**
    * Name of the scheduled query.
    */
  var Name: ScheduledQueryName
  
  /**
    * The next time the scheduled query is scheduled to run.
    */
  var NextInvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Notification configuration.
    */
  var NotificationConfiguration: typings.awsSdk.timestreamqueryMod.NotificationConfiguration
  
  /**
    * Last time the query was run.
    */
  var PreviousInvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The query to be run.
    */
  var QueryString: typings.awsSdk.timestreamqueryMod.QueryString
  
  /**
    * Runtime summary for the last five failed scheduled query runs.
    */
  var RecentlyFailedRuns: js.UndefOr[ScheduledQueryRunSummaryList] = js.undefined
  
  /**
    * Schedule configuration.
    */
  var ScheduleConfiguration: typings.awsSdk.timestreamqueryMod.ScheduleConfiguration
  
  /**
    * IAM role that Timestream uses to run the schedule query.
    */
  var ScheduledQueryExecutionRoleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * State of the scheduled query. 
    */
  var State: ScheduledQueryState
  
  /**
    * Scheduled query target store configuration.
    */
  var TargetConfiguration: js.UndefOr[typings.awsSdk.timestreamqueryMod.TargetConfiguration] = js.undefined
}
object ScheduledQueryDescription {
  
  inline def apply(
    Arn: AmazonResourceName,
    Name: ScheduledQueryName,
    NotificationConfiguration: NotificationConfiguration,
    QueryString: QueryString,
    ScheduleConfiguration: ScheduleConfiguration,
    State: ScheduledQueryState
  ): ScheduledQueryDescription = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], ScheduleConfiguration = ScheduleConfiguration.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledQueryDescription]
  }
  
  extension [Self <: ScheduledQueryDescription](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setErrorReportConfiguration(value: ErrorReportConfiguration): Self = StObject.set(x, "ErrorReportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setErrorReportConfigurationUndefined: Self = StObject.set(x, "ErrorReportConfiguration", js.undefined)
    
    inline def setKmsKeyId(value: StringValue2048): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastRunSummary(value: ScheduledQueryRunSummary): Self = StObject.set(x, "LastRunSummary", value.asInstanceOf[js.Any])
    
    inline def setLastRunSummaryUndefined: Self = StObject.set(x, "LastRunSummary", js.undefined)
    
    inline def setName(value: ScheduledQueryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextInvocationTime(value: js.Date): Self = StObject.set(x, "NextInvocationTime", value.asInstanceOf[js.Any])
    
    inline def setNextInvocationTimeUndefined: Self = StObject.set(x, "NextInvocationTime", js.undefined)
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPreviousInvocationTime(value: js.Date): Self = StObject.set(x, "PreviousInvocationTime", value.asInstanceOf[js.Any])
    
    inline def setPreviousInvocationTimeUndefined: Self = StObject.set(x, "PreviousInvocationTime", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setRecentlyFailedRuns(value: ScheduledQueryRunSummaryList): Self = StObject.set(x, "RecentlyFailedRuns", value.asInstanceOf[js.Any])
    
    inline def setRecentlyFailedRunsUndefined: Self = StObject.set(x, "RecentlyFailedRuns", js.undefined)
    
    inline def setRecentlyFailedRunsVarargs(value: ScheduledQueryRunSummary*): Self = StObject.set(x, "RecentlyFailedRuns", js.Array(value*))
    
    inline def setScheduleConfiguration(value: ScheduleConfiguration): Self = StObject.set(x, "ScheduleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setScheduledQueryExecutionRoleArn(value: AmazonResourceName): Self = StObject.set(x, "ScheduledQueryExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setScheduledQueryExecutionRoleArnUndefined: Self = StObject.set(x, "ScheduledQueryExecutionRoleArn", js.undefined)
    
    inline def setState(value: ScheduledQueryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTargetConfiguration(value: TargetConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
  }
}
