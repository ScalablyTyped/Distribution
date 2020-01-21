package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseInputDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
  /**
    * The ARN of the IAM role that Kinesis Data Analytics assumes to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.native
}

object KinesisFirehoseInputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN = null): KinesisFirehoseInputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseInputDescription]
  }
}

