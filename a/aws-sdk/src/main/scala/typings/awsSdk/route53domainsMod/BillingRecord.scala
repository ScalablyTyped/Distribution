package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingRecord extends js.Object {
  /**
    * The date that the operation was billed, in Unix format.
    */
  var BillDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more information, see DNS Domain Name Format in the Amazon Route 53 Developer Guidezzz.
    */
  var DomainName: js.UndefOr[typings.awsSdk.route53domainsMod.DomainName] = js.native
  /**
    * The ID of the invoice that is associated with the billing record.
    */
  var InvoiceId: js.UndefOr[typings.awsSdk.route53domainsMod.InvoiceId] = js.native
  /**
    * The operation that you were charged for.
    */
  var Operation: js.UndefOr[OperationType] = js.native
  /**
    * The price that you were charged for the operation, in US dollars. Example value: 12.0
    */
  var Price: js.UndefOr[typings.awsSdk.route53domainsMod.Price] = js.native
}

object BillingRecord {
  @scala.inline
  def apply(
    BillDate: Timestamp = null,
    DomainName: DomainName = null,
    InvoiceId: InvoiceId = null,
    Operation: OperationType = null,
    Price: Int | Double = null
  ): BillingRecord = {
    val __obj = js.Dynamic.literal()
    if (BillDate != null) __obj.updateDynamic("BillDate")(BillDate.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (InvoiceId != null) __obj.updateDynamic("InvoiceId")(InvoiceId.asInstanceOf[js.Any])
    if (Operation != null) __obj.updateDynamic("Operation")(Operation.asInstanceOf[js.Any])
    if (Price != null) __obj.updateDynamic("Price")(Price.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingRecord]
  }
}

