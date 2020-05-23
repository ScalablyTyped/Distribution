package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionCount extends js.Object {
  /**
    * The number of workflow executions.
    */
  var count: Count = js.native
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.native
}

object WorkflowExecutionCount {
  @scala.inline
  def apply(count: Count, truncated: js.UndefOr[Truncated] = js.undefined): WorkflowExecutionCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionCount]
  }
}

