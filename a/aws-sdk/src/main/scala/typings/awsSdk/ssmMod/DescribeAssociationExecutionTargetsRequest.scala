package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssociationExecutionTargetsRequest extends StObject {
  
  /**
    * The association ID that includes the execution for which you want to view details.
    */
  var AssociationId: typings.awsSdk.ssmMod.AssociationId = js.native
  
  /**
    * The execution ID for which you want to view details.
    */
  var ExecutionId: AssociationExecutionId = js.native
  
  /**
    * Filters for the request. You can specify the following filters and values. Status (EQUAL) ResourceId (EQUAL) ResourceType (EQUAL)
    */
  var Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeAssociationExecutionTargetsRequest {
  
  @scala.inline
  def apply(AssociationId: AssociationId, ExecutionId: AssociationExecutionId): DescribeAssociationExecutionTargetsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ExecutionId = ExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
  }
  
  @scala.inline
  implicit class DescribeAssociationExecutionTargetsRequestMutableBuilder[Self <: DescribeAssociationExecutionTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionId(value: AssociationExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: AssociationExecutionTargetsFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: AssociationExecutionTargetsFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
