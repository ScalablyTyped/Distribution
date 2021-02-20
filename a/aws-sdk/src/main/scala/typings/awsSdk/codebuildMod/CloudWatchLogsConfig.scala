package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogsConfig extends StObject {
  
  /**
    *  The group name of the logs in Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * The current status of the logs in Amazon CloudWatch Logs for a build project. Valid values are:    ENABLED: Amazon CloudWatch Logs are enabled for this build project.    DISABLED: Amazon CloudWatch Logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType = js.native
  
  /**
    *  The prefix of the stream name of the Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var streamName: js.UndefOr[String] = js.native
}
object CloudWatchLogsConfig {
  
  @scala.inline
  def apply(status: LogsConfigStatusType): CloudWatchLogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsConfig]
  }
  
  @scala.inline
  implicit class CloudWatchLogsConfigMutableBuilder[Self <: CloudWatchLogsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setStatus(value: LogsConfigStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
