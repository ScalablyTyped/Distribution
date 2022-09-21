package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJournalKinesisStreamsForLedgerResponse extends StObject {
  
  /**
    *   If NextToken is empty, the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, more results are available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalKinesisStreamsForLedger call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.undefined
  
  /**
    * The array of QLDB journal stream descriptors that are associated with the given ledger.
    */
  var Streams: js.UndefOr[JournalKinesisStreamDescriptionList] = js.undefined
}
object ListJournalKinesisStreamsForLedgerResponse {
  
  inline def apply(): ListJournalKinesisStreamsForLedgerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalKinesisStreamsForLedgerResponse]
  }
  
  extension [Self <: ListJournalKinesisStreamsForLedgerResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreams(value: JournalKinesisStreamDescriptionList): Self = StObject.set(x, "Streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "Streams", js.undefined)
    
    inline def setStreamsVarargs(value: JournalKinesisStreamDescription*): Self = StObject.set(x, "Streams", js.Array(value*))
  }
}
