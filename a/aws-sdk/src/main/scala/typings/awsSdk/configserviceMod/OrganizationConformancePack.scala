package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationConformancePack extends js.Object {
  
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  
  /**
    * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template that is used to create a pack. 
    */
  var DeliveryS3Bucket: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3Bucket] = js.native
  
  /**
    * Any folder structure you want to add to an Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  
  /**
    * A comma-separated list of accounts excluded from organization conformance pack.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  
  /**
    * Last time when organization conformation pack was updated.
    */
  var LastUpdateTime: Date = js.native
  
  /**
    * Amazon Resource Name (ARN) of organization conformance pack.
    */
  var OrganizationConformancePackArn: StringWithCharLimit256 = js.native
  
  /**
    * The name you assign to an organization conformance pack.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
}
object OrganizationConformancePack {
  
  @scala.inline
  def apply(
    LastUpdateTime: Date,
    OrganizationConformancePackArn: StringWithCharLimit256,
    OrganizationConformancePackName: OrganizationConformancePackName
  ): OrganizationConformancePack = {
    val __obj = js.Dynamic.literal(LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], OrganizationConformancePackArn = OrganizationConformancePackArn.asInstanceOf[js.Any], OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePack]
  }
  
  @scala.inline
  implicit class OrganizationConformancePackOps[Self <: OrganizationConformancePack] (val x: Self) extends AnyVal {
    
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
    def setLastUpdateTime(value: Date): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePackArn(value: StringWithCharLimit256): Self = this.set("OrganizationConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = this.set("OrganizationConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = this.set("ConformancePackInputParameters", js.Array(value :_*))
    
    @scala.inline
    def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = this.set("ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConformancePackInputParameters: Self = this.set("ConformancePackInputParameters", js.undefined)
    
    @scala.inline
    def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = this.set("DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryS3Bucket: Self = this.set("DeliveryS3Bucket", js.undefined)
    
    @scala.inline
    def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = this.set("DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryS3KeyPrefix: Self = this.set("DeliveryS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setExcludedAccountsVarargs(value: AccountId*): Self = this.set("ExcludedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setExcludedAccounts(value: ExcludedAccounts): Self = this.set("ExcludedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAccounts: Self = this.set("ExcludedAccounts", js.undefined)
  }
}
