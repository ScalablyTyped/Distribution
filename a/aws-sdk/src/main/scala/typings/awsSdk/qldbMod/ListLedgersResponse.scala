package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLedgersResponse extends js.Object {
  
  /**
    * The array of ledger summaries that are associated with the current AWS account and Region.
    */
  var Ledgers: js.UndefOr[LedgerList] = js.native
  
  /**
    * A pagination token, indicating whether there are more results available:   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListLedgers call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.native
}
object ListLedgersResponse {
  
  @scala.inline
  def apply(): ListLedgersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLedgersResponse]
  }
  
  @scala.inline
  implicit class ListLedgersResponseOps[Self <: ListLedgersResponse] (val x: Self) extends AnyVal {
    
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
    def setLedgersVarargs(value: LedgerSummary*): Self = this.set("Ledgers", js.Array(value :_*))
    
    @scala.inline
    def setLedgers(value: LedgerList): Self = this.set("Ledgers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLedgers: Self = this.set("Ledgers", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
