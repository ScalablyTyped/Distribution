package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryTriggerExecutionFailure extends js.Object {
  /**
    * Message information about the trigger that did not run.
    */
  var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.native
  /**
    * The name of the trigger that did not run.
    */
  var trigger: js.UndefOr[RepositoryTriggerName] = js.native
}

object RepositoryTriggerExecutionFailure {
  @scala.inline
  def apply(): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
  @scala.inline
  implicit class RepositoryTriggerExecutionFailureOps[Self <: RepositoryTriggerExecutionFailure] (val x: Self) extends AnyVal {
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
    def setFailureMessage(value: RepositoryTriggerExecutionFailureMessage): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureMessage: Self = this.set("failureMessage", js.undefined)
    @scala.inline
    def setTrigger(value: RepositoryTriggerName): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

