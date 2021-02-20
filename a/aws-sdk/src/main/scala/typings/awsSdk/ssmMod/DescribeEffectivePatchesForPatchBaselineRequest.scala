package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEffectivePatchesForPatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to retrieve the effective patches for.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
  
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeEffectivePatchesForPatchBaselineRequest {
  
  @scala.inline
  def apply(BaselineId: BaselineId): DescribeEffectivePatchesForPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
  }
  
  @scala.inline
  implicit class DescribeEffectivePatchesForPatchBaselineRequestMutableBuilder[Self <: DescribeEffectivePatchesForPatchBaselineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: PatchBaselineMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
