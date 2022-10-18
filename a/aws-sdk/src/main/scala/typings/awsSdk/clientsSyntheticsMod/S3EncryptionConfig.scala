package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3EncryptionConfig extends StObject {
  
  /**
    *  The encryption method to use for artifacts created by this canary. Specify SSE_S3 to use server-side encryption (SSE) with an Amazon S3-managed key. Specify SSE-KMS to use server-side encryption with a customer-managed KMS key. If you omit this parameter, an Amazon Web Services-managed KMS key is used. 
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.EncryptionMode] = js.undefined
  
  /**
    * The ARN of the customer-managed KMS key to use, if you specify SSE-KMS for EncryptionMode 
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.KmsKeyArn] = js.undefined
}
object S3EncryptionConfig {
  
  inline def apply(): S3EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3EncryptionConfig]
  }
  
  extension [Self <: S3EncryptionConfig](x: Self) {
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
