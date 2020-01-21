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
  def apply(
    count: Int | Double = null,
    distinctUsers: Int | Double = null,
    firstUtteredDate: Timestamp = null,
    lastUtteredDate: Timestamp = null,
    utteranceString: UtteranceString = null
  ): UtteranceData = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (distinctUsers != null) __obj.updateDynamic("distinctUsers")(distinctUsers.asInstanceOf[js.Any])
    if (firstUtteredDate != null) __obj.updateDynamic("firstUtteredDate")(firstUtteredDate.asInstanceOf[js.Any])
    if (lastUtteredDate != null) __obj.updateDynamic("lastUtteredDate")(lastUtteredDate.asInstanceOf[js.Any])
    if (utteranceString != null) __obj.updateDynamic("utteranceString")(utteranceString.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceData]
  }
}

