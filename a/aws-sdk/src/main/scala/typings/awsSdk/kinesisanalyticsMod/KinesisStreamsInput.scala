package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsInput extends js.Object {
  /**
    * ARN of the input Amazon Kinesis stream to read.
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsMod.ResourceARN = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: typings.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}

object KinesisStreamsInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInput]
  }
}

