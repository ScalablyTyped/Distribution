package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkInstancesInput extends StObject {
  
  /**
    * The maximum number of results to include in the response.
    */
  var maxResults: js.UndefOr[ListSolNetworkInstancesInputMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSolNetworkInstancesInput {
  
  inline def apply(): ListSolNetworkInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolNetworkInstancesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkInstancesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSolNetworkInstancesInputMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
