package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketServerSideEncryptionByDefault extends StObject {
  
  /**
    * AWS KMS customer master key (CMK) ID to use for the default encryption.
    */
  var KMSMasterKeyID: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketServerSideEncryptionByDefault {
  
  inline def apply(): AwsS3BucketServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionByDefault]
  }
  
  extension [Self <: AwsS3BucketServerSideEncryptionByDefault](x: Self) {
    
    inline def setKMSMasterKeyID(value: NonEmptyString): Self = StObject.set(x, "KMSMasterKeyID", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIDUndefined: Self = StObject.set(x, "KMSMasterKeyID", js.undefined)
    
    inline def setSSEAlgorithm(value: NonEmptyString): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSEAlgorithmUndefined: Self = StObject.set(x, "SSEAlgorithm", js.undefined)
  }
}
