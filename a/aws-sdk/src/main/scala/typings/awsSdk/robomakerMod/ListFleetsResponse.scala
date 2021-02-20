package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFleetsResponse extends StObject {
  
  /**
    * A list of fleet details meeting the request criteria.
    */
  var fleetDetails: js.UndefOr[Fleets] = js.native
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListFleets again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListFleetsResponse {
  
  @scala.inline
  def apply(): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsResponse]
  }
  
  @scala.inline
  implicit class ListFleetsResponseMutableBuilder[Self <: ListFleetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetDetails(value: Fleets): Self = StObject.set(x, "fleetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetDetailsUndefined: Self = StObject.set(x, "fleetDetails", js.undefined)
    
    @scala.inline
    def setFleetDetailsVarargs(value: Fleet*): Self = StObject.set(x, "fleetDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
