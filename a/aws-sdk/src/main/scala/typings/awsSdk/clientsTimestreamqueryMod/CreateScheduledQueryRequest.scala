package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduledQueryRequest extends StObject {
  
  /**
    * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making the same request repeatedly will produce the same result. Making multiple identical CreateScheduledQuery requests has the same effect as making a single request.     If CreateScheduledQuery is called without a ClientToken, the Query SDK generates a ClientToken on your behalf.    After 8 hours, any request with the same ClientToken is treated as a new request.   
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.ClientToken] = js.undefined
  
  /**
    * Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the query results. 
    */
  var ErrorReportConfiguration: typings.awsSdk.clientsTimestreamqueryMod.ErrorReportConfiguration
  
  /**
    * The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with alias/  If ErrorReportConfiguration uses SSE_KMS as encryption type, the same KmsKeyId is used to encrypt the error report at rest.
    */
  var KmsKeyId: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    * Name of the scheduled query.
    */
  var Name: ScheduledQueryName
  
  /**
    * Notification configuration for the scheduled query. A notification is sent by Timestream when a query run finishes, when the state is updated or when you delete it. 
    */
  var NotificationConfiguration: typings.awsSdk.clientsTimestreamqueryMod.NotificationConfiguration
  
  /**
    * The query string to run. Parameter names can be specified in the query string @ character followed by an identifier. The named Parameter @scheduled_runtime is reserved and can be used in the query to get the time at which the query is scheduled to run. The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of @scheduled_runtime paramater for each query run. For example, consider an instance of a scheduled query executing on 2021-12-01 00:00:00. For this instance, the @scheduled_runtime parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
    */
  var QueryString: typings.awsSdk.clientsTimestreamqueryMod.QueryString
  
  /**
    * The schedule configuration for the query.
    */
  var ScheduleConfiguration: typings.awsSdk.clientsTimestreamqueryMod.ScheduleConfiguration
  
  /**
    * The ARN for the IAM role that Timestream will assume when running the scheduled query. 
    */
  var ScheduledQueryExecutionRoleArn: AmazonResourceName
  
  /**
    * A list of key-value pairs to label the scheduled query.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Configuration used for writing the result of a query.
    */
  var TargetConfiguration: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.TargetConfiguration] = js.undefined
}
object CreateScheduledQueryRequest {
  
  inline def apply(
    ErrorReportConfiguration: ErrorReportConfiguration,
    Name: ScheduledQueryName,
    NotificationConfiguration: NotificationConfiguration,
    QueryString: QueryString,
    ScheduleConfiguration: ScheduleConfiguration,
    ScheduledQueryExecutionRoleArn: AmazonResourceName
  ): CreateScheduledQueryRequest = {
    val __obj = js.Dynamic.literal(ErrorReportConfiguration = ErrorReportConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], ScheduleConfiguration = ScheduleConfiguration.asInstanceOf[js.Any], ScheduledQueryExecutionRoleArn = ScheduledQueryExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScheduledQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setErrorReportConfiguration(value: ErrorReportConfiguration): Self = StObject.set(x, "ErrorReportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: StringValue2048): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: ScheduledQueryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfiguration(value: ScheduleConfiguration): Self = StObject.set(x, "ScheduleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setScheduledQueryExecutionRoleArn(value: AmazonResourceName): Self = StObject.set(x, "ScheduledQueryExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetConfiguration(value: TargetConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
  }
}
