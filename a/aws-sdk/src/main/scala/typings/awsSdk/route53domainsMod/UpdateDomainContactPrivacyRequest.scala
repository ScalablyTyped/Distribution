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
  def apply(
    DomainName: DomainName,
    AdminPrivacy: js.UndefOr[scala.Boolean] = js.undefined,
    RegistrantPrivacy: js.UndefOr[scala.Boolean] = js.undefined,
    TechPrivacy: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateDomainContactPrivacyRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(AdminPrivacy)) __obj.updateDynamic("AdminPrivacy")(AdminPrivacy.asInstanceOf[js.Any])
    if (!js.isUndefined(RegistrantPrivacy)) __obj.updateDynamic("RegistrantPrivacy")(RegistrantPrivacy.asInstanceOf[js.Any])
    if (!js.isUndefined(TechPrivacy)) __obj.updateDynamic("TechPrivacy")(TechPrivacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactPrivacyRequest]
  }
}

