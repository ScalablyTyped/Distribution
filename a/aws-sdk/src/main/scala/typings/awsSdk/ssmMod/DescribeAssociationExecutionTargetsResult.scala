package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssociationExecutionTargetsResult extends js.Object {
  
  /**
    * Information about the execution.
    */
  var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeAssociationExecutionTargetsResult {
  
  @scala.inline
  def apply(): DescribeAssociationExecutionTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsResult]
  }
  
  @scala.inline
  implicit class DescribeAssociationExecutionTargetsResultOps[Self <: DescribeAssociationExecutionTargetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociationExecutionTargetsVarargs(value: AssociationExecutionTarget*): Self = this.set("AssociationExecutionTargets", js.Array(value :_*))
    
    @scala.inline
    def setAssociationExecutionTargets(value: AssociationExecutionTargetsList): Self = this.set("AssociationExecutionTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationExecutionTargets: Self = this.set("AssociationExecutionTargets", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
