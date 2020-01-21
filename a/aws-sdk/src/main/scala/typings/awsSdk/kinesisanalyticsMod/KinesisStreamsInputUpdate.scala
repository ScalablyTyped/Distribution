package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsInputUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the input Amazon Kinesis stream to read.
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object KinesisStreamsInputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN = null, RoleARNUpdate: RoleARN = null): KinesisStreamsInputUpdate = {
    val __obj = js.Dynamic.literal()
    if (ResourceARNUpdate != null) __obj.updateDynamic("ResourceARNUpdate")(ResourceARNUpdate.asInstanceOf[js.Any])
    if (RoleARNUpdate != null) __obj.updateDynamic("RoleARNUpdate")(RoleARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInputUpdate]
  }
}

