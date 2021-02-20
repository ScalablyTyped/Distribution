package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLoggingOption extends StObject {
  
  /**
    * The ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.kinesisanalyticsv2Mod.LogStreamARN = js.native
}
object CloudWatchLoggingOption {
  
  @scala.inline
  def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
  
  @scala.inline
  implicit class CloudWatchLoggingOptionMutableBuilder[Self <: CloudWatchLoggingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
  }
}
