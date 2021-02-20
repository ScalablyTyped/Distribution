package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLedgersResponse extends StObject {
  
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
  implicit class ListLedgersResponseMutableBuilder[Self <: ListLedgersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLedgers(value: LedgerList): Self = StObject.set(x, "Ledgers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgersUndefined: Self = StObject.set(x, "Ledgers", js.undefined)
    
    @scala.inline
    def setLedgersVarargs(value: LedgerSummary*): Self = StObject.set(x, "Ledgers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
