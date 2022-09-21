package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessConfiguration extends StObject {
  
  /**
    * The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location. Accepted value: S3_SIGV4. S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your source location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4) authentication to access the bucket where your source content is stored. Your MediaTailor source location baseURL must follow the S3 virtual hosted-style request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name. Before you can use S3_SIGV4, you must meet these requirements: • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal access in IAM. For information about configuring access in IAM, see Access management in the IAM User Guide. • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests referenced by the VodSource packaging configurations. • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced by your MediaTailor VodSource packaging configurations.
    */
  var AccessType: js.UndefOr[typings.awsSdk.mediatailorMod.AccessType] = js.undefined
  
  /**
    * AWS Secrets Manager access token configuration parameters.
    */
  var SecretsManagerAccessTokenConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.SecretsManagerAccessTokenConfiguration] = js.undefined
}
object AccessConfiguration {
  
  inline def apply(): AccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessConfiguration]
  }
  
  extension [Self <: AccessConfiguration](x: Self) {
    
    inline def setAccessType(value: AccessType): Self = StObject.set(x, "AccessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "AccessType", js.undefined)
    
    inline def setSecretsManagerAccessTokenConfiguration(value: SecretsManagerAccessTokenConfiguration): Self = StObject.set(x, "SecretsManagerAccessTokenConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessTokenConfigurationUndefined: Self = StObject.set(x, "SecretsManagerAccessTokenConfiguration", js.undefined)
  }
}
