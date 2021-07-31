package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourceDriftsInput extends StObject {
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[BoxedMaxResults] = js.undefined
  
  /**
    * A string that identifies the next page of stack resource drift results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * The name of the stack for which you want drift information.
    */
  var StackName: StackNameOrId
  
  /**
    * The resource drift status values to use as filters for the resource drift results returned.    DELETED: The resource differs from its expected template configuration in that the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected template values.    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatusFilters: js.UndefOr[typings.awsSdk.cloudformationMod.StackResourceDriftStatusFilters] = js.undefined
}
object DescribeStackResourceDriftsInput {
  
  @scala.inline
  def apply(StackName: StackNameOrId): DescribeStackResourceDriftsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsInput]
  }
  
  @scala.inline
  implicit class DescribeStackResourceDriftsInputMutableBuilder[Self <: DescribeStackResourceDriftsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: BoxedMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackResourceDriftStatusFilters(value: StackResourceDriftStatusFilters): Self = StObject.set(x, "StackResourceDriftStatusFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackResourceDriftStatusFiltersUndefined: Self = StObject.set(x, "StackResourceDriftStatusFilters", js.undefined)
    
    @scala.inline
    def setStackResourceDriftStatusFiltersVarargs(value: StackResourceDriftStatus*): Self = StObject.set(x, "StackResourceDriftStatusFilters", js.Array(value :_*))
  }
}
