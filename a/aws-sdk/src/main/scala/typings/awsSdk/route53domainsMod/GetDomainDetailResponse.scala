package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainDetailResponse extends StObject {
  
  /**
    * Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
    */
  var AbuseContactEmail: js.UndefOr[Email] = js.native
  
  /**
    * Phone number for reporting abuse.
    */
  var AbuseContactPhone: js.UndefOr[ContactNumber] = js.native
  
  /**
    * Provides details about the domain administrative contact.
    */
  var AdminContact: ContactDetail = js.native
  
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the admin contact.
    */
  var AdminPrivacy: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the domain registration is set to renew automatically.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  
  /**
    * The date when the domain was created as found in the response to a WHOIS query. The date and time is in Unix time format and Coordinated Universal time (UTC).
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * Reserved for future use.
    */
  var DnsSec: js.UndefOr[DNSSec] = js.native
  
  /**
    * The name of a domain.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * The date when the registration for the domain is set to expire. The date and time is in Unix time format and Coordinated Universal time (UTC).
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the domain.
    */
  var Nameservers: NameserverList = js.native
  
  /**
    * Provides details about the domain registrant.
    */
  var RegistrantContact: ContactDetail = js.native
  
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the registrant contact (domain owner).
    */
  var RegistrantPrivacy: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the registrar of the domain as identified in the registry. Domains with a .com, .net, or .org TLD are registered by Amazon Registrar. All other domains are registered by our registrar associate, Gandi. The value for domains that are registered by Gandi is "GANDI SAS". 
    */
  var RegistrarName: js.UndefOr[typings.awsSdk.route53domainsMod.RegistrarName] = js.native
  
  /**
    * Web address of the registrar.
    */
  var RegistrarUrl: js.UndefOr[typings.awsSdk.route53domainsMod.RegistrarUrl] = js.native
  
  /**
    * Reserved for future use.
    */
  var RegistryDomainId: js.UndefOr[typings.awsSdk.route53domainsMod.RegistryDomainId] = js.native
  
  /**
    * Reseller of the domain. Domains registered or transferred using Route 53 domains will have "Amazon" as the reseller. 
    */
  var Reseller: js.UndefOr[typings.awsSdk.route53domainsMod.Reseller] = js.native
  
  /**
    * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes. ICANN, the organization that maintains a central database of domain names, has developed a set of domain name status codes that tell you the status of a variety of operations on a domain name, for example, registering a domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so on. All registrars use this same set of status codes. For a current list of domain name status codes and an explanation of what each code means, go to the ICANN website and search for epp status codes. (Search on the ICANN website; web searches sometimes return an old version of the document.)
    */
  var StatusList: js.UndefOr[DomainStatusList] = js.native
  
  /**
    * Provides details about the domain technical contact.
    */
  var TechContact: ContactDetail = js.native
  
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the technical contact.
    */
  var TechPrivacy: js.UndefOr[Boolean] = js.native
  
  /**
    * The last updated date of the domain as found in the response to a WHOIS query. The date and time is in Unix time format and Coordinated Universal time (UTC).
    */
  var UpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
    */
  var WhoIsServer: js.UndefOr[RegistrarWhoIsServer] = js.native
}
object GetDomainDetailResponse {
  
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    Nameservers: NameserverList,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail
  ): GetDomainDetailResponse = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDetailResponse]
  }
  
  @scala.inline
  implicit class GetDomainDetailResponseMutableBuilder[Self <: GetDomainDetailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbuseContactEmail(value: Email): Self = StObject.set(x, "AbuseContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbuseContactEmailUndefined: Self = StObject.set(x, "AbuseContactEmail", js.undefined)
    
    @scala.inline
    def setAbuseContactPhone(value: ContactNumber): Self = StObject.set(x, "AbuseContactPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbuseContactPhoneUndefined: Self = StObject.set(x, "AbuseContactPhone", js.undefined)
    
    @scala.inline
    def setAdminContact(value: ContactDetail): Self = StObject.set(x, "AdminContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminPrivacy(value: Boolean): Self = StObject.set(x, "AdminPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminPrivacyUndefined: Self = StObject.set(x, "AdminPrivacy", js.undefined)
    
    @scala.inline
    def setAutoRenew(value: Boolean): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDnsSec(value: DNSSec): Self = StObject.set(x, "DnsSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSecUndefined: Self = StObject.set(x, "DnsSec", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    @scala.inline
    def setNameservers(value: NameserverList): Self = StObject.set(x, "Nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameserversVarargs(value: Nameserver*): Self = StObject.set(x, "Nameservers", js.Array(value :_*))
    
    @scala.inline
    def setRegistrantContact(value: ContactDetail): Self = StObject.set(x, "RegistrantContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrantPrivacy(value: Boolean): Self = StObject.set(x, "RegistrantPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrantPrivacyUndefined: Self = StObject.set(x, "RegistrantPrivacy", js.undefined)
    
    @scala.inline
    def setRegistrarName(value: RegistrarName): Self = StObject.set(x, "RegistrarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrarNameUndefined: Self = StObject.set(x, "RegistrarName", js.undefined)
    
    @scala.inline
    def setRegistrarUrl(value: RegistrarUrl): Self = StObject.set(x, "RegistrarUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrarUrlUndefined: Self = StObject.set(x, "RegistrarUrl", js.undefined)
    
    @scala.inline
    def setRegistryDomainId(value: RegistryDomainId): Self = StObject.set(x, "RegistryDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryDomainIdUndefined: Self = StObject.set(x, "RegistryDomainId", js.undefined)
    
    @scala.inline
    def setReseller(value: Reseller): Self = StObject.set(x, "Reseller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResellerUndefined: Self = StObject.set(x, "Reseller", js.undefined)
    
    @scala.inline
    def setStatusList(value: DomainStatusList): Self = StObject.set(x, "StatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusListUndefined: Self = StObject.set(x, "StatusList", js.undefined)
    
    @scala.inline
    def setStatusListVarargs(value: DomainStatus*): Self = StObject.set(x, "StatusList", js.Array(value :_*))
    
    @scala.inline
    def setTechContact(value: ContactDetail): Self = StObject.set(x, "TechContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechPrivacy(value: Boolean): Self = StObject.set(x, "TechPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechPrivacyUndefined: Self = StObject.set(x, "TechPrivacy", js.undefined)
    
    @scala.inline
    def setUpdatedDate(value: Timestamp): Self = StObject.set(x, "UpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDateUndefined: Self = StObject.set(x, "UpdatedDate", js.undefined)
    
    @scala.inline
    def setWhoIsServer(value: RegistrarWhoIsServer): Self = StObject.set(x, "WhoIsServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhoIsServerUndefined: Self = StObject.set(x, "WhoIsServer", js.undefined)
  }
}
