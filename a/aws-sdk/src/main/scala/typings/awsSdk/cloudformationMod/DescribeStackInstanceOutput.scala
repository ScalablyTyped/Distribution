package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackInstanceOutput extends js.Object {
  /**
    * The stack instance that matches the specified request parameters.
    */
  var StackInstance: js.UndefOr[typings.awsSdk.cloudformationMod.StackInstance] = js.native
}

object DescribeStackInstanceOutput {
  @scala.inline
  def apply(): DescribeStackInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackInstanceOutput]
  }
  @scala.inline
  implicit class DescribeStackInstanceOutputOps[Self <: DescribeStackInstanceOutput] (val x: Self) extends AnyVal {
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
    def setStackInstance(value: StackInstance): Self = this.set("StackInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackInstance: Self = this.set("StackInstance", js.undefined)
  }
  
}

