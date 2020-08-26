package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUtterancesViewResponse extends js.Object {
  /**
    * The name of the bot for which utterance information was returned.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * An array of UtteranceList objects, each containing a list of UtteranceData objects describing the utterances that were processed by your bot. The response contains a maximum of 100 UtteranceData objects for each version. Amazon Lex returns the most frequent utterances received by the bot in the last 15 days.
    */
  var utterances: js.UndefOr[ListsOfUtterances] = js.native
}

object GetUtterancesViewResponse {
  @scala.inline
  def apply(): GetUtterancesViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUtterancesViewResponse]
  }
  @scala.inline
  implicit class GetUtterancesViewResponseOps[Self <: GetUtterancesViewResponse] (val x: Self) extends AnyVal {
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
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotName: Self = this.set("botName", js.undefined)
    @scala.inline
    def setUtterancesVarargs(value: UtteranceList*): Self = this.set("utterances", js.Array(value :_*))
    @scala.inline
    def setUtterances(value: ListsOfUtterances): Self = this.set("utterances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtterances: Self = this.set("utterances", js.undefined)
  }
  
}

