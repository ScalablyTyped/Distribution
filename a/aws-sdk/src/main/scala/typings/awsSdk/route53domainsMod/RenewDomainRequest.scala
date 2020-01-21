package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewDomainRequest extends js.Object {
  /**
    * The year when the registration for the domain is set to expire. This value must match the current expiration date for the domain.
    */
  var CurrentExpiryYear: typings.awsSdk.route53domainsMod.CurrentExpiryYear = js.native
  /**
    * The name of the domain that you want to renew.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: js.UndefOr[typings.awsSdk.route53domainsMod.DurationInYears] = js.native
}

object RenewDomainRequest {
  @scala.inline
  def apply(CurrentExpiryYear: CurrentExpiryYear, DomainName: DomainName, DurationInYears: Int | Double = null): RenewDomainRequest = {
    val __obj = js.Dynamic.literal(CurrentExpiryYear = CurrentExpiryYear.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    if (DurationInYears != null) __obj.updateDynamic("DurationInYears")(DurationInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewDomainRequest]
  }
}

