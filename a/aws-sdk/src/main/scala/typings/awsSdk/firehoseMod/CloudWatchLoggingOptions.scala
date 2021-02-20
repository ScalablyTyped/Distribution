package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLoggingOptions extends StObject {
  
  /**
    * Enables or disables CloudWatch logging.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.firehoseMod.LogGroupName] = js.native
  
  /**
    * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogStreamName: js.UndefOr[typings.awsSdk.firehoseMod.LogStreamName] = js.native
}
object CloudWatchLoggingOptions {
  
  @scala.inline
  def apply(): CloudWatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLoggingOptions]
  }
  
  @scala.inline
  implicit class CloudWatchLoggingOptionsMutableBuilder[Self <: CloudWatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanObject): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "LogStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "LogStreamName", js.undefined)
  }
}
