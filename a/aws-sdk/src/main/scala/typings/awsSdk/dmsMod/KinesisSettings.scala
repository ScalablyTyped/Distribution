package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisSettings extends js.Object {
  /**
    * The output format for the records created on the endpoint. The message format is JSON.
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
    */
  var StreamArn: js.UndefOr[String] = js.native
}

object KinesisSettings {
  @scala.inline
  def apply(
    MessageFormat: MessageFormatValue = null,
    ServiceAccessRoleArn: String = null,
    StreamArn: String = null
  ): KinesisSettings = {
    val __obj = js.Dynamic.literal()
    if (MessageFormat != null) __obj.updateDynamic("MessageFormat")(MessageFormat.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    if (StreamArn != null) __obj.updateDynamic("StreamArn")(StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisSettings]
  }
}

