package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBonusPaymentsResponse extends js.Object {
  
  /**
    * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects. 
    */
  var BonusPayments: js.UndefOr[BonusPaymentList] = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus payments being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
}
object ListBonusPaymentsResponse {
  
  @scala.inline
  def apply(): ListBonusPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBonusPaymentsResponse]
  }
  
  @scala.inline
  implicit class ListBonusPaymentsResponseOps[Self <: ListBonusPaymentsResponse] (val x: Self) extends AnyVal {
    
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
    def setBonusPaymentsVarargs(value: BonusPayment*): Self = this.set("BonusPayments", js.Array(value :_*))
    
    @scala.inline
    def setBonusPayments(value: BonusPaymentList): Self = this.set("BonusPayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBonusPayments: Self = this.set("BonusPayments", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = this.set("NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumResults: Self = this.set("NumResults", js.undefined)
  }
}
