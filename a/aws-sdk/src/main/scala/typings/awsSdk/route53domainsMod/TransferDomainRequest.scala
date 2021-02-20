package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferDomainRequest extends StObject {
  
  /**
    * Provides detailed contact information.
    */
  var AdminContact: ContactDetail = js.native
  
  /**
    * The authorization code for the domain. You get this value from the current registrar.
    */
  var AuthCode: js.UndefOr[DomainAuthCode] = js.native
  
  /**
    * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.  
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. Default: 1
    */
  var DurationInYears: typings.awsSdk.route53domainsMod.DurationInYears = js.native
  
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.native
  
  /**
    * Contains details for the host and glue IP addresses.
    */
  var Nameservers: js.UndefOr[NameserverList] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact. Default: true 
    */
  var PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (domain owner). Default: true 
    */
  var PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact. Default: true 
    */
  var PrivacyProtectTechContact: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: ContactDetail = js.native
  
  /**
    * Provides detailed contact information.
    */
  var TechContact: ContactDetail = js.native
}
object TransferDomainRequest {
  
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    DurationInYears: DurationInYears,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail
  ): TransferDomainRequest = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DurationInYears = DurationInYears.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDomainRequest]
  }
  
  @scala.inline
  implicit class TransferDomainRequestMutableBuilder[Self <: TransferDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminContact(value: ContactDetail): Self = StObject.set(x, "AdminContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCode(value: DomainAuthCode): Self = StObject.set(x, "AuthCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCodeUndefined: Self = StObject.set(x, "AuthCode", js.undefined)
    
    @scala.inline
    def setAutoRenew(value: Boolean): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInYears(value: DurationInYears): Self = StObject.set(x, "DurationInYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdnLangCode(value: LangCode): Self = StObject.set(x, "IdnLangCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdnLangCodeUndefined: Self = StObject.set(x, "IdnLangCode", js.undefined)
    
    @scala.inline
    def setNameservers(value: NameserverList): Self = StObject.set(x, "Nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameserversUndefined: Self = StObject.set(x, "Nameservers", js.undefined)
    
    @scala.inline
    def setNameserversVarargs(value: Nameserver*): Self = StObject.set(x, "Nameservers", js.Array(value :_*))
    
    @scala.inline
    def setPrivacyProtectAdminContact(value: Boolean): Self = StObject.set(x, "PrivacyProtectAdminContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyProtectAdminContactUndefined: Self = StObject.set(x, "PrivacyProtectAdminContact", js.undefined)
    
    @scala.inline
    def setPrivacyProtectRegistrantContact(value: Boolean): Self = StObject.set(x, "PrivacyProtectRegistrantContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyProtectRegistrantContactUndefined: Self = StObject.set(x, "PrivacyProtectRegistrantContact", js.undefined)
    
    @scala.inline
    def setPrivacyProtectTechContact(value: Boolean): Self = StObject.set(x, "PrivacyProtectTechContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyProtectTechContactUndefined: Self = StObject.set(x, "PrivacyProtectTechContact", js.undefined)
    
    @scala.inline
    def setRegistrantContact(value: ContactDetail): Self = StObject.set(x, "RegistrantContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechContact(value: ContactDetail): Self = StObject.set(x, "TechContact", value.asInstanceOf[js.Any])
  }
}
