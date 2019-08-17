package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.FULL_CONTROL
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.READ
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.READ_ACP
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.WRITE
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.WRITE_ACP
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGranteeMod._UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGrant extends _Grant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee__UnmarshalledGrant: js.UndefOr[_UnmarshalledGrantee] = js.undefined
}

object _UnmarshalledGrant {
  @scala.inline
  def apply(
    Grantee: _UnmarshalledGrantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): _UnmarshalledGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGrant]
  }
}

