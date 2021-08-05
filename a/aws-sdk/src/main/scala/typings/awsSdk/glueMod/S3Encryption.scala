package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Encryption extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.undefined
  
  /**
    * The encryption mode to use for Amazon S3 data.
    */
  var S3EncryptionMode: js.UndefOr[typings.awsSdk.glueMod.S3EncryptionMode] = js.undefined
}
object S3Encryption {
  
  inline def apply(): S3Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Encryption]
  }
  
  extension [Self <: S3Encryption](x: Self) {
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setS3EncryptionMode(value: S3EncryptionMode): Self = StObject.set(x, "S3EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionModeUndefined: Self = StObject.set(x, "S3EncryptionMode", js.undefined)
  }
}
