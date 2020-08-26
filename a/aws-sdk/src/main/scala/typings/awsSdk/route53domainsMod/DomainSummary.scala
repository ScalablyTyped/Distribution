package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainSummary extends js.Object {
  /**
    * Indicates whether the domain is automatically renewed upon expiration.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain that the summary information applies to.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * Expiration date of the domain in Unix time format and Coordinated Universal Time (UTC).
    */
  var Expiry: js.UndefOr[Timestamp] = js.native
  /**
    * Indicates whether a domain is locked from unauthorized transfer to another party.
    */
  var TransferLock: js.UndefOr[Boolean] = js.native
}

object DomainSummary {
  @scala.inline
  def apply(DomainName: DomainName): DomainSummary = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
  @scala.inline
  implicit class DomainSummaryOps[Self <: DomainSummary] (val x: Self) extends AnyVal {
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
    def setAutoRenew(value: Boolean): Self = this.set("AutoRenew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRenew: Self = this.set("AutoRenew", js.undefined)
    @scala.inline
    def setExpiry(value: Timestamp): Self = this.set("Expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiry: Self = this.set("Expiry", js.undefined)
    @scala.inline
    def setTransferLock(value: Boolean): Self = this.set("TransferLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferLock: Self = this.set("TransferLock", js.undefined)
  }
  
}

