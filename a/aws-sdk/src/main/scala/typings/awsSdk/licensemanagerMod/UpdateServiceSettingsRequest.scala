package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceSettingsRequest extends js.Object {
  
  /**
    * Activates cross-account discovery.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * Enables integration with AWS Organizations for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Amazon S3 bucket where the License Manager information is stored.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Amazon SNS topic used for License Manager alerts.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
}
object UpdateServiceSettingsRequest {
  
  @scala.inline
  def apply(): UpdateServiceSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateServiceSettingsRequestOps[Self <: UpdateServiceSettingsRequest] (val x: Self) extends AnyVal {
    
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
