package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): PlatformDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformDescription]
  }
  
  @scala.inline
  implicit class PlatformDescriptionOps[Self <: PlatformDescription] (val x: Self) extends AnyVal {
    
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
    def setCustomAmiListVarargs(value: CustomAmi*): Self = this.set("CustomAmiList", js.Array(value :_*))
    
    @scala.inline
    def setCustomAmiList(value: CustomAmiList): Self = this.set("CustomAmiList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAmiList: Self = this.set("CustomAmiList", js.undefined)
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = this.set("DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFrameworksVarargs(value: PlatformFramework*): Self = this.set("Frameworks", js.Array(value :_*))
    
    @scala.inline
    def setFrameworks(value: PlatformFrameworks): Self = this.set("Frameworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworks: Self = this.set("Frameworks", js.undefined)
    
    @scala.inline
    def setMaintainer(value: Maintainer): Self = this.set("Maintainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainer: Self = this.set("Maintainer", js.undefined)
    
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
    def setPlatformName(value: PlatformName): Self = this.set("PlatformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformName: Self = this.set("PlatformName", js.undefined)
    
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
    def setProgrammingLanguagesVarargs(value: PlatformProgrammingLanguage*): Self = this.set("ProgrammingLanguages", js.Array(value :_*))
    
    @scala.inline
    def setProgrammingLanguages(value: PlatformProgrammingLanguages): Self = this.set("ProgrammingLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgrammingLanguages: Self = this.set("ProgrammingLanguages", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = this.set("SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackName: Self = this.set("SolutionStackName", js.undefined)
    
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
