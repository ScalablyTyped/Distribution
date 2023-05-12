package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOpsItemEventsRequest extends StObject {
  
  /**
    * One or more OpsItem filters. Use a filter to return a more specific list of results. 
    */
  var Filters: js.UndefOr[OpsItemEventFilters] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[OpsItemEventMaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListOpsItemEventsRequest {
  
  inline def apply(): ListOpsItemEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpsItemEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOpsItemEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: OpsItemEventFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: OpsItemEventFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: OpsItemEventMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
