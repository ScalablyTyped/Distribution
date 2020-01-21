package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionResult extends js.Object {
  /**
    * The action provider's external ID for the action execution.
    */
  var externalExecutionId: js.UndefOr[ExternalExecutionId] = js.native
  /**
    * The action provider's summary for the action execution.
    */
  var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.native
  /**
    * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is used when running the action.
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.native
}

object ActionExecutionResult {
  @scala.inline
  def apply(
    externalExecutionId: ExternalExecutionId = null,
    externalExecutionSummary: ExternalExecutionSummary = null,
    externalExecutionUrl: Url = null
  ): ActionExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId.asInstanceOf[js.Any])
    if (externalExecutionSummary != null) __obj.updateDynamic("externalExecutionSummary")(externalExecutionSummary.asInstanceOf[js.Any])
    if (externalExecutionUrl != null) __obj.updateDynamic("externalExecutionUrl")(externalExecutionUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecutionResult]
  }
}

