package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsResponse extends StObject {
  
  /**
    * The summary list of the fleets.
    */
  var FleetSummaryList: js.UndefOr[typings.awsSdk.clientsWorklinkMod.FleetSummaryList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorklinkMod.NextToken] = js.undefined
}
object ListFleetsResponse {
  
  inline def apply(): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFleetsResponse] (val x: Self) extends AnyVal {
    
    inline def setFleetSummaryList(value: FleetSummaryList): Self = StObject.set(x, "FleetSummaryList", value.asInstanceOf[js.Any])
    
    inline def setFleetSummaryListUndefined: Self = StObject.set(x, "FleetSummaryList", js.undefined)
    
    inline def setFleetSummaryListVarargs(value: FleetSummary*): Self = StObject.set(x, "FleetSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
