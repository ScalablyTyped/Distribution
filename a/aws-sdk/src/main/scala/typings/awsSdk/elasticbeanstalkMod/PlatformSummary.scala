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
  def apply(): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformSummary]
  }
  @scala.inline
  implicit class PlatformSummaryOps[Self <: PlatformSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperatingSystemName(value: OperatingSystemName): Self = this.set("OperatingSystemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemName: Self = this.set("OperatingSystemName", js.undefined)
    @scala.inline
    def setOperatingSystemVersion(value: OperatingSystemVersion): Self = this.set("OperatingSystemVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersion: Self = this.set("OperatingSystemVersion", js.undefined)
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    @scala.inline
    def setPlatformBranchLifecycleState(value: PlatformBranchLifecycleState): Self = this.set("PlatformBranchLifecycleState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformBranchLifecycleState: Self = this.set("PlatformBranchLifecycleState", js.undefined)
    @scala.inline
    def setPlatformBranchName(value: BranchName): Self = this.set("PlatformBranchName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformBranchName: Self = this.set("PlatformBranchName", js.undefined)
    @scala.inline
    def setPlatformCategory(value: PlatformCategory): Self = this.set("PlatformCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformCategory: Self = this.set("PlatformCategory", js.undefined)
    @scala.inline
    def setPlatformLifecycleState(value: PlatformLifecycleState): Self = this.set("PlatformLifecycleState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformLifecycleState: Self = this.set("PlatformLifecycleState", js.undefined)
    @scala.inline
    def setPlatformOwner(value: PlatformOwner): Self = this.set("PlatformOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformOwner: Self = this.set("PlatformOwner", js.undefined)
    @scala.inline
    def setPlatformStatus(value: PlatformStatus): Self = this.set("PlatformStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformStatus: Self = this.set("PlatformStatus", js.undefined)
    @scala.inline
    def setPlatformVersion(value: PlatformVersion): Self = this.set("PlatformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("PlatformVersion", js.undefined)
    @scala.inline
    def setSupportedAddonListVarargs(value: SupportedAddon*): Self = this.set("SupportedAddonList", js.Array(value :_*))
    @scala.inline
    def setSupportedAddonList(value: SupportedAddonList): Self = this.set("SupportedAddonList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedAddonList: Self = this.set("SupportedAddonList", js.undefined)
    @scala.inline
    def setSupportedTierListVarargs(value: SupportedTier*): Self = this.set("SupportedTierList", js.Array(value :_*))
    @scala.inline
    def setSupportedTierList(value: SupportedTierList): Self = this.set("SupportedTierList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedTierList: Self = this.set("SupportedTierList", js.undefined)
  }
  
}

