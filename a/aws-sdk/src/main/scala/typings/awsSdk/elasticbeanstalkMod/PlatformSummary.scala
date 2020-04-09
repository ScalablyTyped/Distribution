package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformSummary extends js.Object {
  /**
    * The operating system used by the platform version.
    */
  var OperatingSystemName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperatingSystemName] = js.native
  /**
    * The version of the operating system used by the platform version.
    */
  var OperatingSystemVersion: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperatingSystemVersion] = js.native
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The state of the platform version's branch in its lifecycle. Possible values: beta | supported | deprecated | retired 
    */
  var PlatformBranchLifecycleState: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformBranchLifecycleState] = js.native
  /**
    * The platform branch to which the platform version belongs.
    */
  var PlatformBranchName: js.UndefOr[BranchName] = js.native
  /**
    * The category of platform version.
    */
  var PlatformCategory: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformCategory] = js.native
  /**
    * The state of the platform version in its lifecycle. Possible values: recommended | empty If an empty value is returned, the platform version is supported but isn't the recommended one for its branch.
    */
  var PlatformLifecycleState: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformLifecycleState] = js.native
  /**
    * The AWS account ID of the person who created the platform version.
    */
  var PlatformOwner: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformOwner] = js.native
  /**
    * The status of the platform version. You can create an environment from the platform version once it is ready.
    */
  var PlatformStatus: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformStatus] = js.native
  /**
    * The version string of the platform version.
    */
  var PlatformVersion: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformVersion] = js.native
  /**
    * The additions associated with the platform version.
    */
  var SupportedAddonList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedAddonList] = js.native
  /**
    * The tiers in which the platform version runs.
    */
  var SupportedTierList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}

object PlatformSummary {
  @scala.inline
  def apply(
    OperatingSystemName: OperatingSystemName = null,
    OperatingSystemVersion: OperatingSystemVersion = null,
    PlatformArn: PlatformArn = null,
    PlatformBranchLifecycleState: PlatformBranchLifecycleState = null,
    PlatformBranchName: BranchName = null,
    PlatformCategory: PlatformCategory = null,
    PlatformLifecycleState: PlatformLifecycleState = null,
    PlatformOwner: PlatformOwner = null,
    PlatformStatus: PlatformStatus = null,
    PlatformVersion: PlatformVersion = null,
    SupportedAddonList: SupportedAddonList = null,
    SupportedTierList: SupportedTierList = null
  ): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    if (OperatingSystemName != null) __obj.updateDynamic("OperatingSystemName")(OperatingSystemName.asInstanceOf[js.Any])
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (PlatformBranchLifecycleState != null) __obj.updateDynamic("PlatformBranchLifecycleState")(PlatformBranchLifecycleState.asInstanceOf[js.Any])
    if (PlatformBranchName != null) __obj.updateDynamic("PlatformBranchName")(PlatformBranchName.asInstanceOf[js.Any])
    if (PlatformCategory != null) __obj.updateDynamic("PlatformCategory")(PlatformCategory.asInstanceOf[js.Any])
    if (PlatformLifecycleState != null) __obj.updateDynamic("PlatformLifecycleState")(PlatformLifecycleState.asInstanceOf[js.Any])
    if (PlatformOwner != null) __obj.updateDynamic("PlatformOwner")(PlatformOwner.asInstanceOf[js.Any])
    if (PlatformStatus != null) __obj.updateDynamic("PlatformStatus")(PlatformStatus.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (SupportedAddonList != null) __obj.updateDynamic("SupportedAddonList")(SupportedAddonList.asInstanceOf[js.Any])
    if (SupportedTierList != null) __obj.updateDynamic("SupportedTierList")(SupportedTierList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformSummary]
  }
}

