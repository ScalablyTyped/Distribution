package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFleetsResponse extends StObject {
  
  /**
    * The summary list of the fleets.
    */
  var FleetSummaryList: js.UndefOr[typings.awsSdk.worklinkMod.FleetSummaryList] = js.native
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.native
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
    def setFleetSummaryList(value: FleetSummaryList): Self = StObject.set(x, "FleetSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetSummaryListUndefined: Self = StObject.set(x, "FleetSummaryList", js.undefined)
    
    @scala.inline
    def setFleetSummaryListVarargs(value: FleetSummary*): Self = StObject.set(x, "FleetSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
