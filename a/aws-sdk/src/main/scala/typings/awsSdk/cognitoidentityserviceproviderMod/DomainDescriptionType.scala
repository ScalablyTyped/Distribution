package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDescriptionType extends StObject {
  
  /**
    * The AWS account ID for the user pool owner.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
  
  /**
    * The ARN of the CloudFront distribution.
    */
  var CloudFrontDistribution: js.UndefOr[StringType] = js.undefined
  
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
  
  /**
    * The domain string.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  var S3Bucket: js.UndefOr[S3BucketType] = js.undefined
  
  /**
    * The domain status.
    */
  var Status: js.UndefOr[DomainStatusType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  
  /**
    * The app version.
    */
  var Version: js.UndefOr[DomainVersionType] = js.undefined
}
object DomainDescriptionType {
  
  @scala.inline
  def apply(): DomainDescriptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescriptionType]
  }
  
  @scala.inline
  implicit class DomainDescriptionTypeMutableBuilder[Self <: DomainDescriptionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAWSAccountId(value: AWSAccountIdType): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
    
    @scala.inline
    def setCloudFrontDistribution(value: StringType): Self = StObject.set(x, "CloudFrontDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontDistributionUndefined: Self = StObject.set(x, "CloudFrontDistribution", js.undefined)
    
    @scala.inline
    def setCustomDomainConfig(value: CustomDomainConfigType): Self = StObject.set(x, "CustomDomainConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDomainConfigUndefined: Self = StObject.set(x, "CustomDomainConfig", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3BucketType): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
    
    @scala.inline
    def setVersion(value: DomainVersionType): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
