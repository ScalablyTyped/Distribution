package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformDescription extends StObject {
  
  /**
    * The custom AMIs supported by the platform version.
    */
  var CustomAmiList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.CustomAmiList] = js.undefined
  
  /**
    * The date when the platform version was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.undefined
  
  /**
    * The date when the platform version was last updated.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
  
  /**
    * The description of the platform version.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.undefined
  
  /**
    * The frameworks supported by the platform version.
    */
  var Frameworks: js.UndefOr[PlatformFrameworks] = js.undefined
  
  /**
    * Information about the maintainer of the platform version.
    */
  var Maintainer: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Maintainer] = js.undefined
  
  /**
    * The operating system used by the platform version.
    */
  var OperatingSystemName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperatingSystemName] = js.undefined
  
  /**
    * The version of the operating system used by the platform version.
    */
  var OperatingSystemVersion: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperatingSystemVersion] = js.undefined
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The state of the platform version's branch in its lifecycle. Possible values: Beta | Supported | Deprecated | Retired 
    */
  var PlatformBranchLifecycleState: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformBranchLifecycleState] = js.undefined
  
  /**
    * The platform branch to which the platform version belongs.
    */
  var PlatformBranchName: js.UndefOr[BranchName] = js.undefined
  
  /**
    * The category of the platform version.
    */
  var PlatformCategory: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformCategory] = js.undefined
  
  /**
    * The state of the platform version in its lifecycle. Possible values: Recommended | null  If a null value is returned, the platform version isn't the recommended one for its branch. Each platform branch has a single recommended platform version, typically the most recent one.
    */
  var PlatformLifecycleState: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformLifecycleState] = js.undefined
  
  /**
    * The name of the platform version.
    */
  var PlatformName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformName] = js.undefined
  
  /**
    * The AWS account ID of the person who created the platform version.
    */
  var PlatformOwner: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformOwner] = js.undefined
  
  /**
    * The status of the platform version.
    */
  var PlatformStatus: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformStatus] = js.undefined
  
  /**
    * The version of the platform version.
    */
  var PlatformVersion: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformVersion] = js.undefined
  
  /**
    * The programming languages supported by the platform version.
    */
  var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.undefined
  
  /**
    * The name of the solution stack used by the platform version.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.undefined
  
  /**
    * The additions supported by the platform version.
    */
  var SupportedAddonList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedAddonList] = js.undefined
  
  /**
    * The tiers supported by the platform version.
    */
  var SupportedTierList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.undefined
}
object PlatformDescription {
  
  inline def apply(): PlatformDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformDescription]
  }
  
  extension [Self <: PlatformDescription](x: Self) {
    
    inline def setCustomAmiList(value: CustomAmiList): Self = StObject.set(x, "CustomAmiList", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiListUndefined: Self = StObject.set(x, "CustomAmiList", js.undefined)
    
    inline def setCustomAmiListVarargs(value: CustomAmi*): Self = StObject.set(x, "CustomAmiList", js.Array(value :_*))
    
    inline def setDateCreated(value: CreationDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateUpdated(value: UpdateDate): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFrameworks(value: PlatformFrameworks): Self = StObject.set(x, "Frameworks", value.asInstanceOf[js.Any])
    
    inline def setFrameworksUndefined: Self = StObject.set(x, "Frameworks", js.undefined)
    
    inline def setFrameworksVarargs(value: PlatformFramework*): Self = StObject.set(x, "Frameworks", js.Array(value :_*))
    
    inline def setMaintainer(value: Maintainer): Self = StObject.set(x, "Maintainer", value.asInstanceOf[js.Any])
    
    inline def setMaintainerUndefined: Self = StObject.set(x, "Maintainer", js.undefined)
    
    inline def setOperatingSystemName(value: OperatingSystemName): Self = StObject.set(x, "OperatingSystemName", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemNameUndefined: Self = StObject.set(x, "OperatingSystemName", js.undefined)
    
    inline def setOperatingSystemVersion(value: OperatingSystemVersion): Self = StObject.set(x, "OperatingSystemVersion", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionUndefined: Self = StObject.set(x, "OperatingSystemVersion", js.undefined)
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setPlatformBranchLifecycleState(value: PlatformBranchLifecycleState): Self = StObject.set(x, "PlatformBranchLifecycleState", value.asInstanceOf[js.Any])
    
    inline def setPlatformBranchLifecycleStateUndefined: Self = StObject.set(x, "PlatformBranchLifecycleState", js.undefined)
    
    inline def setPlatformBranchName(value: BranchName): Self = StObject.set(x, "PlatformBranchName", value.asInstanceOf[js.Any])
    
    inline def setPlatformBranchNameUndefined: Self = StObject.set(x, "PlatformBranchName", js.undefined)
    
    inline def setPlatformCategory(value: PlatformCategory): Self = StObject.set(x, "PlatformCategory", value.asInstanceOf[js.Any])
    
    inline def setPlatformCategoryUndefined: Self = StObject.set(x, "PlatformCategory", js.undefined)
    
    inline def setPlatformLifecycleState(value: PlatformLifecycleState): Self = StObject.set(x, "PlatformLifecycleState", value.asInstanceOf[js.Any])
    
    inline def setPlatformLifecycleStateUndefined: Self = StObject.set(x, "PlatformLifecycleState", js.undefined)
    
    inline def setPlatformName(value: PlatformName): Self = StObject.set(x, "PlatformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformNameUndefined: Self = StObject.set(x, "PlatformName", js.undefined)
    
    inline def setPlatformOwner(value: PlatformOwner): Self = StObject.set(x, "PlatformOwner", value.asInstanceOf[js.Any])
    
    inline def setPlatformOwnerUndefined: Self = StObject.set(x, "PlatformOwner", js.undefined)
    
    inline def setPlatformStatus(value: PlatformStatus): Self = StObject.set(x, "PlatformStatus", value.asInstanceOf[js.Any])
    
    inline def setPlatformStatusUndefined: Self = StObject.set(x, "PlatformStatus", js.undefined)
    
    inline def setPlatformVersion(value: PlatformVersion): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setProgrammingLanguages(value: PlatformProgrammingLanguages): Self = StObject.set(x, "ProgrammingLanguages", value.asInstanceOf[js.Any])
    
    inline def setProgrammingLanguagesUndefined: Self = StObject.set(x, "ProgrammingLanguages", js.undefined)
    
    inline def setProgrammingLanguagesVarargs(value: PlatformProgrammingLanguage*): Self = StObject.set(x, "ProgrammingLanguages", js.Array(value :_*))
    
    inline def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
    
    inline def setSupportedAddonList(value: SupportedAddonList): Self = StObject.set(x, "SupportedAddonList", value.asInstanceOf[js.Any])
    
    inline def setSupportedAddonListUndefined: Self = StObject.set(x, "SupportedAddonList", js.undefined)
    
    inline def setSupportedAddonListVarargs(value: SupportedAddon*): Self = StObject.set(x, "SupportedAddonList", js.Array(value :_*))
    
    inline def setSupportedTierList(value: SupportedTierList): Self = StObject.set(x, "SupportedTierList", value.asInstanceOf[js.Any])
    
    inline def setSupportedTierListUndefined: Self = StObject.set(x, "SupportedTierList", js.undefined)
    
    inline def setSupportedTierListVarargs(value: SupportedTier*): Self = StObject.set(x, "SupportedTierList", js.Array(value :_*))
  }
}
