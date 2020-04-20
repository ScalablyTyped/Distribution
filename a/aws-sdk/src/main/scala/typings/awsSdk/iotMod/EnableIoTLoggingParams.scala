package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableIoTLoggingParams extends js.Object {
  /**
    * Specifies the types of information to be logged.
    */
  var logLevel: LogLevel = js.native
  /**
    * The ARN of the IAM role used for logging.
    */
  var roleArnForLogging: RoleArn = js.native
}

object EnableIoTLoggingParams {
  @scala.inline
  def apply(logLevel: LogLevel, roleArnForLogging: RoleArn): EnableIoTLoggingParams = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], roleArnForLogging = roleArnForLogging.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableIoTLoggingParams]
  }
}

