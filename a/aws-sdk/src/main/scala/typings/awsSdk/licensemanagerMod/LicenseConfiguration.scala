package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseConfiguration extends js.Object {
  
  /**
    * Automated discovery information.
    */
  var AutomatedDiscoveryInformation: js.UndefOr[typings.awsSdk.licensemanagerMod.AutomatedDiscoveryInformation] = js.native
  
  /**
    * Summaries for licenses consumed by various resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typings.awsSdk.licensemanagerMod.ConsumedLicenseSummaryList] = js.native
  
  /**
    * Number of licenses consumed. 
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
  
  /**
    * Unique ID of the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  
  /**
    * Number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * Dimension to use to track the license inventory.
    */
  var LicenseCountingType: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseCountingType] = js.native
  
  /**
    * License rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  
  /**
    * Summaries for managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typings.awsSdk.licensemanagerMod.ManagedResourceSummaryList] = js.native
  
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * Account ID of the license configuration's owner.
    */
  var OwnerAccountId: js.UndefOr[String] = js.native
  
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.licensemanagerMod.ProductInformationList] = js.native
  
  /**
    * Status of the license configuration.
    */
  var Status: js.UndefOr[String] = js.native
}
object LicenseConfiguration {
  
  @scala.inline
  def apply(): LicenseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfiguration]
  }
  
  @scala.inline
  implicit class LicenseConfigurationOps[Self <: LicenseConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutomatedDiscoveryInformation(value: AutomatedDiscoveryInformation): Self = this.set("AutomatedDiscoveryInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedDiscoveryInformation: Self = this.set("AutomatedDiscoveryInformation", js.undefined)
    
    @scala.inline
    def setConsumedLicenseSummaryListVarargs(value: ConsumedLicenseSummary*): Self = this.set("ConsumedLicenseSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setConsumedLicenseSummaryList(value: ConsumedLicenseSummaryList): Self = this.set("ConsumedLicenseSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedLicenseSummaryList: Self = this.set("ConsumedLicenseSummaryList", js.undefined)
    
    @scala.inline
    def setConsumedLicenses(value: BoxLong): Self = this.set("ConsumedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedLicenses: Self = this.set("ConsumedLicenses", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = this.set("LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurationArn: Self = this.set("LicenseConfigurationArn", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationId(value: String): Self = this.set("LicenseConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurationId: Self = this.set("LicenseConfigurationId", js.undefined)
    
    @scala.inline
    def setLicenseCount(value: BoxLong): Self = this.set("LicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCount: Self = this.set("LicenseCount", js.undefined)
    
    @scala.inline
    def setLicenseCountHardLimit(value: BoxBoolean): Self = this.set("LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCountHardLimit: Self = this.set("LicenseCountHardLimit", js.undefined)
    
    @scala.inline
    def setLicenseCountingType(value: LicenseCountingType): Self = this.set("LicenseCountingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseCountingType: Self = this.set("LicenseCountingType", js.undefined)
    
    @scala.inline
    def setLicenseRulesVarargs(value: String*): Self = this.set("LicenseRules", js.Array(value :_*))
    
    @scala.inline
    def setLicenseRules(value: StringList): Self = this.set("LicenseRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseRules: Self = this.set("LicenseRules", js.undefined)
    
    @scala.inline
    def setManagedResourceSummaryListVarargs(value: ManagedResourceSummary*): Self = this.set("ManagedResourceSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setManagedResourceSummaryList(value: ManagedResourceSummaryList): Self = this.set("ManagedResourceSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedResourceSummaryList: Self = this.set("ManagedResourceSummaryList", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: String): Self = this.set("OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("OwnerAccountId", js.undefined)
    
    @scala.inline
    def setProductInformationListVarargs(value: ProductInformation*): Self = this.set("ProductInformationList", js.Array(value :_*))
    
    @scala.inline
    def setProductInformationList(value: ProductInformationList): Self = this.set("ProductInformationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductInformationList: Self = this.set("ProductInformationList", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
