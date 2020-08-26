package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalResourceInput extends js.Object {
  /**
    * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * The stack name or unique stack ID that includes the resource that you want to signal.
    */
  var StackName: StackNameOrId = js.native
  /**
    * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to immediately fail the stack creation or update.
    */
  var Status: ResourceSignalStatus = js.native
  /**
    * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a wait condition), each signal requires a different unique ID.
    */
  var UniqueId: ResourceSignalUniqueId = js.native
}

object SignalResourceInput {
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    StackName: StackNameOrId,
    Status: ResourceSignalStatus,
    UniqueId: ResourceSignalUniqueId
  ): SignalResourceInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UniqueId = UniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalResourceInput]
  }
  @scala.inline
  implicit class SignalResourceInputOps[Self <: SignalResourceInput] (val x: Self) extends AnyVal {
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
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ResourceSignalStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueId(value: ResourceSignalUniqueId): Self = this.set("UniqueId", value.asInstanceOf[js.Any])
  }
  
}

