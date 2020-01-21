package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSummaryResult extends js.Object {
  /**
    * A StackSummary object that contains the results.
    */
  var StackSummary: js.UndefOr[typings.awsSdk.opsworksMod.StackSummary] = js.native
}

object DescribeStackSummaryResult {
  @scala.inline
  def apply(StackSummary: StackSummary = null): DescribeStackSummaryResult = {
    val __obj = js.Dynamic.literal()
    if (StackSummary != null) __obj.updateDynamic("StackSummary")(StackSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSummaryResult]
  }
}

