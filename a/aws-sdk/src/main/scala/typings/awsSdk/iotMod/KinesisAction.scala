package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisAction extends js.Object {
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[PartitionKey] = js.native
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: AwsArn = js.native
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: StreamName = js.native
}

object KinesisAction {
  @scala.inline
  def apply(roleArn: AwsArn, streamName: StreamName): KinesisAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisAction]
  }
  @scala.inline
  implicit class KinesisActionOps[Self <: KinesisAction] (val x: Self) extends AnyVal {
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
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("streamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionKey(value: PartitionKey): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionKey: Self = this.set("partitionKey", js.undefined)
  }
  
}

