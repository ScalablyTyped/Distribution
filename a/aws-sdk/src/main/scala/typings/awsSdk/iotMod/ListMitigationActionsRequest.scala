package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMitigationActionsRequest extends StObject {
  
  /**
    * Specify a value to limit the result to mitigation actions with a specific action type.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.native
  
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListMitigationActionsRequest {
  
  @scala.inline
  def apply(): ListMitigationActionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMitigationActionsRequest]
  }
  
  @scala.inline
  implicit class ListMitigationActionsRequestMutableBuilder[Self <: ListMitigationActionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: MitigationActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
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
