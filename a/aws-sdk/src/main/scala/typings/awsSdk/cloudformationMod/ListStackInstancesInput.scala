package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStackInstancesInput extends StObject {
  
  /**
    * The status that stack instances are filtered by.
    */
  var Filters: js.UndefOr[StackInstanceFilters] = js.native
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.native
  
  /**
    * If the previous request didn't return all of the remaining results, the response's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The name of the AWS account that you want to list stack instances for.
    */
  var StackInstanceAccount: js.UndefOr[Account] = js.native
  
  /**
    * The name of the Region where you want to list stack instances. 
    */
  var StackInstanceRegion: js.UndefOr[Region] = js.native
  
  /**
    * The name or unique ID of the stack set that you want to list stack instances for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object ListStackInstancesInput {
  
  @scala.inline
  def apply(StackSetName: StackSetName): ListStackInstancesInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesInput]
  }
  
  @scala.inline
  implicit class ListStackInstancesInputMutableBuilder[Self <: ListStackInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: StackInstanceFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: StackInstanceFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackInstanceAccount(value: Account): Self = StObject.set(x, "StackInstanceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackInstanceAccountUndefined: Self = StObject.set(x, "StackInstanceAccount", js.undefined)
    
    @scala.inline
    def setStackInstanceRegion(value: Region): Self = StObject.set(x, "StackInstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackInstanceRegionUndefined: Self = StObject.set(x, "StackInstanceRegion", js.undefined)
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
