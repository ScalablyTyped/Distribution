package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeSigningCertificateChain extends StObject {
  
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.native
  
  /**
    * A base64 encoded binary representation of the code signing certificate chain.
    */
  var inlineDocument: js.UndefOr[InlineDocument] = js.native
}
object CodeSigningCertificateChain {
  
  @scala.inline
  def apply(): CodeSigningCertificateChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningCertificateChain]
  }
  
  @scala.inline
  implicit class CodeSigningCertificateChainMutableBuilder[Self <: CodeSigningCertificateChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    @scala.inline
    def setInlineDocument(value: InlineDocument): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineDocumentUndefined: Self = StObject.set(x, "inlineDocument", js.undefined)
  }
}
