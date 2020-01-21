package typings.awsSdkClientS3Browser.typesBucketLoggingStatusMod

import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBucketLoggingStatus extends BucketLoggingStatus {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  @JSName("LoggingEnabled")
  var LoggingEnabled_UnmarshalledBucketLoggingStatus: js.UndefOr[UnmarshalledLoggingEnabled] = js.undefined
}

object UnmarshalledBucketLoggingStatus {
  @scala.inline
  def apply(LoggingEnabled: UnmarshalledLoggingEnabled = null): UnmarshalledBucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBucketLoggingStatus]
  }
}

