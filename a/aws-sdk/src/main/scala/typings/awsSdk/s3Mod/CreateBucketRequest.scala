package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketRequest extends StObject {
  
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.undefined
  
  /**
    * The name of the bucket to create.
    */
  var Bucket: BucketName
  
  /**
    * The configuration information for the bucket.
    */
  var CreateBucketConfiguration: js.UndefOr[typings.awsSdk.s3Mod.CreateBucketConfiguration] = js.undefined
  
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.s3Mod.GrantFullControl] = js.undefined
  
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[typings.awsSdk.s3Mod.GrantRead] = js.undefined
  
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.s3Mod.GrantReadACP] = js.undefined
  
  /**
    * Allows grantee to create new objects in the bucket. For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
    */
  var GrantWrite: js.UndefOr[typings.awsSdk.s3Mod.GrantWrite] = js.undefined
  
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.s3Mod.GrantWriteACP] = js.undefined
  
  /**
    * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
    */
  var ObjectLockEnabledForBucket: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockEnabledForBucket] = js.undefined
  
  var ObjectOwnership: js.UndefOr[typings.awsSdk.s3Mod.ObjectOwnership] = js.undefined
}
object CreateBucketRequest {
  
  inline def apply(Bucket: BucketName): CreateBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketRequest]
  }
  
  extension [Self <: CreateBucketRequest](x: Self) {
    
    inline def setACL(value: BucketCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setCreateBucketConfiguration(value: CreateBucketConfiguration): Self = StObject.set(x, "CreateBucketConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCreateBucketConfigurationUndefined: Self = StObject.set(x, "CreateBucketConfiguration", js.undefined)
    
    inline def setGrantFullControl(value: GrantFullControl): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
    
    inline def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
    
    inline def setGrantRead(value: GrantRead): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACP(value: GrantReadACP): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
    
    inline def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
    
    inline def setGrantWrite(value: GrantWrite): Self = StObject.set(x, "GrantWrite", value.asInstanceOf[js.Any])
    
    inline def setGrantWriteACP(value: GrantWriteACP): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
    
    inline def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
    
    inline def setGrantWriteUndefined: Self = StObject.set(x, "GrantWrite", js.undefined)
    
    inline def setObjectLockEnabledForBucket(value: ObjectLockEnabledForBucket): Self = StObject.set(x, "ObjectLockEnabledForBucket", value.asInstanceOf[js.Any])
    
    inline def setObjectLockEnabledForBucketUndefined: Self = StObject.set(x, "ObjectLockEnabledForBucket", js.undefined)
    
    inline def setObjectOwnership(value: ObjectOwnership): Self = StObject.set(x, "ObjectOwnership", value.asInstanceOf[js.Any])
    
    inline def setObjectOwnershipUndefined: Self = StObject.set(x, "ObjectOwnership", js.undefined)
  }
}
