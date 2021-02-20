package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotEventsAction extends StObject {
  
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
  implicit class IotEventsActionMutableBuilder[Self <: IotEventsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchMode(value: BatchMode): Self = StObject.set(x, "batchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchModeUndefined: Self = StObject.set(x, "batchMode", js.undefined)
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
