package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreVersioningConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _VersioningConfiguration extends js.Object {
  /**
    * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
    */
  var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.undefined
  /**
    * <p>The versioning state of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
}

object _VersioningConfiguration {
  @scala.inline
  def apply(MFADelete: Enabled | Disabled | String = null, Status: Enabled | Suspended | String = null): _VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    if (MFADelete != null) __obj.updateDynamic("MFADelete")(MFADelete.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[_VersioningConfiguration]
  }
}

