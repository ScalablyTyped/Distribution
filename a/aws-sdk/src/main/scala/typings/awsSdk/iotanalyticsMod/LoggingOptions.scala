package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingOptions extends js.Object {
  /**
    * If true, logging is enabled for AWS IoT Analytics.
    */
  var enabled: LoggingEnabled = js.native
  /**
    * The logging level. Currently, only "ERROR" is supported.
    */
  var level: LoggingLevel = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
    */
  var roleArn: RoleArn = js.native
}

object LoggingOptions {
  @scala.inline
  def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: RoleArn): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoggingOptions]
  }
}

