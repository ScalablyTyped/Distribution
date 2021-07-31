package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPublicAccessBlockRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to set.
    */
  var Bucket: BucketName
  
  /**
    * The MD5 hash of the PutPublicAccessBlock request body.  For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.undefined
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" in the Amazon Simple Storage Service Developer Guide.
    */
  var PublicAccessBlockConfiguration: typings.awsSdk.s3Mod.PublicAccessBlockConfiguration
}
object PutPublicAccessBlockRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], PublicAccessBlockConfiguration = PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
  
  @scala.inline
  implicit class PutPublicAccessBlockRequestMutableBuilder[Self <: PutPublicAccessBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
  }
}
