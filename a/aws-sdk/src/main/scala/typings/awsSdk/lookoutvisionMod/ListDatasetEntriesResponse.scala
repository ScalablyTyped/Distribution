package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetEntriesResponse extends StObject {
  
  /**
    * A list of the entries (JSON Lines) within the dataset.
    */
  var DatasetEntries: js.UndefOr[DatasetEntryList] = js.undefined
  
  /**
    * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent request to retrieve the next set ofdataset entries.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDatasetEntriesResponse {
  
  inline def apply(): ListDatasetEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetEntriesResponse]
  }
  
  extension [Self <: ListDatasetEntriesResponse](x: Self) {
    
    inline def setDatasetEntries(value: DatasetEntryList): Self = StObject.set(x, "DatasetEntries", value.asInstanceOf[js.Any])
    
    inline def setDatasetEntriesUndefined: Self = StObject.set(x, "DatasetEntries", js.undefined)
    
    inline def setDatasetEntriesVarargs(value: DatasetEntry*): Self = StObject.set(x, "DatasetEntries", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
