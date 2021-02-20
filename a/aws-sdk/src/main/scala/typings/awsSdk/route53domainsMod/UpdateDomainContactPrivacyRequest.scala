package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainContactPrivacyRequest extends StObject {
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact.
    */
  var AdminPrivacy: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain that you want to update the privacy setting for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (domain owner).
    */
  var RegistrantPrivacy: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact.
    */
  var TechPrivacy: js.UndefOr[Boolean] = js.native
}
object UpdateDomainContactPrivacyRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): UpdateDomainContactPrivacyRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactPrivacyRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainContactPrivacyRequestMutableBuilder[Self <: UpdateDomainContactPrivacyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminPrivacy(value: Boolean): Self = StObject.set(x, "AdminPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminPrivacyUndefined: Self = StObject.set(x, "AdminPrivacy", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrantPrivacy(value: Boolean): Self = StObject.set(x, "RegistrantPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrantPrivacyUndefined: Self = StObject.set(x, "RegistrantPrivacy", js.undefined)
    
    @scala.inline
    def setTechPrivacy(value: Boolean): Self = StObject.set(x, "TechPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechPrivacyUndefined: Self = StObject.set(x, "TechPrivacy", js.undefined)
  }
}
