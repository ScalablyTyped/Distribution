package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServerSideEncryptionByDefaultMod {
  
  trait ServerSideEncryptionByDefault extends StObject {
    
    /**
      * <p>KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.</p>
      */
    var KMSMasterKeyID: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Server-side encryption algorithm to use for the default encryption.</p>
      */
    var SSEAlgorithm: AES256 | awsColonkms | String
  }
  object ServerSideEncryptionByDefault {
    
    inline def apply(SSEAlgorithm: AES256 | awsColonkms | String): ServerSideEncryptionByDefault = {
      val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSideEncryptionByDefault]
    }
    
    extension [Self <: ServerSideEncryptionByDefault](x: Self) {
      
      inline def setKMSMasterKeyID(value: String): Self = StObject.set(x, "KMSMasterKeyID", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyIDUndefined: Self = StObject.set(x, "KMSMasterKeyID", js.undefined)
      
      inline def setSSEAlgorithm(value: AES256 | awsColonkms | String): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledServerSideEncryptionByDefault = ServerSideEncryptionByDefault
}
