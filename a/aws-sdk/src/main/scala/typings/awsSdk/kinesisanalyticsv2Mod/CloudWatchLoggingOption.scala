package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOption extends js.Object {
  /**
    * The ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.kinesisanalyticsv2Mod.LogStreamARN = js.native
}

object CloudWatchLoggingOption {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
}

