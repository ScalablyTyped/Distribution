package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSettingsRequest extends StObject {
  
  /**
    * Activates cross-account discovery.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Enables integration with AWS Organizations for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the Amazon S3 bucket where the License Manager information is stored.
    */
  var S3BucketArn: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the Amazon SNS topic used for License Manager alerts.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
}
object UpdateServiceSettingsRequest {
  
  inline def apply(): UpdateServiceSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
  
  extension [Self <: UpdateServiceSettingsRequest](x: Self) {
    
    inline def setEnableCrossAccountsDiscovery(value: BoxBoolean): Self = StObject.set(x, "EnableCrossAccountsDiscovery", value.asInstanceOf[js.Any])
    
    inline def setEnableCrossAccountsDiscoveryUndefined: Self = StObject.set(x, "EnableCrossAccountsDiscovery", js.undefined)
    
    inline def setOrganizationConfiguration(value: OrganizationConfiguration): Self = StObject.set(x, "OrganizationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigurationUndefined: Self = StObject.set(x, "OrganizationConfiguration", js.undefined)
    
    inline def setS3BucketArn(value: String): Self = StObject.set(x, "S3BucketArn", value.asInstanceOf[js.Any])
    
    inline def setS3BucketArnUndefined: Self = StObject.set(x, "S3BucketArn", js.undefined)
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
