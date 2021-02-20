package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationConformancePack extends StObject {
  
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
  implicit class OrganizationConformancePackMutableBuilder[Self <: OrganizationConformancePack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = StObject.set(x, "ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackInputParametersUndefined: Self = StObject.set(x, "ConformancePackInputParameters", js.undefined)
    
    @scala.inline
    def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = StObject.set(x, "ConformancePackInputParameters", js.Array(value :_*))
    
    @scala.inline
    def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = StObject.set(x, "DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3BucketUndefined: Self = StObject.set(x, "DeliveryS3Bucket", js.undefined)
    
    @scala.inline
    def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = StObject.set(x, "DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryS3KeyPrefixUndefined: Self = StObject.set(x, "DeliveryS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setExcludedAccounts(value: ExcludedAccounts): Self = StObject.set(x, "ExcludedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedAccountsUndefined: Self = StObject.set(x, "ExcludedAccounts", js.undefined)
    
    @scala.inline
    def setExcludedAccountsVarargs(value: AccountId*): Self = StObject.set(x, "ExcludedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdateTime(value: Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePackArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = StObject.set(x, "OrganizationConformancePackName", value.asInstanceOf[js.Any])
  }
}
