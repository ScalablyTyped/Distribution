package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetV2LoggingLevelRequest extends js.Object {
  /**
    * The log level.
    */
  var logLevel: LogLevel = js.native
  /**
    * The log target.
    */
  var logTarget: LogTarget = js.native
}

object SetV2LoggingLevelRequest {
  @scala.inline
  def apply(logLevel: LogLevel, logTarget: LogTarget): SetV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], logTarget = logTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetV2LoggingLevelRequest]
  }
}

