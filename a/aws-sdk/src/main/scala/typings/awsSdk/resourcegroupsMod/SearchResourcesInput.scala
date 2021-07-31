package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesInput extends StObject {
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.resourcegroupsMod.MaxResults] = js.undefined
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value provided by a previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.resourcegroupsMod.NextToken] = js.undefined
  
  /**
    * The search query, using the same formats that are supported for resource group definition. For more information, see CreateGroup.
    */
  var ResourceQuery: typings.awsSdk.resourcegroupsMod.ResourceQuery
}
object SearchResourcesInput {
  
  @scala.inline
  def apply(ResourceQuery: ResourceQuery): SearchResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResourcesInput]
  }
  
  @scala.inline
  implicit class SearchResourcesInputMutableBuilder[Self <: SearchResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
  }
}
