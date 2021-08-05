package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSetsResponse extends StObject {
  
  /**
    * The data set objects listed by the request.
    */
  var DataSets: js.UndefOr[ListOfDataSetEntry] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.undefined
}
object ListDataSetsResponse {
  
  inline def apply(): ListDataSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetsResponse]
  }
  
  extension [Self <: ListDataSetsResponse](x: Self) {
    
    inline def setDataSets(value: ListOfDataSetEntry): Self = StObject.set(x, "DataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "DataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: DataSetEntry*): Self = StObject.set(x, "DataSets", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
