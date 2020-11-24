package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLicenseConfigurationRequest extends js.Object {
  
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  
  /**
    * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new instances.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * Dimension used to track the license inventory.
    */
  var LicenseCountingType: typings.awsSdk.licensemanagerMod.LicenseCountingType = js.native
  
  /**
    * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). The available rules vary by dimension, as follows.    Cores dimension: allowedTenancy | licenseAffinityToHost | maximumCores | minimumCores     Instances dimension: allowedTenancy | maximumCores | minimumCores | maximumSockets | minimumSockets | maximumVcpus | minimumVcpus     Sockets dimension: allowedTenancy | licenseAffinityToHost | maximumSockets | minimumSockets     vCPUs dimension: allowedTenancy | honorVcpuOptimization | maximumVcpus | minimumVcpus    The unit for licenseAffinityToHost is days and the range is 1 to 180. The possible values for allowedTenancy are EC2-Default, EC2-DedicatedHost, and EC2-DedicatedInstance. The possible values for honorVcpuOptimization are True and False.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  
  /**
    * Name of the license configuration.
    */
  var Name: String = js.native
  
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.licensemanagerMod.ProductInformationList] = js.native
  
  /**
    * Tags to add to the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateLicenseConfigurationRequest {
  
  @scala.inline
  def apply(LicenseCountingType: LicenseCountingType, Name: String): CreateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseCountingType = LicenseCountingType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateLicenseConfigurationRequestOps[Self <: CreateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setLicenseCountingType(value: LicenseCountingType): Self = this.set("LicenseCountingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLicenseCount(value: BoxLong): Self = this.set("LicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCount: Self = this.set("LicenseCount", js.undefined)
    
    @scala.inline
    def setLicenseCountHardLimit(value: BoxBoolean): Self = this.set("LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCountHardLimit: Self = this.set("LicenseCountHardLimit", js.undefined)
    
    @scala.inline
    def setLicenseRulesVarargs(value: String*): Self = this.set("LicenseRules", js.Array(value :_*))
    
    @scala.inline
    def setLicenseRules(value: StringList): Self = this.set("LicenseRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseRules: Self = this.set("LicenseRules", js.undefined)
    
    @scala.inline
    def setProductInformationListVarargs(value: ProductInformation*): Self = this.set("ProductInformationList", js.Array(value :_*))
    
    @scala.inline
    def setProductInformationList(value: ProductInformationList): Self = this.set("ProductInformationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductInformationList: Self = this.set("ProductInformationList", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
