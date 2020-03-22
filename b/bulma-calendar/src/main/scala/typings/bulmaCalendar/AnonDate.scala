package typings.bulmaCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  /**
    * Date icon
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * Next button icon
    */
  var next: js.UndefOr[String] = js.undefined
  /**
    * Previous button icon
    */
  var previous: js.UndefOr[String] = js.undefined
  /**
    * Time icon
    */
  var time: js.UndefOr[String] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(date: String = null, next: String = null, previous: String = null, time: String = null): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

