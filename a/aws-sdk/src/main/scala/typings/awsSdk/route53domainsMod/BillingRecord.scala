package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingRecord extends js.Object {
  
  /**
    * The date that the operation was billed, in Unix format.
    */
  var BillDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more information, see DNS Domain Name Format in the Amazon Route 53 Developer Guide.
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
  def apply(): BillingRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingRecord]
  }
  
  @scala.inline
  implicit class BillingRecordOps[Self <: BillingRecord] (val x: Self) extends AnyVal {
    
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
    def setBillDate(value: Timestamp): Self = this.set("BillDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillDate: Self = this.set("BillDate", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: InvoiceId): Self = this.set("InvoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceId: Self = this.set("InvoiceId", js.undefined)
    
    @scala.inline
    def setOperation(value: OperationType): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("Operation", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("Price", js.undefined)
  }
}
