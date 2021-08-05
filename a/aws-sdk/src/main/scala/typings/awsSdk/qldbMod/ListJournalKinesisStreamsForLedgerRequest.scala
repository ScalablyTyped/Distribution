package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJournalKinesisStreamsForLedgerRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName
  
  /**
    * The maximum number of results to return in a single ListJournalKinesisStreamsForLedger request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typings.awsSdk.qldbMod.MaxResults] = js.undefined
  
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalKinesisStreamsForLedger call, you should use that value as input here.
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.undefined
}
object ListJournalKinesisStreamsForLedgerRequest {
  
  inline def apply(LedgerName: LedgerName): ListJournalKinesisStreamsForLedgerRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJournalKinesisStreamsForLedgerRequest]
  }
  
  extension [Self <: ListJournalKinesisStreamsForLedgerRequest](x: Self) {
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
