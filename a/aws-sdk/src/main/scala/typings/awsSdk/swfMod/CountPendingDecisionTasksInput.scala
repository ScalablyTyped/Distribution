package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountPendingDecisionTasksInput extends js.Object {
  /**
    * The name of the domain that contains the task list.
    */
  var domain: DomainName = js.native
  /**
    * The name of the task list.
    */
  var taskList: TaskList = js.native
}

object CountPendingDecisionTasksInput {
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): CountPendingDecisionTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPendingDecisionTasksInput]
  }
}

