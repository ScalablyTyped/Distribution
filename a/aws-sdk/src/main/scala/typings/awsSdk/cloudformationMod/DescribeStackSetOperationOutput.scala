package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetOperationOutput extends js.Object {
  /**
    * The specified stack set operation.
    */
  var StackSetOperation: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetOperation] = js.native
}

object DescribeStackSetOperationOutput {
  @scala.inline
  def apply(): DescribeStackSetOperationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOperationOutput]
  }
  @scala.inline
  implicit class DescribeStackSetOperationOutputOps[Self <: DescribeStackSetOperationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStackSetOperation(value: StackSetOperation): Self = this.set("StackSetOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackSetOperation: Self = this.set("StackSetOperation", js.undefined)
  }
  
}

