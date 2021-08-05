package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsLocation extends StObject {
  
  /**
    *  Information about Amazon CloudWatch Logs for a build project. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined
  
  /**
    *  The ARN of Amazon CloudWatch Logs for a build project. Its format is arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}. For more information, see Resources Defined by Amazon CloudWatch Logs. 
    */
  var cloudWatchLogsArn: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to an individual build log in Amazon CloudWatch Logs.
    */
  var deepLink: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon CloudWatch Logs group for the build logs.
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    *  The URL to a build log in an S3 bucket. 
    */
  var s3DeepLink: js.UndefOr[String] = js.undefined
  
  /**
    *  Information about S3 logs for a build project. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.undefined
  
  /**
    *  The ARN of S3 logs for a build project. Its format is arn:${Partition}:s3:::${BucketName}/${ObjectName}. For more information, see Resources Defined by Amazon S3. 
    */
  var s3LogsArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon CloudWatch Logs stream for the build logs.
    */
  var streamName: js.UndefOr[String] = js.undefined
}
object LogsLocation {
  
  inline def apply(): LogsLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsLocation]
  }
  
  extension [Self <: LogsLocation](x: Self) {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsConfig): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsArn(value: String): Self = StObject.set(x, "cloudWatchLogsArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsArnUndefined: Self = StObject.set(x, "cloudWatchLogsArn", js.undefined)
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setDeepLink(value: String): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setS3DeepLink(value: String): Self = StObject.set(x, "s3DeepLink", value.asInstanceOf[js.Any])
    
    inline def setS3DeepLinkUndefined: Self = StObject.set(x, "s3DeepLink", js.undefined)
    
    inline def setS3Logs(value: S3LogsConfig): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsArn(value: String): Self = StObject.set(x, "s3LogsArn", value.asInstanceOf[js.Any])
    
    inline def setS3LogsArnUndefined: Self = StObject.set(x, "s3LogsArn", js.undefined)
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "s3Logs", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
