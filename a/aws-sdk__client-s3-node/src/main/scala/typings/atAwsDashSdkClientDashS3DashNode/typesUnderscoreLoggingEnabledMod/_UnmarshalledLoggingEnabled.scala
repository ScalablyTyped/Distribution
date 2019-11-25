package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLoggingEnabledMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTargetGrantMod._UnmarshalledTargetGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLoggingEnabled extends _LoggingEnabled {
  /**
    * _TargetGrants shape
    */
  @JSName("TargetGrants")
  var TargetGrants__UnmarshalledLoggingEnabled: js.UndefOr[js.Array[_UnmarshalledTargetGrant]] = js.undefined
}

object _UnmarshalledLoggingEnabled {
  @scala.inline
  def apply(
    TargetBucket: String,
    TargetPrefix: String,
    TargetGrants: js.Array[_UnmarshalledTargetGrant] = null
  ): _UnmarshalledLoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    if (TargetGrants != null) __obj.updateDynamic("TargetGrants")(TargetGrants.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledLoggingEnabled]
  }
}

