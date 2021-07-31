package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectCountByEncryptionType extends StObject {
  
  /**
    * The total number of objects that are encrypted using a customer-managed key. The objects use customer-provided server-side (SSE-C) encryption.
    */
  var customerManaged: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer master key (CMK). The objects use AWS managed AWS KMS (AWS-KMS) encryption or customer managed AWS KMS (SSE-KMS) encryption.
    */
  var kmsManaged: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3 managed (SSE-S3) encryption.
    */
  var s3Managed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that aren't encrypted or use client-side encryption.
    */
  var unencrypted: js.UndefOr[long] = js.undefined
}
object ObjectCountByEncryptionType {
  
  @scala.inline
  def apply(): ObjectCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectCountByEncryptionType]
  }
  
  @scala.inline
  implicit class ObjectCountByEncryptionTypeMutableBuilder[Self <: ObjectCountByEncryptionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManaged(value: long): Self = StObject.set(x, "customerManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedUndefined: Self = StObject.set(x, "customerManaged", js.undefined)
    
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
