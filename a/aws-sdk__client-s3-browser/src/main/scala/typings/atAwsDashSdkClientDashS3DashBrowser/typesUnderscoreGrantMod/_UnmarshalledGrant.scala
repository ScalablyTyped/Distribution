package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGrantMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.FULL_CONTROL
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.READ
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.READ_ACP
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.WRITE
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.WRITE_ACP
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGranteeMod._UnmarshalledGrantee
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

