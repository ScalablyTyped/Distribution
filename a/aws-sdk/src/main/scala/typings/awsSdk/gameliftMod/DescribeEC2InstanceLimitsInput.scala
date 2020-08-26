package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEC2InstanceLimitsInput extends js.Object {
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
    */
  var EC2InstanceType: js.UndefOr[typings.awsSdk.gameliftMod.EC2InstanceType] = js.native
}

object DescribeEC2InstanceLimitsInput {
  @scala.inline
  def apply(): DescribeEC2InstanceLimitsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEC2InstanceLimitsInput]
  }
  @scala.inline
  implicit class DescribeEC2InstanceLimitsInputOps[Self <: DescribeEC2InstanceLimitsInput] (val x: Self) extends AnyVal {
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
    def setEC2InstanceType(value: EC2InstanceType): Self = this.set("EC2InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2InstanceType: Self = this.set("EC2InstanceType", js.undefined)
  }
  
}

