package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTargetGrantMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.FULL_CONTROL
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.READ
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.WRITE
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGranteeMod._Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TargetGrant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[_Grantee] = js.undefined
  /**
    * <p>Logging permissions assigned to the Grantee for the bucket.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.undefined
}

object _TargetGrant {
  @scala.inline
  def apply(Grantee: _Grantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): _TargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TargetGrant]
  }
}

