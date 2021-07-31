package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseConfigurationRequest extends StObject {
  
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new instances.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Dimension used to track the license inventory.
    */
  var LicenseCountingType: typings.awsSdk.licensemanagerMod.LicenseCountingType
  
  /**
    * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). The available rules vary by dimension, as follows.    Cores dimension: allowedTenancy | licenseAffinityToHost | maximumCores | minimumCores     Instances dimension: allowedTenancy | maximumCores | minimumCores | maximumSockets | minimumSockets | maximumVcpus | minimumVcpus     Sockets dimension: allowedTenancy | licenseAffinityToHost | maximumSockets | minimumSockets     vCPUs dimension: allowedTenancy | honorVcpuOptimization | maximumVcpus | minimumVcpus    The unit for licenseAffinityToHost is days and the range is 1 to 180. The possible values for allowedTenancy are EC2-Default, EC2-DedicatedHost, and EC2-DedicatedInstance. The possible values for honorVcpuOptimization are True and False.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  
  /**
    * Name of the license configuration.
    */
  var Name: String
  
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.licensemanagerMod.ProductInformationList] = js.undefined
  
  /**
    * Tags to add to the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateLicenseConfigurationRequest {
  
  @scala.inline
  def apply(LicenseCountingType: LicenseCountingType, Name: String): CreateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseCountingType = LicenseCountingType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateLicenseConfigurationRequestMutableBuilder[Self <: CreateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLicenseCount(value: BoxLong): Self = StObject.set(x, "LicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountHardLimit(value: BoxBoolean): Self = StObject.set(x, "LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "LicenseCountHardLimit", js.undefined)
    
    @scala.inline
    def setLicenseCountUndefined: Self = StObject.set(x, "LicenseCount", js.undefined)
    
    @scala.inline
    def setLicenseCountingType(value: LicenseCountingType): Self = StObject.set(x, "LicenseCountingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseRules(value: StringList): Self = StObject.set(x, "LicenseRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseRulesUndefined: Self = StObject.set(x, "LicenseRules", js.undefined)
    
    @scala.inline
    def setLicenseRulesVarargs(value: String*): Self = StObject.set(x, "LicenseRules", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationList(value: ProductInformationList): Self = StObject.set(x, "ProductInformationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationListUndefined: Self = StObject.set(x, "ProductInformationList", js.undefined)
    
    @scala.inline
    def setProductInformationListVarargs(value: ProductInformation*): Self = StObject.set(x, "ProductInformationList", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
