package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encryption extends StObject {
  
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3, for example AES256 or aws:kms.
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.glacierMod.EncryptionType] = js.native
  
  /**
    * Optional. If the encryption type is aws:kms, you can use this value to specify the encryption context for the job results.
    */
  var KMSContext: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. 
    */
  var KMSKeyId: js.UndefOr[String] = js.native
}
object Encryption {
  
  @scala.inline
  def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit class EncryptionMutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
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
