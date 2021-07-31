package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBonusPaymentsResponse extends StObject {
  
  /**
    * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects. 
    */
  var BonusPayments: js.UndefOr[BonusPaymentList] = js.undefined
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus payments being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}
object ListBonusPaymentsResponse {
  
  @scala.inline
  def apply(): ListBonusPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBonusPaymentsResponse]
  }
  
  @scala.inline
  implicit class ListBonusPaymentsResponseMutableBuilder[Self <: ListBonusPaymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBonusPayments(value: BonusPaymentList): Self = StObject.set(x, "BonusPayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonusPaymentsUndefined: Self = StObject.set(x, "BonusPayments", js.undefined)
    
    @scala.inline
    def setBonusPaymentsVarargs(value: BonusPayment*): Self = StObject.set(x, "BonusPayments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
  }
}
