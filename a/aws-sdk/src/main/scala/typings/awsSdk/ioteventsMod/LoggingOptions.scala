package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingOptions extends js.Object {
  /**
    * Information that identifies those detector models and their detectors (instances) for which the logging level is given.
    */
  var detectorDebugOptions: js.UndefOr[DetectorDebugOptions] = js.native
  /**
    * If TRUE, logging is enabled for AWS IoT Events.
    */
  var enabled: LoggingEnabled = js.native
  /**
    * The logging level.
    */
  var level: LoggingLevel = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform logging.
    */
  var roleArn: AmazonResourceName = js.native
}

object LoggingOptions {
  @scala.inline
  def apply(
    enabled: LoggingEnabled,
    level: LoggingLevel,
    roleArn: AmazonResourceName,
    detectorDebugOptions: DetectorDebugOptions = null
  ): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (detectorDebugOptions != null) __obj.updateDynamic("detectorDebugOptions")(detectorDebugOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
}

