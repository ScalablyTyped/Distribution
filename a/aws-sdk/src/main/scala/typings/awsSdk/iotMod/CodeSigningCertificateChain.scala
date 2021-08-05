package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSigningCertificateChain extends StObject {
  
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.undefined
  
  /**
    * A base64 encoded binary representation of the code signing certificate chain.
    */
  var inlineDocument: js.UndefOr[InlineDocument] = js.undefined
}
object CodeSigningCertificateChain {
  
  inline def apply(): CodeSigningCertificateChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningCertificateChain]
  }
  
  extension [Self <: CodeSigningCertificateChain](x: Self) {
    
    inline def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    inline def setInlineDocument(value: InlineDocument): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    inline def setInlineDocumentUndefined: Self = StObject.set(x, "inlineDocument", js.undefined)
  }
}
