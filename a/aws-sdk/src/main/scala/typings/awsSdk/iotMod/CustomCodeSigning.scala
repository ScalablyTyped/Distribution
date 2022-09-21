package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomCodeSigning extends StObject {
  
  /**
    * The certificate chain.
    */
  var certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.undefined
  
  /**
    * The hash algorithm used to code sign the file. You can use a string as the algorithm name if the target over-the-air (OTA) update devices are able to verify the signature that was generated using the same signature algorithm. For example, FreeRTOS uses SHA256 or SHA1, so you can pass either of them based on which was used for generating the signature.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
  
  /**
    * The signature for the file.
    */
  var signature: js.UndefOr[CodeSigningSignature] = js.undefined
  
  /**
    * The signature algorithm used to code sign the file. You can use a string as the algorithm name if the target over-the-air (OTA) update devices are able to verify the signature that was generated using the same signature algorithm. For example, FreeRTOS uses ECDSA or RSA, so you can pass either of them based on which was used for generating the signature.
    */
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined
}
object CustomCodeSigning {
  
  inline def apply(): CustomCodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomCodeSigning]
  }
  
  extension [Self <: CustomCodeSigning](x: Self) {
    
    inline def setCertificateChain(value: CodeSigningCertificateChain): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    inline def setHashAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setSignature(value: CodeSigningSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: SignatureAlgorithm): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
