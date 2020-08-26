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
  def apply(): EntityRecognizerFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerFilter]
  }
  @scala.inline
  implicit class EntityRecognizerFilterOps[Self <: EntityRecognizerFilter] (val x: Self) extends AnyVal {
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
    def setStatus(value: ModelStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubmitTimeAfter(value: Timestamp): Self = this.set("SubmitTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitTimeAfter: Self = this.set("SubmitTimeAfter", js.undefined)
    @scala.inline
    def setSubmitTimeBefore(value: Timestamp): Self = this.set("SubmitTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitTimeBefore: Self = this.set("SubmitTimeBefore", js.undefined)
  }
  
}

