package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreBucketLoggingStatusMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLoggingEnabledMod._UnmarshalledLoggingEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledBucketLoggingStatus extends _BucketLoggingStatus {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  @JSName("LoggingEnabled")
  var LoggingEnabled__UnmarshalledBucketLoggingStatus: js.UndefOr[_UnmarshalledLoggingEnabled] = js.undefined
}

object _UnmarshalledBucketLoggingStatus {
  @scala.inline
  def apply(LoggingEnabled: _UnmarshalledLoggingEnabled = null): _UnmarshalledBucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled)
    __obj.asInstanceOf[_UnmarshalledBucketLoggingStatus]
  }
}

