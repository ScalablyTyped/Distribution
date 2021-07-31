package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackSetOperationResultsInput extends StObject {
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.undefined
  
  /**
    * If the previous request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackSetOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * The ID of the stack set operation.
    */
  var OperationId: ClientRequestToken
  
  /**
    * The name or unique ID of the stack set that you want to get operation results for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName
}
object ListStackSetOperationResultsInput {
  
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): ListStackSetOperationResultsInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackSetOperationResultsInput]
  }
  
  @scala.inline
  implicit class ListStackSetOperationResultsInputMutableBuilder[Self <: ListStackSetOperationResultsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
