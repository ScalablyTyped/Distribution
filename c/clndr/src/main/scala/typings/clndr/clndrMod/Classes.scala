package typings.clndr.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes extends js.Object {
  var adjacentMonth: js.UndefOr[String] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var inactive: js.UndefOr[String] = js.undefined
  var lastMonth: js.UndefOr[String] = js.undefined
  var nextMonth: js.UndefOr[String] = js.undefined
  var past: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
  var today: js.UndefOr[String] = js.undefined
}

object Classes {
  @scala.inline
  def apply(
    adjacentMonth: String = null,
    event: String = null,
    inactive: String = null,
    lastMonth: String = null,
    nextMonth: String = null,
    past: String = null,
    selected: String = null,
    today: String = null
  ): Classes = {
    val __obj = js.Dynamic.literal()
    if (adjacentMonth != null) __obj.updateDynamic("adjacentMonth")(adjacentMonth)
    if (event != null) __obj.updateDynamic("event")(event)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (lastMonth != null) __obj.updateDynamic("lastMonth")(lastMonth)
    if (nextMonth != null) __obj.updateDynamic("nextMonth")(nextMonth)
    if (past != null) __obj.updateDynamic("past")(past)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (today != null) __obj.updateDynamic("today")(today)
    __obj.asInstanceOf[Classes]
  }
}

