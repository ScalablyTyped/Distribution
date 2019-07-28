package typings.clndr.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targets extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[String] = js.undefined
  var nextButton: js.UndefOr[String] = js.undefined
  var nextYearButton: js.UndefOr[String] = js.undefined
  var previousButton: js.UndefOr[String] = js.undefined
  var previousYearButton: js.UndefOr[String] = js.undefined
  var todayButton: js.UndefOr[String] = js.undefined
}

object Targets {
  @scala.inline
  def apply(
    day: String = null,
    empty: String = null,
    nextButton: String = null,
    nextYearButton: String = null,
    previousButton: String = null,
    previousYearButton: String = null,
    todayButton: String = null
  ): Targets = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton)
    if (nextYearButton != null) __obj.updateDynamic("nextYearButton")(nextYearButton)
    if (previousButton != null) __obj.updateDynamic("previousButton")(previousButton)
    if (previousYearButton != null) __obj.updateDynamic("previousYearButton")(previousYearButton)
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton)
    __obj.asInstanceOf[Targets]
  }
}

