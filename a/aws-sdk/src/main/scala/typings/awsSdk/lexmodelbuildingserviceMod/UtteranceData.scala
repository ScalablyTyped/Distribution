package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtteranceData extends js.Object {
  /**
    * The number of times that the utterance was processed.
    */
  var count: js.UndefOr[Count] = js.native
  /**
    * The total number of individuals that used the utterance.
    */
  var distinctUsers: js.UndefOr[Count] = js.native
  /**
    * The date that the utterance was first recorded.
    */
  var firstUtteredDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date that the utterance was last recorded.
    */
  var lastUtteredDate: js.UndefOr[Timestamp] = js.native
  /**
    * The text that was entered by the user or the text representation of an audio clip.
    */
  var utteranceString: js.UndefOr[UtteranceString] = js.native
}

object UtteranceData {
  @scala.inline
  def apply(): UtteranceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceData]
  }
  @scala.inline
  implicit class UtteranceDataOps[Self <: UtteranceData] (val x: Self) extends AnyVal {
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
    def setCount(value: Count): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDistinctUsers(value: Count): Self = this.set("distinctUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistinctUsers: Self = this.set("distinctUsers", js.undefined)
    @scala.inline
    def setFirstUtteredDate(value: Timestamp): Self = this.set("firstUtteredDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstUtteredDate: Self = this.set("firstUtteredDate", js.undefined)
    @scala.inline
    def setLastUtteredDate(value: Timestamp): Self = this.set("lastUtteredDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUtteredDate: Self = this.set("lastUtteredDate", js.undefined)
    @scala.inline
    def setUtteranceString(value: UtteranceString): Self = this.set("utteranceString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtteranceString: Self = this.set("utteranceString", js.undefined)
  }
  
}

