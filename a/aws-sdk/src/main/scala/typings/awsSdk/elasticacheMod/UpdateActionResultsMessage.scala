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
  def apply(): UpdateActionResultsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActionResultsMessage]
  }
  @scala.inline
  implicit class UpdateActionResultsMessageOps[Self <: UpdateActionResultsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProcessedUpdateActionsVarargs(value: ProcessedUpdateAction*): Self = this.set("ProcessedUpdateActions", js.Array(value :_*))
    @scala.inline
    def setProcessedUpdateActions(value: ProcessedUpdateActionList): Self = this.set("ProcessedUpdateActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessedUpdateActions: Self = this.set("ProcessedUpdateActions", js.undefined)
    @scala.inline
    def setUnprocessedUpdateActionsVarargs(value: UnprocessedUpdateAction*): Self = this.set("UnprocessedUpdateActions", js.Array(value :_*))
    @scala.inline
    def setUnprocessedUpdateActions(value: UnprocessedUpdateActionList): Self = this.set("UnprocessedUpdateActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedUpdateActions: Self = this.set("UnprocessedUpdateActions", js.undefined)
  }
  
}

