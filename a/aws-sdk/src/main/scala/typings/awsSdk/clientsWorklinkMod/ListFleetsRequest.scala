package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsRequest extends StObject {
  
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsWorklinkMod.MaxResults] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorklinkMod.NextToken] = js.undefined
}
object ListFleetsRequest {
  
  inline def apply(): ListFleetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsRequest]
  }
  
  extension [Self <: ListFleetsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
