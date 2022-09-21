package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParallelDataResponse extends StObject {
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.undefined
  
  /**
    * The properties of the parallel data resources returned by this request.
    */
  var ParallelDataPropertiesList: js.UndefOr[typings.awsSdk.translateMod.ParallelDataPropertiesList] = js.undefined
}
object ListParallelDataResponse {
  
  inline def apply(): ListParallelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListParallelDataResponse]
  }
  
  extension [Self <: ListParallelDataResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParallelDataPropertiesList(value: ParallelDataPropertiesList): Self = StObject.set(x, "ParallelDataPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setParallelDataPropertiesListUndefined: Self = StObject.set(x, "ParallelDataPropertiesList", js.undefined)
    
    inline def setParallelDataPropertiesListVarargs(value: ParallelDataProperties*): Self = StObject.set(x, "ParallelDataPropertiesList", js.Array(value*))
  }
}
