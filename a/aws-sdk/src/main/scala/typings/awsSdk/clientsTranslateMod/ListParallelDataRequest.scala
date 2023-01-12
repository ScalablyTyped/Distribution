package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParallelDataRequest extends StObject {
  
  /**
    * The maximum number of parallel data resources returned for each request.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * A string that specifies the next page of results to return in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranslateMod.NextToken] = js.undefined
}
object ListParallelDataRequest {
  
  inline def apply(): ListParallelDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListParallelDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListParallelDataRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
