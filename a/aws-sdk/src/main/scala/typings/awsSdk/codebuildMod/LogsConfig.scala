package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogsConfig extends StObject {
  
  /**
    *  Information about Amazon CloudWatch Logs for a build project. Amazon CloudWatch Logs are enabled by default. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.native
  
  /**
    *  Information about logs built to an S3 bucket for a build project. S3 logs are not enabled by default. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.native
}
object LogsConfig {
  
  @scala.inline
  def apply(): LogsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsConfig]
  }
  
  @scala.inline
  implicit class LogsConfigMutableBuilder[Self <: LogsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogs(value: CloudWatchLogsConfig): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    @scala.inline
    def setS3Logs(value: S3LogsConfig): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LogsUndefined: Self = StObject.set(x, "s3Logs", js.undefined)
  }
}
