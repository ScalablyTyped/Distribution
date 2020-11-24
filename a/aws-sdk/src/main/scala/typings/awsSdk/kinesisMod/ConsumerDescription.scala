package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerDescription extends js.Object {
  
  /**
    * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
    */
  var ConsumerARN: typings.awsSdk.kinesisMod.ConsumerARN = js.native
  
  /**
    * 
    */
  var ConsumerCreationTimestamp: Timestamp = js.native
  
  /**
    * The name of the consumer is something you choose when you register the consumer.
    */
  var ConsumerName: typings.awsSdk.kinesisMod.ConsumerName = js.native
  
  /**
    * A consumer can't read data while in the CREATING or DELETING states.
    */
  var ConsumerStatus: typings.awsSdk.kinesisMod.ConsumerStatus = js.native
  
  /**
    * The ARN of the stream with which you registered the consumer.
    */
  var StreamARN: typings.awsSdk.kinesisMod.StreamARN = js.native
}
object ConsumerDescription {
  
  @scala.inline
  def apply(
    ConsumerARN: ConsumerARN,
    ConsumerCreationTimestamp: Timestamp,
    ConsumerName: ConsumerName,
    ConsumerStatus: ConsumerStatus,
    StreamARN: StreamARN
  ): ConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerDescription]
  }
  
  @scala.inline
  implicit class ConsumerDescriptionOps[Self <: ConsumerDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsumerARN(value: ConsumerARN): Self = this.set("ConsumerARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerCreationTimestamp(value: Timestamp): Self = this.set("ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerName(value: ConsumerName): Self = this.set("ConsumerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerStatus(value: ConsumerStatus): Self = this.set("ConsumerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARN(value: StreamARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
  }
}
