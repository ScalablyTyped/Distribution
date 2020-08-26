package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourcesInput extends js.Object {
  /**
    * The logical name of the resource as specified in the template. Default: There is no default value.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceId] = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. For example, for an Amazon Elastic Compute Cloud (EC2) instance, PhysicalResourceId corresponds to the InstanceId. You can pass the EC2 InstanceId to DescribeStackResources to find which stack the instance belongs to and what other resources are part of the stack. Required: Conditional. If you do not specify PhysicalResourceId, you must specify StackName. Default: There is no default value.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value. Required: Conditional. If you do not specify StackName, you must specify PhysicalResourceId.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.native
}

object DescribeStackResourcesInput {
  @scala.inline
  def apply(): DescribeStackResourcesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourcesInput]
  }
  @scala.inline
  implicit class DescribeStackResourcesInputOps[Self <: DescribeStackResourcesInput] (val x: Self) extends AnyVal {
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
    def setLogicalResourceId(value: LogicalResourceId): Self = this.set("LogicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalResourceId: Self = this.set("LogicalResourceId", js.undefined)
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = this.set("PhysicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalResourceId: Self = this.set("PhysicalResourceId", js.undefined)
    @scala.inline
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackName: Self = this.set("StackName", js.undefined)
  }
  
}

