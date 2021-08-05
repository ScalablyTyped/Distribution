package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningConfiguration extends StObject {
  
  /**
    * The encryption algorithm options that are available for a code signing job.
    */
  var encryptionAlgorithmOptions: EncryptionAlgorithmOptions
  
  /**
    * The hash algorithm options that are available for a code signing job.
    */
  var hashAlgorithmOptions: HashAlgorithmOptions
}
object SigningConfiguration {
  
  inline def apply(encryptionAlgorithmOptions: EncryptionAlgorithmOptions, hashAlgorithmOptions: HashAlgorithmOptions): SigningConfiguration = {
    val __obj = js.Dynamic.literal(encryptionAlgorithmOptions = encryptionAlgorithmOptions.asInstanceOf[js.Any], hashAlgorithmOptions = hashAlgorithmOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningConfiguration]
  }
  
  extension [Self <: SigningConfiguration](x: Self) {
    
    inline def setEncryptionAlgorithmOptions(value: EncryptionAlgorithmOptions): Self = StObject.set(x, "encryptionAlgorithmOptions", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmOptions(value: HashAlgorithmOptions): Self = StObject.set(x, "hashAlgorithmOptions", value.asInstanceOf[js.Any])
  }
}
