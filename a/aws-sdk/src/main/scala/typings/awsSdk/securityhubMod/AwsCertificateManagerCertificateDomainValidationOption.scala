package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateDomainValidationOption extends StObject {
  
  /**
    * A fully qualified domain name (FQDN) in the certificate.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The CNAME record that is added to the DNS database for domain validation.
    */
  var ResourceRecord: js.UndefOr[AwsCertificateManagerCertificateResourceRecord] = js.undefined
  
  /**
    * The domain name that AWS Certificate Manager uses to send domain validation emails.
    */
  var ValidationDomain: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
    */
  var ValidationEmails: js.UndefOr[StringList] = js.undefined
  
  /**
    * The method used to validate the domain name.
    */
  var ValidationMethod: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The validation status of the domain name.
    */
  var ValidationStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateDomainValidationOption {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateDomainValidationOption]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateDomainValidationOptionMutableBuilder[Self <: AwsCertificateManagerCertificateDomainValidationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setResourceRecord(value: AwsCertificateManagerCertificateResourceRecord): Self = StObject.set(x, "ResourceRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordUndefined: Self = StObject.set(x, "ResourceRecord", js.undefined)
    
    @scala.inline
    def setValidationDomain(value: NonEmptyString): Self = StObject.set(x, "ValidationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationDomainUndefined: Self = StObject.set(x, "ValidationDomain", js.undefined)
    
    @scala.inline
    def setValidationEmails(value: StringList): Self = StObject.set(x, "ValidationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationEmailsUndefined: Self = StObject.set(x, "ValidationEmails", js.undefined)
    
    @scala.inline
    def setValidationEmailsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ValidationEmails", js.Array(value :_*))
    
    @scala.inline
    def setValidationMethod(value: NonEmptyString): Self = StObject.set(x, "ValidationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMethodUndefined: Self = StObject.set(x, "ValidationMethod", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: NonEmptyString): Self = StObject.set(x, "ValidationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStatusUndefined: Self = StObject.set(x, "ValidationStatus", js.undefined)
  }
}
