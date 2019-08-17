package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTargetGrantMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.FULL_CONTROL
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.READ
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.WRITE
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGranteeMod._UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTargetGrant extends _TargetGrant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee__UnmarshalledTargetGrant: js.UndefOr[_UnmarshalledGrantee] = js.undefined
}

object _UnmarshalledTargetGrant {
  @scala.inline
  def apply(Grantee: _UnmarshalledGrantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): _UnmarshalledTargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTargetGrant]
  }
}

