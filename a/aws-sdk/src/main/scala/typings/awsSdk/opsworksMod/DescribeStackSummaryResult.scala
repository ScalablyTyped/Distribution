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
  def apply(): DescribeStackSummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSummaryResult]
  }
  @scala.inline
  implicit class DescribeStackSummaryResultOps[Self <: DescribeStackSummaryResult] (val x: Self) extends AnyVal {
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
    def setStackSummary(value: StackSummary): Self = this.set("StackSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackSummary: Self = this.set("StackSummary", js.undefined)
  }
  
}

