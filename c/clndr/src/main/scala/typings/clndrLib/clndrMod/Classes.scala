package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes extends js.Object {
  var adjacentMonth: js.UndefOr[java.lang.String] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var inactive: js.UndefOr[java.lang.String] = js.undefined
  var lastMonth: js.UndefOr[java.lang.String] = js.undefined
  var nextMonth: js.UndefOr[java.lang.String] = js.undefined
  var past: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
  var today: js.UndefOr[java.lang.String] = js.undefined
}

object Classes {
  @scala.inline
  def apply(
    adjacentMonth: java.lang.String = null,
    event: java.lang.String = null,
    inactive: java.lang.String = null,
    lastMonth: java.lang.String = null,
    nextMonth: java.lang.String = null,
    past: java.lang.String = null,
    selected: java.lang.String = null,
    today: java.lang.String = null
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

