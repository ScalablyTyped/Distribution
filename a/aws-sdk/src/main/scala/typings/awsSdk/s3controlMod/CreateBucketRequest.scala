package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketRequest extends StObject {
  
  /**
    * The canned ACL to apply to the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName
  
  /**
    * The configuration information for the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var CreateBucketConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.CreateBucketConfiguration] = js.undefined
  
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.s3controlMod.GrantFullControl] = js.undefined
  
  /**
    * Allows grantee to list the objects in the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantRead: js.UndefOr[typings.awsSdk.s3controlMod.GrantRead] = js.undefined
  
  /**
    * Allows grantee to read the bucket ACL.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.s3controlMod.GrantReadACP] = js.undefined
  
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantWrite: js.UndefOr[typings.awsSdk.s3controlMod.GrantWrite] = js.undefined
  
  /**
    * Allows grantee to write the ACL for the applicable bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.s3controlMod.GrantWriteACP] = js.undefined
  
  /**
    * Specifies whether you want S3 Object Lock to be enabled for the new bucket.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ObjectLockEnabledForBucket: js.UndefOr[typings.awsSdk.s3controlMod.ObjectLockEnabledForBucket] = js.undefined
  
  /**
    * The ID of the Outposts where the bucket is being created.  This is required by Amazon S3 on Outposts buckets. 
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
}
object CreateBucketRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): CreateBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketRequest]
  }
  
  @scala.inline
  implicit class CreateBucketRequestMutableBuilder[Self <: CreateBucketRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACL(value: BucketCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBucketConfiguration(value: CreateBucketConfiguration): Self = StObject.set(x, "CreateBucketConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBucketConfigurationUndefined: Self = StObject.set(x, "CreateBucketConfiguration", js.undefined)
    
    @scala.inline
    def setGrantFullControl(value: GrantFullControl): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
    
    @scala.inline
    def setGrantRead(value: GrantRead): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantReadACP(value: GrantReadACP): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
    
    @scala.inline
    def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
    
    @scala.inline
    def setGrantWrite(value: GrantWrite): Self = StObject.set(x, "GrantWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantWriteACP(value: GrantWriteACP): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
    
    @scala.inline
    def setGrantWriteUndefined: Self = StObject.set(x, "GrantWrite", js.undefined)
    
    @scala.inline
    def setObjectLockEnabledForBucket(value: ObjectLockEnabledForBucket): Self = StObject.set(x, "ObjectLockEnabledForBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockEnabledForBucketUndefined: Self = StObject.set(x, "ObjectLockEnabledForBucket", js.undefined)
    
    @scala.inline
    def setOutpostId(value: NonEmptyMaxLength64String): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
  }
}
