package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationExecutionsResult extends js.Object {
  /**
    * A list of the executions for the specified association ID.
    */
  var AssociationExecutions: js.UndefOr[AssociationExecutionsList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeAssociationExecutionsResult {
  @scala.inline
  def apply(): DescribeAssociationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationExecutionsResult]
  }
  @scala.inline
  implicit class DescribeAssociationExecutionsResultOps[Self <: DescribeAssociationExecutionsResult] (val x: Self) extends AnyVal {
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
    def setAssociationExecutionsVarargs(value: AssociationExecution*): Self = this.set("AssociationExecutions", js.Array(value :_*))
    @scala.inline
    def setAssociationExecutions(value: AssociationExecutionsList): Self = this.set("AssociationExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationExecutions: Self = this.set("AssociationExecutions", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

