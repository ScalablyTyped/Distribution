package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotAnalyticsAction extends StObject {
  
  /**
    * Whether to process the action as a batch. The default value is false. When batchMode is true and the rule SQL statement evaluates to an Array, each Array element is delivered as a separate message when passed by  BatchPutMessage  to the AWS IoT Analytics channel. The resulting array can't have more than 100 messages.
    */
  var batchMode: js.UndefOr[BatchMode] = js.undefined
  
  /**
    * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
    */
  var channelArn: js.UndefOr[AwsArn] = js.undefined
  
  /**
    * The name of the IoT Analytics channel to which message data will be sent.
    */
  var channelName: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT Analytics (iotanalytics:BatchPutMessage).
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}
object IotAnalyticsAction {
  
  @scala.inline
  def apply(): IotAnalyticsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotAnalyticsAction]
  }
  
  @scala.inline
  implicit class IotAnalyticsActionMutableBuilder[Self <: IotAnalyticsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchMode(value: BatchMode): Self = StObject.set(x, "batchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchModeUndefined: Self = StObject.set(x, "batchMode", js.undefined)
    
    @scala.inline
    def setChannelArn(value: AwsArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
