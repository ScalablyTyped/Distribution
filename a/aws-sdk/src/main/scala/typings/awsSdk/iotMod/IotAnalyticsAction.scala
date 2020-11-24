package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotAnalyticsAction extends js.Object {
  
  /**
    * Whether to process the action as a batch. The default value is false. When batchMode is true and the rule SQL statement evaluates to an Array, each Array element is delivered as a separate message when passed by  BatchPutMessage  to the AWS IoT Analytics channel. The resulting array can't have more than 100 messages.
    */
  var batchMode: js.UndefOr[BatchMode] = js.native
  
  /**
    * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
    */
  var channelArn: js.UndefOr[AwsArn] = js.native
  
  /**
    * The name of the IoT Analytics channel to which message data will be sent.
    */
  var channelName: js.UndefOr[ChannelName] = js.native
  
  /**
    * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT Analytics (iotanalytics:BatchPutMessage).
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}
object IotAnalyticsAction {
  
  @scala.inline
  def apply(): IotAnalyticsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotAnalyticsAction]
  }
  
  @scala.inline
  implicit class IotAnalyticsActionOps[Self <: IotAnalyticsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchMode(value: BatchMode): Self = this.set("batchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchMode: Self = this.set("batchMode", js.undefined)
    
    @scala.inline
    def setChannelArn(value: AwsArn): Self = this.set("channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("channelArn", js.undefined)
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
