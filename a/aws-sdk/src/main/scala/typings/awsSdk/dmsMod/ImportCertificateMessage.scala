package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateMessage extends StObject {
  
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: String
  
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.undefined
  
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typings.awsSdk.dmsMod.CertificateWallet] = js.undefined
  
  /**
    * The tags associated with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportCertificateMessage {
  
  @scala.inline
  def apply(CertificateIdentifier: String): ImportCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateIdentifier = CertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateMessage]
  }
  
  @scala.inline
  implicit class ImportCertificateMessageMutableBuilder[Self <: ImportCertificateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePem(value: String): Self = StObject.set(x, "CertificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "CertificatePem", js.undefined)
    
    @scala.inline
    def setCertificateWallet(value: CertificateWallet): Self = StObject.set(x, "CertificateWallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateWalletUndefined: Self = StObject.set(x, "CertificateWallet", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
