package typings.awsSdkClientS3Browser.typesVersioningConfigurationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersioningConfiguration extends js.Object {
  /**
    * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
    */
  var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.undefined
  /**
    * <p>The versioning state of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
}

object VersioningConfiguration {
  @scala.inline
  def apply(MFADelete: Enabled | Disabled | String = null, Status: Enabled | Suspended | String = null): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    if (MFADelete != null) __obj.updateDynamic("MFADelete")(MFADelete.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersioningConfiguration]
  }
}

