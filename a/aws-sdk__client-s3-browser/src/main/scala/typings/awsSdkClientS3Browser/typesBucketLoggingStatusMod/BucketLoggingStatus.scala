package typings.awsSdkClientS3Browser.typesBucketLoggingStatusMod

import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.LoggingEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLoggingStatus extends js.Object {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[typings.awsSdkClientS3Browser.typesLoggingEnabledMod.LoggingEnabled] = js.undefined
}

object BucketLoggingStatus {
  @scala.inline
  def apply(LoggingEnabled: LoggingEnabled = null): BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLoggingStatus]
  }
}

