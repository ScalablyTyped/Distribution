package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDomainAvailabilityRequest extends js.Object {
  /**
    * The name of the domain that you want to get availability for. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.   Internationalized domain names are not supported for some top-level domains. To determine whether the TLD that you want to use supports internationalized domain names, see Domains that You Can Register with Amazon Route 53. For more information, see Formatting Internationalized Domain Names. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.native
}

object CheckDomainAvailabilityRequest {
  @scala.inline
  def apply(DomainName: DomainName, IdnLangCode: LangCode = null): CheckDomainAvailabilityRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (IdnLangCode != null) __obj.updateDynamic("IdnLangCode")(IdnLangCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainAvailabilityRequest]
  }
}

