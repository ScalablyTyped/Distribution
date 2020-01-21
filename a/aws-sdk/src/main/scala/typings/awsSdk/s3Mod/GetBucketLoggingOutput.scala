package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLoggingOutput extends js.Object {
  var LoggingEnabled: js.UndefOr[typings.awsSdk.s3Mod.LoggingEnabled] = js.native
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply(LoggingEnabled: LoggingEnabled = null): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
}

