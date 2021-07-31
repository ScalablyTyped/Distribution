package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate. Example: arn:aws:rds:us-east-1::cert:rds-ca-2019 
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique key that identifies a certificate. Example: rds-ca-2019 
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the certificate. Example: CA 
    */
  var CertificateType: js.UndefOr[String] = js.undefined
  
  /**
    * The thumbprint of the certificate.
    */
  var Thumbprint: js.UndefOr[String] = js.undefined
  
  /**
    * The starting date-time from which the certificate is valid. Example: 2019-07-31T17:57:09Z 
    */
  var ValidFrom: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The date-time after which the certificate is no longer valid. Example: 2024-07-31T17:57:09Z 
    */
  var ValidTill: js.UndefOr[TStamp] = js.undefined
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
    def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCertificateType(value: String): Self = StObject.set(x, "CertificateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateTypeUndefined: Self = StObject.set(x, "CertificateType", js.undefined)
    
    @scala.inline
    def setThumbprint(value: String): Self = StObject.set(x, "Thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprintUndefined: Self = StObject.set(x, "Thumbprint", js.undefined)
    
    @scala.inline
    def setValidFrom(value: TStamp): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    @scala.inline
    def setValidTill(value: TStamp): Self = StObject.set(x, "ValidTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTillUndefined: Self = StObject.set(x, "ValidTill", js.undefined)
  }
}
