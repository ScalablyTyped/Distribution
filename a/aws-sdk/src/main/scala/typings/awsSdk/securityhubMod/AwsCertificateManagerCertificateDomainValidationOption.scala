package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateDomainValidationOption extends js.Object {
  
  /**
    * A fully qualified domain name (FQDN) in the certificate.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The CNAME record that is added to the DNS database for domain validation.
    */
  var ResourceRecord: js.UndefOr[AwsCertificateManagerCertificateResourceRecord] = js.native
  
  /**
    * The domain name that AWS Certificate Manager uses to send domain validation emails.
    */
  var ValidationDomain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
    */
  var ValidationEmails: js.UndefOr[StringList] = js.native
  
  /**
    * The method used to validate the domain name.
    */
  var ValidationMethod: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The validation status of the domain name.
    */
  var ValidationStatus: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateDomainValidationOption {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateDomainValidationOption]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateDomainValidationOptionOps[Self <: AwsCertificateManagerCertificateDomainValidationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setResourceRecord(value: AwsCertificateManagerCertificateResourceRecord): Self = this.set("ResourceRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecord: Self = this.set("ResourceRecord", js.undefined)
    
    @scala.inline
    def setValidationDomain(value: NonEmptyString): Self = this.set("ValidationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationDomain: Self = this.set("ValidationDomain", js.undefined)
    
    @scala.inline
    def setValidationEmailsVarargs(value: NonEmptyString*): Self = this.set("ValidationEmails", js.Array(value :_*))
    
    @scala.inline
    def setValidationEmails(value: StringList): Self = this.set("ValidationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationEmails: Self = this.set("ValidationEmails", js.undefined)
    
    @scala.inline
    def setValidationMethod(value: NonEmptyString): Self = this.set("ValidationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMethod: Self = this.set("ValidationMethod", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: NonEmptyString): Self = this.set("ValidationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationStatus: Self = this.set("ValidationStatus", js.undefined)
  }
}
