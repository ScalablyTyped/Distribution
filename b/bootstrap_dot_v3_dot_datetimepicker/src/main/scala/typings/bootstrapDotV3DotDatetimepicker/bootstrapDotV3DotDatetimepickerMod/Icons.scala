package typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icons extends js.Object {
  /** default: "glyphicon glyphicon-trash" */
  var clear: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-remove" */
  var close: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-calendar" */
  var date: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-time" */
  var down: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-chevron-left" */
  var next: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-screenshot" */
  var previous: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-chevron-right" */
  var time: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-chevron-down" */
  var today: js.UndefOr[String] = js.undefined
  /** default: "glyphicon glyphicon-chevron-up" */
  var up: js.UndefOr[String] = js.undefined
}

object Icons {
  @scala.inline
  def apply(
    clear: String = null,
    close: String = null,
    date: String = null,
    down: String = null,
    next: String = null,
    previous: String = null,
    time: String = null,
    today: String = null,
    up: String = null
  ): Icons = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons]
  }
}

