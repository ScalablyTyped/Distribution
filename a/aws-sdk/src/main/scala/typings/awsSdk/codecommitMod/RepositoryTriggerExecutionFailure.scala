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
  def apply(
    failureMessage: RepositoryTriggerExecutionFailureMessage = null,
    trigger: RepositoryTriggerName = null
  ): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
}

