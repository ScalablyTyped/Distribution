package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtteranceList extends js.Object {
  /**
    * The version of the bot that processed the list.
    */
  var botVersion: js.UndefOr[Version] = js.native
  /**
    * One or more UtteranceData objects that contain information about the utterances that have been made to a bot. The maximum number of object is 100.
    */
  var utterances: js.UndefOr[ListOfUtterance] = js.native
}

object UtteranceList {
  @scala.inline
  def apply(): UtteranceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceList]
  }
  @scala.inline
  implicit class UtteranceListOps[Self <: UtteranceList] (val x: Self) extends AnyVal {
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
    def setBotVersion(value: Version): Self = this.set("botVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotVersion: Self = this.set("botVersion", js.undefined)
    @scala.inline
    def setUtterancesVarargs(value: UtteranceData*): Self = this.set("utterances", js.Array(value :_*))
    @scala.inline
    def setUtterances(value: ListOfUtterance): Self = this.set("utterances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtterances: Self = this.set("utterances", js.undefined)
  }
  
}

