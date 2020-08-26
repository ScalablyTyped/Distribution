package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainContactPrivacyRequest extends js.Object {
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
  implicit class UpdateDomainContactPrivacyRequestOps[Self <: UpdateDomainContactPrivacyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdminPrivacy(value: Boolean): Self = this.set("AdminPrivacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminPrivacy: Self = this.set("AdminPrivacy", js.undefined)
    @scala.inline
    def setRegistrantPrivacy(value: Boolean): Self = this.set("RegistrantPrivacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrantPrivacy: Self = this.set("RegistrantPrivacy", js.undefined)
    @scala.inline
    def setTechPrivacy(value: Boolean): Self = this.set("TechPrivacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTechPrivacy: Self = this.set("TechPrivacy", js.undefined)
  }
  
}

