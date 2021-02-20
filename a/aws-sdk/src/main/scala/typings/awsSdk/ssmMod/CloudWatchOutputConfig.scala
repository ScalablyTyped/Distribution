package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchOutputConfig extends StObject {
  
  /**
    * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
    */
  var CloudWatchLogGroupName: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchLogGroupName] = js.native
  
  /**
    * Enables Systems Manager to send command output to CloudWatch Logs.
    */
  var CloudWatchOutputEnabled: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputEnabled] = js.native
}
object CloudWatchOutputConfig {
  
  @scala.inline
  def apply(): CloudWatchOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchOutputConfig]
  }
  
  @scala.inline
  implicit class CloudWatchOutputConfigMutableBuilder[Self <: CloudWatchOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogGroupName(value: CloudWatchLogGroupName): Self = StObject.set(x, "CloudWatchLogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogGroupNameUndefined: Self = StObject.set(x, "CloudWatchLogGroupName", js.undefined)
    
    @scala.inline
    def setCloudWatchOutputEnabled(value: CloudWatchOutputEnabled): Self = StObject.set(x, "CloudWatchOutputEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchOutputEnabledUndefined: Self = StObject.set(x, "CloudWatchOutputEnabled", js.undefined)
  }
}
