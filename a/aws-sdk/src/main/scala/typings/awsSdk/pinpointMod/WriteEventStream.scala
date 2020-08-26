package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteEventStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream that you want to publish event data to. For a Kinesis data stream, the ARN format is: arn:aws:kinesis:region:account-id:stream/stream_name
    For a Kinesis Data Firehose delivery stream, the ARN format is: arn:aws:firehose:region:account-id:deliverystream/stream_name
    
    */
  var DestinationStreamArn: string = js.native
  /**
    * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the stream in your AWS account.
    */
  var RoleArn: string = js.native
}

object WriteEventStream {
  @scala.inline
  def apply(DestinationStreamArn: string, RoleArn: string): WriteEventStream = {
    val __obj = js.Dynamic.literal(DestinationStreamArn = DestinationStreamArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteEventStream]
  }
  @scala.inline
  implicit class WriteEventStreamOps[Self <: WriteEventStream] (val x: Self) extends AnyVal {
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
    def setDestinationStreamArn(value: string): Self = this.set("DestinationStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
  }
  
}

