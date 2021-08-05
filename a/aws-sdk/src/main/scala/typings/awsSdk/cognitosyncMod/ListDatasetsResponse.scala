package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * Number of datasets returned.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * A set of datasets.
    */
  var Datasets: js.UndefOr[DatasetList] = js.undefined
  
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDatasetsResponse {
  
  inline def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  extension [Self <: ListDatasetsResponse](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setDatasets(value: DatasetList): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "Datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: Dataset*): Self = StObject.set(x, "Datasets", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
