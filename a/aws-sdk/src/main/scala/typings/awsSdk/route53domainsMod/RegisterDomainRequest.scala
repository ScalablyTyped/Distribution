package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDomainRequest extends js.Object {
  /**
    * Provides detailed contact information.
    */
  var AdminContact: ContactDetail = js.native
  /**
    * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true 
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  /**
    * The domain name that you want to register. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
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
    * Provides detailed contact information.
    */
  var RegistrantContact: ContactDetail = js.native
  /**
    * Provides detailed contact information.
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
    TechContact: ContactDetail,
    AutoRenew: js.UndefOr[scala.Boolean] = js.undefined,
    IdnLangCode: LangCode = null,
    PrivacyProtectAdminContact: js.UndefOr[scala.Boolean] = js.undefined,
    PrivacyProtectRegistrantContact: js.UndefOr[scala.Boolean] = js.undefined,
    PrivacyProtectTechContact: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DurationInYears = DurationInYears.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoRenew)) __obj.updateDynamic("AutoRenew")(AutoRenew.asInstanceOf[js.Any])
    if (IdnLangCode != null) __obj.updateDynamic("IdnLangCode")(IdnLangCode.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivacyProtectAdminContact)) __obj.updateDynamic("PrivacyProtectAdminContact")(PrivacyProtectAdminContact.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivacyProtectRegistrantContact)) __obj.updateDynamic("PrivacyProtectRegistrantContact")(PrivacyProtectRegistrantContact.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivacyProtectTechContact)) __obj.updateDynamic("PrivacyProtectTechContact")(PrivacyProtectTechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainRequest]
  }
}

