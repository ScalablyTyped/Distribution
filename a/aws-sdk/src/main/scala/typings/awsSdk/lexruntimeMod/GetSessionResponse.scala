package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionResponse extends js.Object {
  /**
    * Describes the current state of the bot.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  /**
    * An array of information about the intents used in the session. The array can contain a maximum of three summaries. If more than three intents are used in the session, the recentIntentSummaryView operation contains information about the last three intents used. If you set the checkpointLabelFilter parameter in the request, the array contains only the intents with the specified label.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.native
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
}

object GetSessionResponse {
  @scala.inline
  def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  @scala.inline
  implicit class GetSessionResponseOps[Self <: GetSessionResponse] (val x: Self) extends AnyVal {
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
    def setDialogAction(value: DialogAction): Self = this.set("dialogAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogAction: Self = this.set("dialogAction", js.undefined)
    @scala.inline
    def setRecentIntentSummaryViewVarargs(value: IntentSummary*): Self = this.set("recentIntentSummaryView", js.Array(value :_*))
    @scala.inline
    def setRecentIntentSummaryView(value: IntentSummaryList): Self = this.set("recentIntentSummaryView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecentIntentSummaryView: Self = this.set("recentIntentSummaryView", js.undefined)
    @scala.inline
    def setSessionAttributes(value: StringMap): Self = this.set("sessionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionAttributes: Self = this.set("sessionAttributes", js.undefined)
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
  }
  
}

