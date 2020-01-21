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
  def apply(roleArn: AwsArn, streamName: StreamName, partitionKey: PartitionKey = null): KinesisAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisAction]
  }
}

