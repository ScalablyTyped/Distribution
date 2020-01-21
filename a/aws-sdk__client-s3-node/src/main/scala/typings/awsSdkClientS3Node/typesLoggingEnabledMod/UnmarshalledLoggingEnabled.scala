package typings.awsSdkClientS3Node.typesLoggingEnabledMod

import typings.awsSdkClientS3Node.typesTargetGrantMod.UnmarshalledTargetGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledLoggingEnabled extends LoggingEnabled {
  /**
    * _TargetGrants shape
    */
  @JSName("TargetGrants")
  var TargetGrants_UnmarshalledLoggingEnabled: js.UndefOr[js.Array[UnmarshalledTargetGrant]] = js.undefined
}

object UnmarshalledLoggingEnabled {
  @scala.inline
  def apply(TargetBucket: String, TargetPrefix: String, TargetGrants: js.Array[UnmarshalledTargetGrant] = null): UnmarshalledLoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    if (TargetGrants != null) __obj.updateDynamic("TargetGrants")(TargetGrants.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLoggingEnabled]
  }
}

