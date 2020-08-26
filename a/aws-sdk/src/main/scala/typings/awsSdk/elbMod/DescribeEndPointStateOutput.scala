package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndPointStateOutput extends js.Object {
  /**
    * Information about the health of the instances.
    */
  var InstanceStates: js.UndefOr[typings.awsSdk.elbMod.InstanceStates] = js.native
}

object DescribeEndPointStateOutput {
  @scala.inline
  def apply(): DescribeEndPointStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndPointStateOutput]
  }
  @scala.inline
  implicit class DescribeEndPointStateOutputOps[Self <: DescribeEndPointStateOutput] (val x: Self) extends AnyVal {
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
    def setInstanceStatesVarargs(value: InstanceState*): Self = this.set("InstanceStates", js.Array(value :_*))
    @scala.inline
    def setInstanceStates(value: InstanceStates): Self = this.set("InstanceStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceStates: Self = this.set("InstanceStates", js.undefined)
  }
  
}

