package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterDomainRequest extends StObject {
  
  /**
    * Provides detailed contact information. For information about the values that you specify for each element, see ContactDetail.
    */
  var AdminContact: ContactDetail = js.native
  
  /**
    * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true 
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  
  /**
    * The domain name that you want to register. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.   Internationalized domain names are not supported for some top-level domains. To determine whether the TLD that you want to use supports internationalized domain names, see Domains that You Can Register with Amazon Route 53. For more information, see Formatting Internationalized Domain Names. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: typings.awsSdk.route53domainsMod.DurationInYears = js.native
  
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact. Default: true 
    */
  var PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (the domain owner). Default: true 
    */
  var PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact. Default: true 
    */
  var PrivacyProtectTechContact: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides detailed contact information. For information about the values that you specify for each element, see ContactDetail.
    */
  var RegistrantContact: ContactDetail = js.native
  
  /**
    * Provides detailed contact information. For information about the values that you specify for each element, see ContactDetail.
    */
  var TechContact: ContactDetail = js.native
}
object RegisterDomainRequest {
  
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    DurationInYears: DurationInYears,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail
  ): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DurationInYears = DurationInYears.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainRequest]
  }
  
  @scala.inline
  implicit class RegisterDomainRequestMutableBuilder[Self <: RegisterDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminContact(value: ContactDetail): Self = StObject.set(x, "AdminContact", value.asInstanceOf[js.Any])
    
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
