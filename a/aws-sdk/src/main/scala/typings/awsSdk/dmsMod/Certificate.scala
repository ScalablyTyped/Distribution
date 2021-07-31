package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the certificate was created.
    */
  var CertificateCreationDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the certificate.
    */
  var CertificateOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.undefined
  
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typings.awsSdk.dmsMod.CertificateWallet] = js.undefined
  
  /**
    * The key length of the cryptographic algorithm being used.
    */
  var KeyLength: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The signing algorithm for the certificate.
    */
  var SigningAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * The beginning date that the certificate is valid.
    */
  var ValidFromDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The final date that the certificate is valid.
    */
  var ValidToDate: js.UndefOr[TStamp] = js.undefined
}
object Certificate {
  
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateCreationDate(value: TStamp): Self = StObject.set(x, "CertificateCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateCreationDateUndefined: Self = StObject.set(x, "CertificateCreationDate", js.undefined)
    
    @scala.inline
    def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCertificateOwner(value: String): Self = StObject.set(x, "CertificateOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateOwnerUndefined: Self = StObject.set(x, "CertificateOwner", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: String): Self = StObject.set(x, "CertificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "CertificatePem", js.undefined)
    
    @scala.inline
    def setCertificateWallet(value: CertificateWallet): Self = StObject.set(x, "CertificateWallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateWalletUndefined: Self = StObject.set(x, "CertificateWallet", js.undefined)
    
    @scala.inline
    def setKeyLength(value: IntegerOptional): Self = StObject.set(x, "KeyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLengthUndefined: Self = StObject.set(x, "KeyLength", js.undefined)
    
    @scala.inline
    def setSigningAlgorithm(value: String): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
    
    @scala.inline
    def setValidFromDate(value: TStamp): Self = StObject.set(x, "ValidFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromDateUndefined: Self = StObject.set(x, "ValidFromDate", js.undefined)
    
    @scala.inline
    def setValidToDate(value: TStamp): Self = StObject.set(x, "ValidToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidToDateUndefined: Self = StObject.set(x, "ValidToDate", js.undefined)
  }
}
