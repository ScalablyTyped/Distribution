package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targets extends js.Object {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var nextButton: js.UndefOr[java.lang.String] = js.undefined
  var nextYearButton: js.UndefOr[java.lang.String] = js.undefined
  var previousButton: js.UndefOr[java.lang.String] = js.undefined
  var previousYearButton: js.UndefOr[java.lang.String] = js.undefined
  var todayButton: js.UndefOr[java.lang.String] = js.undefined
}

object Targets {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    empty: java.lang.String = null,
    nextButton: java.lang.String = null,
    nextYearButton: java.lang.String = null,
    previousButton: java.lang.String = null,
    previousYearButton: java.lang.String = null,
    todayButton: java.lang.String = null
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

