package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssociationExecutionTargetsResult extends StObject {
  
  /**
    * Information about the execution.
    */
  var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeAssociationExecutionTargetsResult {
  
  @scala.inline
  def apply(): DescribeAssociationExecutionTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsResult]
  }
  
  @scala.inline
  implicit class DescribeAssociationExecutionTargetsResultMutableBuilder[Self <: DescribeAssociationExecutionTargetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationExecutionTargets(value: AssociationExecutionTargetsList): Self = StObject.set(x, "AssociationExecutionTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationExecutionTargetsUndefined: Self = StObject.set(x, "AssociationExecutionTargets", js.undefined)
    
    @scala.inline
    def setAssociationExecutionTargetsVarargs(value: AssociationExecutionTarget*): Self = StObject.set(x, "AssociationExecutionTargets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
