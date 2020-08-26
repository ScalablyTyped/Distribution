package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForTaskInput extends js.Object {
  /**
    * The public DNS name of the calling task runner.
    */
  var hostname: js.UndefOr[id] = js.native
  /**
    * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the instance using http://169.254.169.254/latest/meta-data/instance-id. For more information, see Instance Metadata in the Amazon Elastic Compute Cloud User Guide. Passing in this value proves that your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
    */
  var instanceIdentity: js.UndefOr[InstanceIdentity] = js.native
  /**
    * The type of task the task runner is configured to accept and process. The worker group is set as a field on objects in the pipeline when they are created. You can only specify a single value for workerGroup in the call to PollForTask. There are no wildcard values permitted in workerGroup; the string must be an exact, case-sensitive, match.
    */
  var workerGroup: String = js.native
}

object PollForTaskInput {
  @scala.inline
  def apply(workerGroup: String): PollForTaskInput = {
    val __obj = js.Dynamic.literal(workerGroup = workerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForTaskInput]
  }
  @scala.inline
  implicit class PollForTaskInputOps[Self <: PollForTaskInput] (val x: Self) extends AnyVal {
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
    def setWorkerGroup(value: String): Self = this.set("workerGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: id): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setInstanceIdentity(value: InstanceIdentity): Self = this.set("instanceIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIdentity: Self = this.set("instanceIdentity", js.undefined)
  }
  
}

