package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServerSideEncryptionByDefaultMod {
  
  @js.native
  trait ServerSideEncryptionByDefault extends StObject {
    
    /**
      * <p>KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.</p>
      */
    var KMSMasterKeyID: js.UndefOr[String] = js.native
    
    /**
      * <p>Server-side encryption algorithm to use for the default encryption.</p>
      */
    var SSEAlgorithm: AES256 | awsColonkms | String = js.native
  }
  object ServerSideEncryptionByDefault {
    
    @scala.inline
    def apply(SSEAlgorithm: AES256 | awsColonkms | String): ServerSideEncryptionByDefault = {
      val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSideEncryptionByDefault]
    }
    
    @scala.inline
    implicit class ServerSideEncryptionByDefaultMutableBuilder[Self <: ServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKMSMasterKeyID(value: String): Self = StObject.set(x, "KMSMasterKeyID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyIDUndefined: Self = StObject.set(x, "KMSMasterKeyID", js.undefined)
      
      @scala.inline
      def setSSEAlgorithm(value: AES256 | awsColonkms | String): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledServerSideEncryptionByDefault = ServerSideEncryptionByDefault
}
