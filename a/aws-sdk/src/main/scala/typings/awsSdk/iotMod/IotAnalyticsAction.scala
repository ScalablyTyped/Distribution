package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotAnalyticsAction extends StObject {
  
  /**
    * Whether to process the action as a batch. The default value is false. When batchMode is true and the rule SQL statement evaluates to an Array, each Array element is delivered as a separate message when passed by  BatchPutMessage  to the IoT Analytics channel. The resulting array can't have more than 100 messages.
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
  
  inline def apply(): IotAnalyticsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotAnalyticsAction]
  }
  
  extension [Self <: IotAnalyticsAction](x: Self) {
    
    inline def setBatchMode(value: BatchMode): Self = StObject.set(x, "batchMode", value.asInstanceOf[js.Any])
    
    inline def setBatchModeUndefined: Self = StObject.set(x, "batchMode", js.undefined)
    
    inline def setChannelArn(value: AwsArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
