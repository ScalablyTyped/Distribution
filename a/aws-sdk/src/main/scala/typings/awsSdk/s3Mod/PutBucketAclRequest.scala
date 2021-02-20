package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketAclRequest extends StObject {
  
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.native
  
  /**
    * Contains the elements that set the ACL permissions for an object per grantee.
    */
  var AccessControlPolicy: js.UndefOr[typings.awsSdk.s3Mod.AccessControlPolicy] = js.native
  
  /**
    * The bucket to which to apply the ACL.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to verify that the request body was not corrupted in transit. For more information, go to RFC 1864.  For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.s3Mod.GrantFullControl] = js.native
  
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[typings.awsSdk.s3Mod.GrantRead] = js.native
  
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.s3Mod.GrantReadACP] = js.native
  
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.
    */
  var GrantWrite: js.UndefOr[typings.awsSdk.s3Mod.GrantWrite] = js.native
  
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.s3Mod.GrantWriteACP] = js.native
}
object PutBucketAclRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): PutBucketAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAclRequest]
  }
  
  @scala.inline
  implicit class PutBucketAclRequestMutableBuilder[Self <: PutBucketAclRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACL(value: BucketCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    @scala.inline
    def setAccessControlPolicy(value: AccessControlPolicy): Self = StObject.set(x, "AccessControlPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlPolicyUndefined: Self = StObject.set(x, "AccessControlPolicy", js.undefined)
    
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
  }
}
