package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerFilter extends js.Object {
  /**
    * The status of an entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeBefore: js.UndefOr[Timestamp] = js.native
}

object EntityRecognizerFilter {
  @scala.inline
  def apply(Status: ModelStatus = null, SubmitTimeAfter: Timestamp = null, SubmitTimeBefore: Timestamp = null): EntityRecognizerFilter = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmitTimeAfter != null) __obj.updateDynamic("SubmitTimeAfter")(SubmitTimeAfter.asInstanceOf[js.Any])
    if (SubmitTimeBefore != null) __obj.updateDynamic("SubmitTimeBefore")(SubmitTimeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerFilter]
  }
}

