package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPublishingOption extends StObject {
  
  var CloudWatchLogsLogGroupArn: js.UndefOr[typings.awsSdk.esMod.CloudWatchLogsLogGroupArn] = js.undefined
  
  /**
    *  Specifies whether given log publishing option is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object LogPublishingOption {
  
  @scala.inline
  def apply(): LogPublishingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOption]
  }
  
  @scala.inline
  implicit class LogPublishingOptionMutableBuilder[Self <: LogPublishingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
