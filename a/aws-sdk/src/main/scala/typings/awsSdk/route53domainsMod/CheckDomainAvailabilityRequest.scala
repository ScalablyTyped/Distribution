package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDomainAvailabilityRequest extends js.Object {
  /**
    * The name of the domain that you want to get availability for. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
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

