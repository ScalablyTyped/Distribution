package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotEventsAction extends js.Object {
  
  /**
    * Whether to process the event actions as a batch. The default value is false. When batchMode is true, you can't specify a messageId.  When batchMode is true and the rule SQL statement evaluates to an Array, each Array element is treated as a separate message when it's sent to AWS IoT Events by calling  BatchPutMessage . The resulting array can't have more than 10 messages.
    */
  var batchMode: js.UndefOr[BatchMode] = js.native
  
  /**
    * The name of the AWS IoT Events input.
    */
  var inputName: InputName = js.native
  
  /**
    * The ID of the message. The default messageId is a new UUID value. When batchMode is true, you can't specify a messageId--a new UUID value will be assigned. Assign a value to this property to ensure that only one input (message) with a given messageId will be processed by an AWS IoT Events detector.
    */
  var messageId: js.UndefOr[MessageId] = js.native
  
  /**
    * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector. ("Action":"iotevents:BatchPutMessage").
    */
  var roleArn: AwsArn = js.native
}
object IotEventsAction {
  
  @scala.inline
  def apply(inputName: InputName, roleArn: AwsArn): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsAction]
  }
  
  @scala.inline
  implicit class IotEventsActionOps[Self <: IotEventsAction] (val x: Self) extends AnyVal {
    
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
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchMode(value: BatchMode): Self = this.set("batchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchMode: Self = this.set("batchMode", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
}
