package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateActionResultsMessage extends js.Object {
  /**
    * Update actions that have been processed successfully
    */
  var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList] = js.native
  /**
    * Update actions that haven't been processed successfully
    */
  var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList] = js.native
}

object UpdateActionResultsMessage {
  @scala.inline
  def apply(
    ProcessedUpdateActions: ProcessedUpdateActionList = null,
    UnprocessedUpdateActions: UnprocessedUpdateActionList = null
  ): UpdateActionResultsMessage = {
    val __obj = js.Dynamic.literal()
    if (ProcessedUpdateActions != null) __obj.updateDynamic("ProcessedUpdateActions")(ProcessedUpdateActions.asInstanceOf[js.Any])
    if (UnprocessedUpdateActions != null) __obj.updateDynamic("UnprocessedUpdateActions")(UnprocessedUpdateActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionResultsMessage]
  }
}

