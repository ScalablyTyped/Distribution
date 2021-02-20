package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLicenseConfigurationRequest extends StObject {
  
  /**
    * New description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  
  /**
    * New status of the license configuration.
    */
  var LicenseConfigurationStatus: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConfigurationStatus] = js.native
  
  /**
    * New number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  
  /**
    * New hard limit of the number of available licenses.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * New license rule. The only rule that you can add after you create a license configuration is licenseAffinityToHost.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  
  /**
    * New name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * New product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.licensemanagerMod.ProductInformationList] = js.native
}
object UpdateLicenseConfigurationRequest {
  
  @scala.inline
  def apply(LicenseConfigurationArn: String): UpdateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateLicenseConfigurationRequestMutableBuilder[Self <: UpdateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationStatus(value: LicenseConfigurationStatus): Self = StObject.set(x, "LicenseConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationStatusUndefined: Self = StObject.set(x, "LicenseConfigurationStatus", js.undefined)
    
    @scala.inline
    def setLicenseCount(value: BoxLong): Self = StObject.set(x, "LicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountHardLimit(value: BoxBoolean): Self = StObject.set(x, "LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "LicenseCountHardLimit", js.undefined)
    
    @scala.inline
    def setLicenseCountUndefined: Self = StObject.set(x, "LicenseCount", js.undefined)
    
    @scala.inline
    def setLicenseRules(value: StringList): Self = StObject.set(x, "LicenseRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseRulesUndefined: Self = StObject.set(x, "LicenseRules", js.undefined)
    
    @scala.inline
    def setLicenseRulesVarargs(value: String*): Self = StObject.set(x, "LicenseRules", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProductInformationList(value: ProductInformationList): Self = StObject.set(x, "ProductInformationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationListUndefined: Self = StObject.set(x, "ProductInformationList", js.undefined)
    
    @scala.inline
    def setProductInformationListVarargs(value: ProductInformation*): Self = StObject.set(x, "ProductInformationList", js.Array(value :_*))
  }
}
