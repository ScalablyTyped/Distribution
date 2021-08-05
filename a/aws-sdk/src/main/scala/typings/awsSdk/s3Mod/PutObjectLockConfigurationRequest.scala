package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectLockConfigurationRequest extends StObject {
  
  /**
    * The bucket whose Object Lock configuration you want to create or replace.
    */
  var Bucket: BucketName
  
  /**
    * The MD5 hash for the request body. For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.undefined
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The Object Lock configuration that you want to apply to the specified bucket.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockConfiguration] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.undefined
  
  /**
    * A token to allow Object Lock to be enabled for an existing bucket.
    */
  var Token: js.UndefOr[ObjectLockToken] = js.undefined
}
object PutObjectLockConfigurationRequest {
  
  inline def apply(Bucket: BucketName): PutObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLockConfigurationRequest]
  }
  
  extension [Self <: PutObjectLockConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setObjectLockConfiguration(value: ObjectLockConfiguration): Self = StObject.set(x, "ObjectLockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObjectLockConfigurationUndefined: Self = StObject.set(x, "ObjectLockConfiguration", js.undefined)
    
    inline def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    inline def setToken(value: ObjectLockToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
