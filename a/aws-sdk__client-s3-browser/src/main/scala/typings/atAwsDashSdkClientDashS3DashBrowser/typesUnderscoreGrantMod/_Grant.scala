package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGrantMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.FULL_CONTROL
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.READ
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.READ_ACP
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.WRITE
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.WRITE_ACP
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGranteeMod._Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Grant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[_Grantee] = js.undefined
  /**
    * <p>Specifies the permission given to the grantee.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.undefined
}

object _Grant {
  @scala.inline
  def apply(
    Grantee: _Grantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): _Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Grant]
  }
}

