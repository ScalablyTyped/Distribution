package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceSettingsResponse extends js.Object {
  
  /**
    * Indicates whether cross-account discovery has been enabled.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member accounts with access to this share.
    */
  var LicenseManagerResourceShareArn: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether AWS Organizations has been integrated with License Manager for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.native
  
  /**
    * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  
  /**
    * SNS topic configured to receive notifications from License Manager.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
}
object GetServiceSettingsResponse {
  
  @scala.inline
  def apply(): GetServiceSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingsResponse]
  }
  
  @scala.inline
  implicit class GetServiceSettingsResponseOps[Self <: GetServiceSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setEnableCrossAccountsDiscovery(value: BoxBoolean): Self = this.set("EnableCrossAccountsDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCrossAccountsDiscovery: Self = this.set("EnableCrossAccountsDiscovery", js.undefined)
    
    @scala.inline
    def setLicenseManagerResourceShareArn(value: String): Self = this.set("LicenseManagerResourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseManagerResourceShareArn: Self = this.set("LicenseManagerResourceShareArn", js.undefined)
    
    @scala.inline
    def setOrganizationConfiguration(value: OrganizationConfiguration): Self = this.set("OrganizationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationConfiguration: Self = this.set("OrganizationConfiguration", js.undefined)
    
    @scala.inline
    def setS3BucketArn(value: String): Self = this.set("S3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketArn: Self = this.set("S3BucketArn", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
  }
}
