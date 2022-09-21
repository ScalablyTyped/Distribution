package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJournalS3ExportsResponse extends StObject {
  
  /**
    * The array of journal export job descriptions for all ledgers that are associated with the current Amazon Web Services account and Region.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.undefined
  
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3Exports call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.undefined
}
object ListJournalS3ExportsResponse {
  
  inline def apply(): ListJournalS3ExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalS3ExportsResponse]
  }
  
  extension [Self <: ListJournalS3ExportsResponse](x: Self) {
    
    inline def setJournalS3Exports(value: JournalS3ExportList): Self = StObject.set(x, "JournalS3Exports", value.asInstanceOf[js.Any])
    
    inline def setJournalS3ExportsUndefined: Self = StObject.set(x, "JournalS3Exports", js.undefined)
    
    inline def setJournalS3ExportsVarargs(value: JournalS3ExportDescription*): Self = StObject.set(x, "JournalS3Exports", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
