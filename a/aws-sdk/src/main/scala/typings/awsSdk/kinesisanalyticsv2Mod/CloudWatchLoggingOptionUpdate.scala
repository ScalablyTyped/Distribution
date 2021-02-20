package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLoggingOptionUpdate extends StObject {
  
  /**
    * The ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.native
}
object CloudWatchLoggingOptionUpdate {
  
  @scala.inline
  def apply(CloudWatchLoggingOptionId: Id): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
  
  @scala.inline
  implicit class CloudWatchLoggingOptionUpdateMutableBuilder[Self <: CloudWatchLoggingOptionUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamARNUpdate(value: LogStreamARN): Self = StObject.set(x, "LogStreamARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamARNUpdateUndefined: Self = StObject.set(x, "LogStreamARNUpdate", js.undefined)
  }
}
