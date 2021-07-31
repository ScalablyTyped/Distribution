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
    * The hash algorithm used to code sign the file.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
  
  /**
    * The signature for the file.
    */
  var signature: js.UndefOr[CodeSigningSignature] = js.undefined
  
  /**
    * The signature algorithm used to code sign the file.
    */
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined
}
object CustomCodeSigning {
  
  @scala.inline
  def apply(): CustomCodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomCodeSigning]
  }
  
  @scala.inline
  implicit class CustomCodeSigningMutableBuilder[Self <: CustomCodeSigning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: CodeSigningCertificateChain): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    @scala.inline
    def setHashAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    @scala.inline
    def setSignature(value: CodeSigningSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithm(value: SignatureAlgorithm): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
