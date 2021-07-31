package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCountByEncryptionType extends StObject {
  
  /**
    *  The total number of buckets that use an AWS Key Management Service (AWS KMS) customer master key (CMK) to encrypt objects. These buckets use AWS managed AWS KMS (AWS-KMS) encryption or customer managed AWS KMS (SSE-KMS) encryption.
    */
  var kmsManaged: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that use an Amazon S3 managed key to encrypt objects. These buckets use Amazon S3 managed (SSE-S3) encryption.
    */
  var s3Managed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that don't encrypt objects by default. Default encryption is disabled for these buckets.
    */
  var unencrypted: js.UndefOr[long] = js.undefined
}
object BucketCountByEncryptionType {
  
  @scala.inline
  def apply(): BucketCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountByEncryptionType]
  }
  
  @scala.inline
  implicit class BucketCountByEncryptionTypeMutableBuilder[Self <: BucketCountByEncryptionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsManaged(value: long): Self = StObject.set(x, "kmsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsManagedUndefined: Self = StObject.set(x, "kmsManaged", js.undefined)
    
    @scala.inline
    def setS3Managed(value: long): Self = StObject.set(x, "s3Managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ManagedUndefined: Self = StObject.set(x, "s3Managed", js.undefined)
    
    @scala.inline
    def setUnencrypted(value: long): Self = StObject.set(x, "unencrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnencryptedUndefined: Self = StObject.set(x, "unencrypted", js.undefined)
  }
}
