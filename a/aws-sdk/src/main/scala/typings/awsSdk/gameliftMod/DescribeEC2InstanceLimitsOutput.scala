package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEC2InstanceLimitsOutput extends js.Object {
  /**
    * The maximum number of instances for the specified instance type.
    */
  var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.native
}

object DescribeEC2InstanceLimitsOutput {
  @scala.inline
  def apply(): DescribeEC2InstanceLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEC2InstanceLimitsOutput]
  }
  @scala.inline
  implicit class DescribeEC2InstanceLimitsOutputOps[Self <: DescribeEC2InstanceLimitsOutput] (val x: Self) extends AnyVal {
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
    def setEC2InstanceLimitsVarargs(value: EC2InstanceLimit*): Self = this.set("EC2InstanceLimits", js.Array(value :_*))
    @scala.inline
    def setEC2InstanceLimits(value: EC2InstanceLimitList): Self = this.set("EC2InstanceLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2InstanceLimits: Self = this.set("EC2InstanceLimits", js.undefined)
  }
  
}

