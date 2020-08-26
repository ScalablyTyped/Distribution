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
  def apply(CurrentExpiryYear: CurrentExpiryYear, DomainName: DomainName): RenewDomainRequest = {
    val __obj = js.Dynamic.literal(CurrentExpiryYear = CurrentExpiryYear.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewDomainRequest]
  }
  @scala.inline
  implicit class RenewDomainRequestOps[Self <: RenewDomainRequest] (val x: Self) extends AnyVal {
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
    def setCurrentExpiryYear(value: CurrentExpiryYear): Self = this.set("CurrentExpiryYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationInYears(value: DurationInYears): Self = this.set("DurationInYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInYears: Self = this.set("DurationInYears", js.undefined)
  }
  
}

