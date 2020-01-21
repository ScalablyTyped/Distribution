package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackagingConfigurationRequest extends js.Object {
  var CmafPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.CmafPackage] = js.native
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.DashPackage] = js.native
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.HlsPackage] = js.native
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: string = js.native
  var MssPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.MssPackage] = js.native
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: string = js.native
}

object CreatePackagingConfigurationRequest {
  @scala.inline
  def apply(
    Id: string,
    PackagingGroupId: string,
    CmafPackage: CmafPackage = null,
    DashPackage: DashPackage = null,
    HlsPackage: HlsPackage = null,
    MssPackage: MssPackage = null
  ): CreatePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any])
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage.asInstanceOf[js.Any])
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage.asInstanceOf[js.Any])
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage.asInstanceOf[js.Any])
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingConfigurationRequest]
  }
}

