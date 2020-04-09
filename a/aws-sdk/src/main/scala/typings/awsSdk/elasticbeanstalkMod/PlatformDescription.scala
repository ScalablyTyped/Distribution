package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformDescription extends js.Object {
  /**
    * The custom AMIs supported by the platform version.
    */
  var CustomAmiList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.CustomAmiList] = js.native
  /**
    * The date when the platform version was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  /**
    * The date when the platform version was last updated.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  /**
    * The description of the platform version.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The frameworks supported by the platform version.
    */
  var Frameworks: js.UndefOr[PlatformFrameworks] = js.native
  /**
    * Information about the maintainer of the platform version.
    */
  var Maintainer: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Maintainer] = js.native
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
    * The state of the platform version's branch in its lifecycle. Possible values: Beta | Supported | Deprecated | Retired 
    */
  var PlatformBranchLifecycleState: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformBranchLifecycleState] = js.native
  /**
    * The platform branch to which the platform version belongs.
    */
  var PlatformBranchName: js.UndefOr[BranchName] = js.native
  /**
    * The category of the platform version.
    */
  var PlatformCategory: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformCategory] = js.native
  /**
    * The state of the platform version in its lifecycle. Possible values: Recommended | null  If a null value is returned, the platform version isn't the recommended one for its branch. Each platform branch has a single recommended platform version, typically the most recent one.
    */
  var PlatformLifecycleState: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformLifecycleState] = js.native
  /**
    * The name of the platform version.
    */
  var PlatformName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformName] = js.native
  /**
    * The AWS account ID of the person who created the platform version.
    */
  var PlatformOwner: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformOwner] = js.native
  /**
    * The status of the platform version.
    */
  var PlatformStatus: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformStatus] = js.native
  /**
    * The version of the platform version.
    */
  var PlatformVersion: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformVersion] = js.native
  /**
    * The programming languages supported by the platform version.
    */
  var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.native
  /**
    * The name of the solution stack used by the platform version.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * The additions supported by the platform version.
    */
  var SupportedAddonList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedAddonList] = js.native
  /**
    * The tiers supported by the platform version.
    */
  var SupportedTierList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}

object PlatformDescription {
  @scala.inline
  def apply(
    CustomAmiList: CustomAmiList = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    Description: Description = null,
    Frameworks: PlatformFrameworks = null,
    Maintainer: Maintainer = null,
    OperatingSystemName: OperatingSystemName = null,
    OperatingSystemVersion: OperatingSystemVersion = null,
    PlatformArn: PlatformArn = null,
    PlatformBranchLifecycleState: PlatformBranchLifecycleState = null,
    PlatformBranchName: BranchName = null,
    PlatformCategory: PlatformCategory = null,
    PlatformLifecycleState: PlatformLifecycleState = null,
    PlatformName: PlatformName = null,
    PlatformOwner: PlatformOwner = null,
    PlatformStatus: PlatformStatus = null,
    PlatformVersion: PlatformVersion = null,
    ProgrammingLanguages: PlatformProgrammingLanguages = null,
    SolutionStackName: SolutionStackName = null,
    SupportedAddonList: SupportedAddonList = null,
    SupportedTierList: SupportedTierList = null
  ): PlatformDescription = {
    val __obj = js.Dynamic.literal()
    if (CustomAmiList != null) __obj.updateDynamic("CustomAmiList")(CustomAmiList.asInstanceOf[js.Any])
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Frameworks != null) __obj.updateDynamic("Frameworks")(Frameworks.asInstanceOf[js.Any])
    if (Maintainer != null) __obj.updateDynamic("Maintainer")(Maintainer.asInstanceOf[js.Any])
    if (OperatingSystemName != null) __obj.updateDynamic("OperatingSystemName")(OperatingSystemName.asInstanceOf[js.Any])
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (PlatformBranchLifecycleState != null) __obj.updateDynamic("PlatformBranchLifecycleState")(PlatformBranchLifecycleState.asInstanceOf[js.Any])
    if (PlatformBranchName != null) __obj.updateDynamic("PlatformBranchName")(PlatformBranchName.asInstanceOf[js.Any])
    if (PlatformCategory != null) __obj.updateDynamic("PlatformCategory")(PlatformCategory.asInstanceOf[js.Any])
    if (PlatformLifecycleState != null) __obj.updateDynamic("PlatformLifecycleState")(PlatformLifecycleState.asInstanceOf[js.Any])
    if (PlatformName != null) __obj.updateDynamic("PlatformName")(PlatformName.asInstanceOf[js.Any])
    if (PlatformOwner != null) __obj.updateDynamic("PlatformOwner")(PlatformOwner.asInstanceOf[js.Any])
    if (PlatformStatus != null) __obj.updateDynamic("PlatformStatus")(PlatformStatus.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (ProgrammingLanguages != null) __obj.updateDynamic("ProgrammingLanguages")(ProgrammingLanguages.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (SupportedAddonList != null) __obj.updateDynamic("SupportedAddonList")(SupportedAddonList.asInstanceOf[js.Any])
    if (SupportedTierList != null) __obj.updateDynamic("SupportedTierList")(SupportedTierList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformDescription]
  }
}

