package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingRecord extends StObject {
  
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
  implicit class BillingRecordMutableBuilder[Self <: BillingRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillDate(value: Timestamp): Self = StObject.set(x, "BillDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillDateUndefined: Self = StObject.set(x, "BillDate", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: InvoiceId): Self = StObject.set(x, "InvoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdUndefined: Self = StObject.set(x, "InvoiceId", js.undefined)
    
    @scala.inline
    def setOperation(value: OperationType): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "Price", js.undefined)
  }
}
