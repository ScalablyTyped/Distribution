package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCertificate extends StObject {
  
  /**
    * The contents of the public key certificate.
    */
  var CertificateBody: certificateBodyType
  
  /**
    * The contents of the public key certificate chain.
    */
  var CertificateChain: js.UndefOr[certificateChainType] = js.undefined
  
  /**
    * The meta information of the server certificate, such as its name, path, ID, and ARN.
    */
  var ServerCertificateMetadata: typings.awsSdk.iamMod.ServerCertificateMetadata
}
object ServerCertificate {
  
  @scala.inline
  def apply(CertificateBody: certificateBodyType, ServerCertificateMetadata: ServerCertificateMetadata): ServerCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], ServerCertificateMetadata = ServerCertificateMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificate]
  }
  
  @scala.inline
  implicit class ServerCertificateMutableBuilder[Self <: ServerCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateBody(value: certificateBodyType): Self = StObject.set(x, "CertificateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChain(value: certificateChainType): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    @scala.inline
    def setServerCertificateMetadata(value: ServerCertificateMetadata): Self = StObject.set(x, "ServerCertificateMetadata", value.asInstanceOf[js.Any])
  }
}
