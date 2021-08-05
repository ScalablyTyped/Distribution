package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutKMSEncryptionKeyRequest extends StObject {
  
  /**
    * The KMS encryption key ARN.
    */
  var kmsEncryptionKeyArn: KmsEncryptionKeyArn
}
object PutKMSEncryptionKeyRequest {
  
  inline def apply(kmsEncryptionKeyArn: KmsEncryptionKeyArn): PutKMSEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal(kmsEncryptionKeyArn = kmsEncryptionKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKMSEncryptionKeyRequest]
  }
  
  extension [Self <: PutKMSEncryptionKeyRequest](x: Self) {
    
    inline def setKmsEncryptionKeyArn(value: KmsEncryptionKeyArn): Self = StObject.set(x, "kmsEncryptionKeyArn", value.asInstanceOf[js.Any])
  }
}
