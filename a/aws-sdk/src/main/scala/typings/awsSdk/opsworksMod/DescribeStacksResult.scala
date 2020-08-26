package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksResult extends js.Object {
  /**
    * An array of Stack objects that describe the stacks.
    */
  var Stacks: js.UndefOr[typings.awsSdk.opsworksMod.Stacks] = js.native
}

object DescribeStacksResult {
  @scala.inline
  def apply(): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksResult]
  }
  @scala.inline
  implicit class DescribeStacksResultOps[Self <: DescribeStacksResult] (val x: Self) extends AnyVal {
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
    def setStacksVarargs(value: Stack*): Self = this.set("Stacks", js.Array(value :_*))
    @scala.inline
    def setStacks(value: Stacks): Self = this.set("Stacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacks: Self = this.set("Stacks", js.undefined)
  }
  
}

