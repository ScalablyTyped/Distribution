package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingOptionsPayload extends js.Object {
  /**
    * The log level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
}

object LoggingOptionsPayload {
  @scala.inline
  def apply(roleArn: AwsArn, logLevel: LogLevel = null): LoggingOptionsPayload = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptionsPayload]
  }
}

