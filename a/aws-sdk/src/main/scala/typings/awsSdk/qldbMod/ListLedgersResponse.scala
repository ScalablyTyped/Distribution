package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLedgersResponse extends StObject {
  
  /**
    * The array of ledger summaries that are associated with the current Amazon Web Services account and Region.
    */
  var Ledgers: js.UndefOr[LedgerList] = js.undefined
  
  /**
    * A pagination token, indicating whether there are more results available:   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListLedgers call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.undefined
}
object ListLedgersResponse {
  
  inline def apply(): ListLedgersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLedgersResponse]
  }
  
  extension [Self <: ListLedgersResponse](x: Self) {
    
    inline def setLedgers(value: LedgerList): Self = StObject.set(x, "Ledgers", value.asInstanceOf[js.Any])
    
    inline def setLedgersUndefined: Self = StObject.set(x, "Ledgers", js.undefined)
    
    inline def setLedgersVarargs(value: LedgerSummary*): Self = StObject.set(x, "Ledgers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
