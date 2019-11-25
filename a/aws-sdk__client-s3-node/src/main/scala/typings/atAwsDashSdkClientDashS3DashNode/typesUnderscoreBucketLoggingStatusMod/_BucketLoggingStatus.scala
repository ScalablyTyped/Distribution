package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreBucketLoggingStatusMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLoggingEnabledMod._LoggingEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BucketLoggingStatus extends js.Object {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[_LoggingEnabled] = js.undefined
}

object _BucketLoggingStatus {
  @scala.inline
  def apply(LoggingEnabled: _LoggingEnabled = null): _BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BucketLoggingStatus]
  }
}

