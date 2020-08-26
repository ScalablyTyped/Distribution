package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForActivityTaskInput extends js.Object {
  /**
    * The name of the domain that contains the task lists being polled.
    */
  var domain: DomainName = js.native
  /**
    * Identity of the worker making the request, recorded in the ActivityTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.native
  /**
    * Specifies the task list to poll for activity tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var taskList: TaskList = js.native
}

object PollForActivityTaskInput {
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): PollForActivityTaskInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForActivityTaskInput]
  }
  @scala.inline
  implicit class PollForActivityTaskInputOps[Self <: PollForActivityTaskInput] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
  }
  
}

