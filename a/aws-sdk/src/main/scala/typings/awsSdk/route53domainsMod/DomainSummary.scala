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
    * Expiration date of the domain in Coordinated Universal Time (UTC).
    */
  var Expiry: js.UndefOr[Timestamp] = js.native
  /**
    * Indicates whether a domain is locked from unauthorized transfer to another party.
    */
  var TransferLock: js.UndefOr[Boolean] = js.native
}

object DomainSummary {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AutoRenew: js.UndefOr[scala.Boolean] = js.undefined,
    Expiry: Timestamp = null,
    TransferLock: js.UndefOr[scala.Boolean] = js.undefined
  ): DomainSummary = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoRenew)) __obj.updateDynamic("AutoRenew")(AutoRenew.asInstanceOf[js.Any])
    if (Expiry != null) __obj.updateDynamic("Expiry")(Expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(TransferLock)) __obj.updateDynamic("TransferLock")(TransferLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
}

