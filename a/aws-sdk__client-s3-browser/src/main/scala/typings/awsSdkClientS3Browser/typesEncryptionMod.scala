package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptionMod {
  
  @js.native
  trait Encryption extends StObject {
    
    /**
      * <p>The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).</p>
      */
    var EncryptionType: AES256 | awsColonkms | String = js.native
    
    /**
      * <p>If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.</p>
      */
    var KMSContext: js.UndefOr[String] = js.native
    
    /**
      * <p>If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.</p>
      */
    var KMSKeyId: js.UndefOr[String] = js.native
  }
  object Encryption {
    
    @scala.inline
    def apply(EncryptionType: AES256 | awsColonkms | String): Encryption = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encryption]
    }
    
    @scala.inline
    implicit class EncryptionMutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionType(value: AES256 | awsColonkms | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSContext(value: String): Self = StObject.set(x, "KMSContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSContextUndefined: Self = StObject.set(x, "KMSContext", js.undefined)
      
      @scala.inline
      def setKMSKeyId(value: String): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
    }
  }
  
  type UnmarshalledEncryption = Encryption
}
