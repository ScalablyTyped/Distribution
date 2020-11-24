package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the Savings Plans.
    */
  var savingsPlans: js.UndefOr[SavingsPlanList] = js.native
}
object DescribeSavingsPlansResponse {
  
  @scala.inline
  def apply(): DescribeSavingsPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansResponse]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansResponseOps[Self <: DescribeSavingsPlansResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlansVarargs(value: SavingsPlan*): Self = this.set("savingsPlans", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlans(value: SavingsPlanList): Self = this.set("savingsPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlans: Self = this.set("savingsPlans", js.undefined)
  }
}
