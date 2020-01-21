package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggerExecutionFailure extends js.Object {
  /**
    * <p>Additional message information about the trigger that did not run.</p>
    */
  var failureMessage: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the trigger that did not run.</p>
    */
  var trigger: js.UndefOr[String] = js.undefined
}

object RepositoryTriggerExecutionFailure {
  @scala.inline
  def apply(failureMessage: String = null, trigger: String = null): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
}

