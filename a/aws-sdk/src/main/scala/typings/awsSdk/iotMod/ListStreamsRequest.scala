package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamsRequest extends StObject {
  
  /**
    * Set to true to return the list of streams in ascending order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  
  /**
    * The maximum number of results to return at a time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListStreamsRequest {
  
  @scala.inline
  def apply(): ListStreamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsRequest]
  }
  
  @scala.inline
  implicit class ListStreamsRequestMutableBuilder[Self <: ListStreamsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
