package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRequestedServiceQuotaChangeHistoryByQuotaResponse extends js.Object {
  
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicequotasMod.NextToken] = js.native
  
  /**
    * Returns a list of service quota requests.
    */
  var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.native
}
object ListRequestedServiceQuotaChangeHistoryByQuotaResponse {
  
  @scala.inline
  def apply(): ListRequestedServiceQuotaChangeHistoryByQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryByQuotaResponse]
  }
  
  @scala.inline
  implicit class ListRequestedServiceQuotaChangeHistoryByQuotaResponseOps[Self <: ListRequestedServiceQuotaChangeHistoryByQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRequestedQuotasVarargs(value: RequestedServiceQuotaChange*): Self = this.set("RequestedQuotas", js.Array(value :_*))
    
    @scala.inline
    def setRequestedQuotas(value: RequestedServiceQuotaChangeHistoryListDefinition): Self = this.set("RequestedQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedQuotas: Self = this.set("RequestedQuotas", js.undefined)
  }
}
