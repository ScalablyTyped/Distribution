package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancePatchStatesRequest extends StObject {
  
  /**
    * The ID of the instance whose patch state information should be retrieved.
    */
  var InstanceIds: InstanceIdList = js.native
  
  /**
    * The maximum number of instances to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeInstancePatchStatesRequest {
  
  @scala.inline
  def apply(InstanceIds: InstanceIdList): DescribeInstancePatchStatesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchStatesRequest]
  }
  
  @scala.inline
  implicit class DescribeInstancePatchStatesRequestMutableBuilder[Self <: DescribeInstancePatchStatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
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
