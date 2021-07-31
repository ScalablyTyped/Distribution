package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancePatchesRequest extends StObject {
  
  /**
    * An array of structures. Each entry in the array is a structure containing a Key, Value combination. Valid values for Key are Classification | KBId | Severity | State.
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  
  /**
    * The ID of the instance whose patch state information should be retrieved.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId
  
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeInstancePatchesRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): DescribeInstancePatchesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchesRequest]
  }
  
  @scala.inline
  implicit class DescribeInstancePatchesRequestMutableBuilder[Self <: DescribeInstancePatchesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: PatchOrchestratorFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: PatchOrchestratorFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: PatchComplianceMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
